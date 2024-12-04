package sample.resources;

import sample.device.Photocopier;
import sample.device.Printer;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PhotocopierResource implements IDeviceResources<Photocopier> {
    private List<Photocopier> all;

    public PhotocopierResource() {
        this.all = List.of(
                new Photocopier(),
                new Photocopier(),
                new Photocopier()

        );
    }


    @Override
    public Photocopier getRandomOneItem() {
        List<Photocopier> availableOfficalDevices = getAvailableItems();
        if (availableOfficalDevices.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(availableOfficalDevices.size());
        return availableOfficalDevices.get(index);
    }

    @Override
    public List<Photocopier> getAvailableItems() {
        return all.stream()
                .filter(officalDevice -> !officalDevice.isUsing())
                .collect(Collectors.toList());
    }

    @Override
    public void showAvailableList() {
        List<Photocopier> data = getAvailableItems();
        System.out.println("Photocopier list: ");
        for (Photocopier item : data) {
            System.out.print("Ph" + item.getId() + ", ");
        }
        System.out.println();
    }


}
