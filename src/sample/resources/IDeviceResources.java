package sample.resources;

import sample.device.FaxMachine;

import java.util.List;

public interface IDeviceResources<T> {


    T getRandomOneItem();

    List<T> getAvailableItems();

    void showAvailableList();
}
