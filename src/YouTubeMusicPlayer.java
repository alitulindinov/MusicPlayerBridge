public class YouTubeMusicPlayer extends MusicPlayer {

    public YouTubeMusicPlayer(AudioDevice audioDevice) {
        super(audioDevice);
    }

    @Override
    public void play(String song) {
        System.out.println("YouTube Music:");
        audioDevice.playSound(song);
    }
}