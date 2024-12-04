package sample.resources;

import sample.device.FaxMachine;

import java.util.List;

public class FaxMachineResource extends OfficalDeviceResourceImpl<FaxMachine> {
    public FaxMachineResource() {
        super();
        this.all = List.of(
                new FaxMachine(),
                new FaxMachine(),
                new FaxMachine());
    }


}
