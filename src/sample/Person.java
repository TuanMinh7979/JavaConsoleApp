package sample;

public class Person {
    private String name;
    private String address;
    private String email;
    private String phone;

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


}
