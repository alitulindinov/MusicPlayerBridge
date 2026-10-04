public class PhoneSpeaker implements AudioDevice {

    @Override
    public void playSound(String song) {
        System.out.println("Playing " + song + " on phone speaker.");
    }
}