package sample;

import sample.device.FaxMachine;
import sample.device.Printer;

public interface IEmployeeDevicePermission extends ICommonDevicePermission {
    void useFaxMachine(FaxMachine device);
    void usePrinter(Printer device);
}
