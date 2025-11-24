# Humanness Voice & Environment Assessment App

An Android application built as part of the **Humanness by Josh Talks – Android Intern Assignment
**.  
The app evaluates a user's **voice, environment noise, and description skills** through multiple
guided tasks.

---

## 📱 Features

### 1. Noise Test (Ambient Environment Check)

- First screen the user sees.
- Records a short sample of ambient sound using the microphone.
- Calculates an approximate **average noise level in dB** (decibels).
- If **average noise < 45 dB → “Good to proceed”** and user can move to task screen.
- If **average noise ≥ 45 dB → asks user to move to a quieter place** and retest.

### 2. Text Reading Task

- Fetches a **random quote** from DummyJSON:
    - `https://dummyjson.com/products`
- Shows the quote and author on screen.
- User must **long-press / hold the mic button** to record their reading.
- Validates that the recording duration is between **10–20 seconds**.
- User must tick self-checks:
    - ✅ No background noise
    - ✅ Pronunciation is clear
    - ✅ No mistakes while reading

### 3. Image Description Task

- Fetches a **random product** from DummyJSON:
    - `https://dummyjson.com/products`
- Uses **product image, title, and description**:
    - Shows image from `images[0]` or falls back to `thumbnail`.
- User looks at the image and **describes what they see**.
- Long-press recording (10–20 seconds) with self-checks:
    - ✅ No background noise
    - ✅ Clearly described main details
    - ✅ No mistakes / repeats

### 4. Photo Capture Task

- Opens device **camera** using `TakePicturePreview`.
- Captures a photo and shows it in the UI.
- User can optionally add a **short text description**.
- User records an audio description (10–20 seconds) of the captured photo.
- Saves:
    - Photo (local file path)
    - Audio file path
    - Optional text description
    - Duration & timestamp

### 5. Task History with Audio Player

- Shows **all completed tasks** (noise test, text reading, image description, photo capture).
- Each item shows:
    - Task type
    - Text / description
    - Image (if any)
    - Timestamp
- Includes a **mini audio player** for each recording:
    - ▶ / ⏸ play–pause
    - Slider like a media player (progress bar)
    - Shows **elapsed time** and **total duration**.

---
