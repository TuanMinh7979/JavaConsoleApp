package sample;

import sample.device.OfficalDevice;
import sample.permission.OfficalDevicePermissionChecker;
import sample.permission.Permission;
import sample.permission.Role;

import java.util.List;

public abstract class Person implements HumanOfficalBehavior {
    protected String name;
    protected String address;
    protected String email;
    protected String phone;
    protected Role role;

    public Person() {
    }

    public Person(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);

    }

    public Person(String name, String address, String email, String phone) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    protected void displayInformationToScreen() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    //getter setter
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected abstract void updateRole();

    protected abstract void sayThankyou();

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void useDevice(OfficalDevice device) throws Exception {

    }
}
