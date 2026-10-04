public class SpotifyPlayer extends MusicPlayer {

    public SpotifyPlayer(AudioDevice audioDevice) {
        super(audioDevice);
    }

    @Override
    public void play(String song) {
        System.out.println("Spotify:");
        audioDevice.playSound(song);
    }
}