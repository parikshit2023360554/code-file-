from pynput import keyboard
import pyautogui
import time

def on_activate():
    print("🎯 Hotkey pressed!")
    time.sleep(1)
    pyautogui.write("✅ Autotyping from Python!", interval=0.05)

def for_canonical(f):
    return lambda k: f(l.canonical(k))

hotkey = keyboard.HotKey(
    keyboard.HotKey.parse('<ctrl>+<alt>+a'),
    on_activate
)

print("🚀 Script started")

with keyboard.Listener(
    on_press=for_canonical(hotkey.press),
    on_release=for_canonical(hotkey.release)
) as l:
    print("🎧 Listening for Ctrl+Option+A …")
    l.join()