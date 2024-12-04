package sample;

import sample.device.OfficalDevice;
import sample.permission.EmployeeRole;
import sample.permission.IPermissionChecker;
import sample.permission.OfficalDevicePermissionChecker;

public class Employee extends Person {
    private IPermissionChecker checker;
    private String degree;

    public Employee(String name) {
        super(name);
        updateRole();
    }

    public Employee(String name, String address, String email, String phone, String degree) {
        super(name, address, email, phone);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "degree='" + degree + '\'' +
                '}';
    }

    @Override
    protected void updateRole() {
        this.role = new EmployeeRole();
    }

    @Override
    protected void sayThankyou() {

        System.out.println("Thank you!");
        System.out.println("===== Have a nice day! employee " + name + " (^_^) =====");
    }

    public void displayInformationWithDegreeToScreen() {
        super.displayInformationToScreen();
        this.toString();
    }

    //    setter getter;
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void useDevice(OfficalDevice device) throws Exception {
        checker = new OfficalDevicePermissionChecker();
        boolean isCanUse = checker.checkWithPermissionsAndClassName(this.getRole().getPermissionList(), device.getClass());
        if (!isCanUse) {
            throw new Exception("Bạn không thể truy cập thiết bị này");
        }
        device.setUsing(true);
        System.out.println("=====Employee " + name + " is using " + device.getName() + device.getId() + "=====");
        device.work(0);
    }
}
