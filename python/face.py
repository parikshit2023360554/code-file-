# face_reading.py
import cv2
import dlib
import imutils
from imutils import face_utils

# Load the face detector and facial landmark predictor
detector = dlib.get_frontal_face_detector()
import dlib

# Ensure the correct path is used
predictor = dlib.shape_predictor("/mnt/data/shape_predictor_68_face_landmarks.dat")

# Initialize video capture (using webcam)
cap = cv2.VideoCapture(0)

while True:
    # Capture frame-by-frame
    ret, frame = cap.read()
    if not ret:
        break

    # Resize the frame for faster processing
    frame = imutils.resize(frame, width=800)

    # Convert frame to grayscale (required by dlib)
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    # Detect faces in the grayscale frame
    faces = detector(gray)

    for face in faces:
        # Get the landmarks/parts for the face
        shape = predictor(gray, face)
        shape = face_utils.shape_to_np(shape)

        # Draw a rectangle around the face
        (x, y, w, h) = face_utils.rect_to_bb(face)
        cv2.rectangle(frame, (x, y), (x + w, y + h), (0, 255, 0), 2)

        # Draw the facial landmarks on the face
        for (x, y) in shape:
            cv2.circle(frame, (x, y), 2, (0, 0, 255), -1)

    # Display the resulting frame
    cv2.imshow("Face Reading", frame)

    # Break the loop on 'q' key press
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release the capture and close windows
cap.release()
cv2.destroyAllWindows()
