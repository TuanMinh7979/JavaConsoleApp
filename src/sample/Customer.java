package sample;

import sample.device.Photocopier;

public class Customer extends Person implements ICustomerDevicePermission {
    private String type;


    public Customer(String name) {
        super(name);
    }

    public Customer(String name, String address, String email, String phone, String type) {
        super(name, address, email, phone);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                '}';
    }


    public void displayInformationWithTypeToScreen() {
        super.displayInformationToScreen();
        this.toString();
    }

    //    setter getter;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public void usePhotocopier(Photocopier d) {
        d.setUsing(true);
        System.out.println("Customer " + this.getName() + " is using a photocopier Ph"+d.getId());

    }
}
