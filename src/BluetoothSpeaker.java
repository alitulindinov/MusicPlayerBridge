public class BluetoothSpeaker implements AudioDevice {

    @Override
    public void playSound(String song) {
        System.out.println("Playing " + song + " on Bluetooth speaker.");
    }
}