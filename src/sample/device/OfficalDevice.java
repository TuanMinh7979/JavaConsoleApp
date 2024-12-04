package sample.device;

public class OfficalDevice {
    protected static int autoId = 1;
    protected int id;
    public boolean isUsing;
    protected String name;

    protected OfficalDevice() {
        this.id = autoId++;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setId(int id) {
        this.id = id;
    }


    public boolean isUsing() {
        return isUsing;
    }

    public void setUsing(boolean using) {
        isUsing = using;
    }

    public void work(int mode) {

    }


}
