# Music Player Bridge

## Project Description

This project demonstrates the Bridge design pattern in Java.

The program uses different music players and audio devices. It allows changing audio devices without changing the music player classes.

## Bridge Pattern

### Abstraction
- `MusicPlayer`

### Refined Abstraction
- `SpotifyPlayer`
- `YouTubeMusicPlayer`

### Implementor
- `AudioDevice`

### Concrete Implementors
- `PhoneSpeaker`
- `BluetoothSpeaker`

## How It Works

The `MusicPlayer` class contains a reference to the `AudioDevice` interface.

Different music players can use different audio devices.

The `setAudioDevice()` method allows switching devices at runtime.

## Clean Code Principles

1. **Meaningful Names** — class and method names clearly describe their responsibilities.
2. **Single Responsibility** — each class has one main responsibility.
3. **Small Methods** — methods perform simple and focused operations.
4. **Loose Coupling** — the music player depends on the `AudioDevice` interface instead of concrete device classes.
5. **Open/Closed Principle** — new audio devices can be added without changing the `MusicPlayer` class.

## Example Output

```text
Playing on phone:
Spotify:
Playing Blinding Lights on phone speaker.

Switching to Bluetooth:
Spotify:
Playing Blinding Lights on Bluetooth speaker.

YouTube Music on phone:
YouTube Music:
Playing Shape of You on phone speaker.
```

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub