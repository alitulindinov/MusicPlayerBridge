public abstract class MusicPlayer {

    protected AudioDevice audioDevice;

    public MusicPlayer(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    public void setAudioDevice(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    public abstract void play(String song);
}