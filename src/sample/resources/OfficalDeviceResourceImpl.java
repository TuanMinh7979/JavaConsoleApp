package sample.resources;

import sample.device.OfficalDevice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OfficalDeviceResourceImpl<T extends OfficalDevice> implements IDeviceResources<T> {

    protected List<T> all;

    @Override
    public T getRandomOneItem() {
        List<T> availableOfficalDevices = getAvailableItems();
        if (availableOfficalDevices.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(availableOfficalDevices.size());
        return availableOfficalDevices.get(index);
    }

    @Override
    public List<T> getAvailableItems() {
        return all.stream()
                .filter(officalDevice -> !officalDevice.isUsing())
                .collect(Collectors.toList());
    }

    @Override
    public void showAvailableList() {
        List<T> data = getAvailableItems();
        if (!data.isEmpty()) {
            System.out.println("List " + data.get(0).getName());

            for (T item : data) {
                System.out.print(data.get(0).getName().substring(0, 2) + item.getId() + ", ");
            }
            System.out.println();
        }
    }
}
