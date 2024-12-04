package sample.device;

public class OfficalDevice {
    protected static int autoId = 1;
    protected int id;
    protected boolean isUsing;
    protected static String name;

    public OfficalDevice() {
        this.id = autoId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isUsing() {
        return isUsing;
    }
    public void setUsing(boolean using) {
        isUsing = using;
    }
}
