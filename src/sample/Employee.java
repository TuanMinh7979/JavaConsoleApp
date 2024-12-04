package sample;

import sample.device.FaxMachine;
import sample.device.Photocopier;
import sample.device.Printer;

public class Employee extends Person implements IEmployeeDevicePermission {
    private String degree;


    public Employee(String name) {
        super(name);
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
    public void useFaxMachine(FaxMachine d) {

        d.setUsing(true);
        System.out.println("Employee " + this.getName() + " is using a fax machine F"+d.getId());
    }

    @Override
    public void usePrinter(Printer d) {
        d.setUsing(true);
        System.out.println("Employee " + this.getName() + " is using a printer P"+ d.getId());
    }

    @Override
    public void usePhotocopier(Photocopier d) {
        d.setUsing(true);
        System.out.println("Employee " + this.getName() + " is using a photocopier Ph"+d.getId());
    }


}
