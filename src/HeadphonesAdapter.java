public class HeadphonesAdapter implements AudioDevice {
    private final Smartphone smartphone;
    public HeadphonesAdapter(Smartphone smartphone){
        this.smartphone = smartphone;
    }
    @Override
    public void listenToMusic() {
        smartphone.playMusic();
    }
}