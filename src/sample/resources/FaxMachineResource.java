package sample.resources;

import sample.device.FaxMachine;
import sample.device.Photocopier;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FaxMachineResource  implements IDeviceResources<FaxMachine> {
    private List<FaxMachine> all;
    public FaxMachineResource() {

        this.all = List.of(
                new FaxMachine(),
                new FaxMachine(),
                new FaxMachine());
    }
    @Override
    public FaxMachine getRandomOneItem() {
        List<FaxMachine> availableOfficalDevices = getAvailableItems();
        if (availableOfficalDevices.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(availableOfficalDevices.size());
        return availableOfficalDevices.get(index);
    }

    @Override
    public List<FaxMachine> getAvailableItems() {
        return all.stream()
                .filter(officalDevice -> !officalDevice.isUsing())
                .collect(Collectors.toList());
    }

    @Override
    public void showAvailableList() {
        List<FaxMachine> data = getAvailableItems();
        System.out.println("Fax Machine list: ");
        for (FaxMachine item : data) {
            System.out.print("F" + item.getId() + ", ");
        }
        System.out.println();
    }

}
