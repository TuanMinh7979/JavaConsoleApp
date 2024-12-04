package sample.device;

public class Printer extends OfficalDevice {

    public Printer() {
        super();
        this.setName("Printer");
    }

    @Override
    public void work(int mode) {
        switch (mode) {
            case 1:
                workByMode1();
                break;
            case 2:
                workByMode2();
                break;
            case 3:
                workByMode3();
                break;
            default:
                break;
        }
    }

    private void workByMode1() {
        System.out.println("Printer Working in mode 1");
    }

    private void workByMode2() {
        System.out.println("Printer Working in mode 2");
    }

    private void workByMode3() {
        System.out.println("Printer Working in mode 3");
    }
}
