package sample;

import sample.device.OfficalDevice;
import sample.device.Photocopier;
import sample.permission.CustomerRole;
import sample.permission.IPermissionChecker;
import sample.permission.OfficalDevicePermissionChecker;

import java.io.Serializable;

public class Customer extends Person {
    private IPermissionChecker checker;

    private String type;

    public Customer(String name) {
        super(name);
        updateRole();

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

    @Override
    protected void updateRole() {
        this.role = new CustomerRole();
    }

    @Override
    protected void sayThankyou() {
        System.out.println("Thank you!");
        System.out.println("===== Have a nice day! customer " + name + " (^_^) =====");
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
    public void useDevice(OfficalDevice device) throws Exception {
        checker = new OfficalDevicePermissionChecker();
        boolean isCanUse = checker.checkWithPermissionsAndClassName(this.getRole().getPermissionList(), device.getClass());
        if (!isCanUse) {
            throw new Exception("Bạn không thể truy cập thiết bị này");
        }
        device.setUsing(true);
        System.out.println("=====Customer " + name + " is using " + device.getName() + device.getId() + "=====");
        device.work(0);

    }
}
