package sample.device;

public class Photocopier extends OfficalDevice {
    private static int autoId = 1;
    private int id;
    

    public Photocopier() {
        super();
        this.id = autoId++;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
