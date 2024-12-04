package sample.device;

public class Printer extends OfficalDevice{
    private static int autoId = 1;
    private int id;


    public Printer() {
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
