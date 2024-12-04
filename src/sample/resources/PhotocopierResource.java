package sample.resources;

import sample.device.Photocopier;

import java.util.List;

public class PhotocopierResource extends OfficalDeviceResourceImpl<Photocopier> {


    public PhotocopierResource() {
        super();
        this.all = List.of(
                new Photocopier(),
                new Photocopier(),
                new Photocopier()

        );
    }





}
