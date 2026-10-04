public class Main {

    public static void main(String[] args) {

        AudioDevice phone = new PhoneSpeaker();
        AudioDevice bluetooth = new BluetoothSpeaker();

        MusicPlayer spotify = new SpotifyPlayer(phone);

        System.out.println("Playing on phone:");
        spotify.play("Blinding Lights");

        System.out.println();

        System.out.println("Switching to Bluetooth:");
        spotify.setAudioDevice(bluetooth);
        spotify.play("Blinding Lights");

        System.out.println();

        MusicPlayer youtube = new YouTubeMusicPlayer(phone);

        System.out.println("YouTube Music on phone:");
        youtube.play("Shape of You");
    }
}