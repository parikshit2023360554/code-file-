from pynput import keyboard
import pyautogui

# 📝 Paste your message here
message = """if (s.length() != t.length()) return false;

		Map<Character, Character> mapST = new HashMap<>();
		Map<Character, Character> mapTS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (mapST.containsKey(c1)) {
				if (mapST.get(c1) != c2) return false;
			} else {
				mapST.put(c1, c2);
			}

			if (mapTS.containsKey(c2)) {
				if (mapTS.get(c2) != c1) return false;
			} else {
				mapTS.put(c2, c1);
			}
		}
		return true;"""

# Function to run when hotkey is pressed
def on_activate():
    print("Hotkey Option + C + R activated! Typing...")
    pyautogui.write(message, interval=0.05)

# Required for hotkey detection
def for_canonical(f):
    return lambda k: f(l.canonical(k))

# 🎯 Hotkey: Option + C + R
hotkey = keyboard.HotKey(
    keyboard.HotKey.parse('<ctrl>+<alt>+a'),
    on_activate
)

# Start listening for the hotkey
with keyboard.Listener(
        on_press=for_canonical(hotkey.press),
        on_release=for_canonical(hotkey.release)) as l:
    print("Listening for Option + C + R... You can now switch to any app and use the hotkey.")
    l.join()