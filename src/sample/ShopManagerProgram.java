package sample;

import sample.device.FaxMachine;
import sample.device.OfficalDevice;
import sample.device.Photocopier;
import sample.device.Printer;
import sample.resources.FaxMachineResource;
import sample.resources.IDeviceResources;
import sample.resources.PhotocopierResource;
import sample.resources.PrinterResource;

import java.util.Scanner;

public class ShopManagerProgram {

    private IDeviceResources<Printer> printerRs;
    private IDeviceResources<FaxMachine> faxMachineRs;
    private IDeviceResources<Photocopier> photocopierRs;

    public IDeviceResources<Printer> getPrinterRs() {
        return printerRs;
    }

    public void setPrinterRs(IDeviceResources<Printer> printerRs) {
        this.printerRs = printerRs;
    }

    public IDeviceResources<FaxMachine> getFaxMachineRs() {
        return faxMachineRs;
    }

    public void setFaxMachineRs(IDeviceResources<FaxMachine> faxMachineRs) {
        this.faxMachineRs = faxMachineRs;
    }

    public IDeviceResources<Photocopier> getPhotocopierRs() {
        return photocopierRs;
    }

    public void setPhotocopierRs(IDeviceResources<Photocopier> photocopierRs) {
        this.photocopierRs = photocopierRs;
    }


    public void printResource() {
        photocopierRs.showAvailableList();
        faxMachineRs.showAvailableList();
        printerRs.showAvailableList();
    }

    private OfficalDevice allocate(int taskId) throws Exception {

        OfficalDevice item = null;
        if (taskId == 1) {
            item = this.getPhotocopierRs().getRandomOneItem();

        } else if (taskId == 2) {
            item = this.getFaxMachineRs().getRandomOneItem();

        } else if (taskId == 3) {
            item = this.getPrinterRs().getRandomOneItem();

        }
        if (item == null) {
            throw new Exception("Hiện các thiết bị đã bận");
        }
        return item;
    }

    public static void main(String[] args) {
        ShopManagerProgram shopManager = new ShopManagerProgram();
        shopManager.setPhotocopierRs(new PhotocopierResource());
        shopManager.setFaxMachineRs(new FaxMachineResource());
        shopManager.setPrinterRs(new PrinterResource());


        Scanner scanner = new Scanner(System.in);

        // Nhập tên người dùng
        System.out.print("Tôi có thể gọi bạn là: ");
        String name = scanner.nextLine();
        Person p = null;

        // Chọn vai trò
        System.out.println("Chọn vai trò:");
        System.out.println("1. Customer");
        System.out.println("2. Employee");
        int role = scanner.nextInt();
        boolean running = true;
        while (running) {

            switch (role) {
                case 1:
                    System.out.println("___RESOURCE___");
                    shopManager.printResource();

                    System.out.println("___Menu___");
                    System.out.println("1. Sử dụng máy photocopy");
                    System.out.println("//2. Sử dụng máy fax");
                    System.out.println("//3. Sử dụng máy in");
                    System.out.println("0. Thoát");
                    break;
                case 2:
                    System.out.println("___RESOURCE___");
                    shopManager.printResource();

                    System.out.println("___Menu___");
                    System.out.println("1. Sử dụng máy photocopy");
                    System.out.println("2. Sử dụng máy fax");
                    System.out.println("3. Sử dụng máy in");
                    System.out.println("0. Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Thoát chương trình.");
                    return;

            }

            int taskId = scanner.nextInt();
            System.out.println("");
            System.out.println("");

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            switch (taskId) {
                case 1:
                case 2:
                case 3:
                    try {
                        if (role == 1) {
                            p = new Customer(name);
                            p.useDevice(shopManager.allocate(taskId));
                        } else if (role == 2) {
                            p = new Employee(name);
                            p.useDevice(shopManager.allocate(taskId));
                        }
                    } catch (Exception e) {
                        System.out.println("===== " + e.getMessage() + ". Mời chọn lại =====");
                        continue;
                    }
                    break;

                case 0:
                    running = false;
                    continue;
                default:
                    System.out.println("=====Lựa chọn không hợp lệ. Mời chọn lại =====");

            }
        }

        p.sayThankyou();
        scanner.close();

    }
}