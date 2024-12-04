package sample.resources;

import sample.device.Printer;

import java.util.List;

public class PrinterResource extends OfficalDeviceResourceImpl<Printer> {
    public PrinterResource() {
        super();
        this.all = List.of(
                new Printer(),
                new Printer(),
                new Printer()

        );
    }


}
