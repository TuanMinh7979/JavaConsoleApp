package sample.device;

public class OfficalDevice {
    public OfficalDevice() {
        this.isUsing = false;
    }

    private boolean isUsing;
    public boolean isUsing() {
        return isUsing;
    }
    public void setUsing(boolean using) {
        isUsing = using;
    }
}
