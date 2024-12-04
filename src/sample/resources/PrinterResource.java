package sample.resources;

import sample.device.Printer;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PrinterResource implements IDeviceResources<Printer> {
    private List<Printer> all;

    public PrinterResource() {
        this.all = List.of(
                new Printer(),
                new Printer(),
                new Printer()

        );
    }


    @Override
    public Printer getRandomOneItem() {
        List<Printer> availableOfficalDevices = getAvailableItems();
        if (availableOfficalDevices.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(availableOfficalDevices.size());
        return availableOfficalDevices.get(index);
    }

    @Override
    public List<Printer> getAvailableItems() {
        return all.stream()
                .filter(officalDevice -> !officalDevice.isUsing())
                .collect(Collectors.toList());
    }

    @Override
    public void showAvailableList() {
        List<Printer> data = getAvailableItems();
        System.out.println("Printer list: ");
        for (Printer item : data) {
            System.out.print("P" + item.getId() + ", ");
        }
        System.out.println();
    }


}
