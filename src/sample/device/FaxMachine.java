package sample.device;

public class FaxMachine extends OfficalDevice {
    private static int autoId = 1;
    private int id;


    public FaxMachine() {
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
