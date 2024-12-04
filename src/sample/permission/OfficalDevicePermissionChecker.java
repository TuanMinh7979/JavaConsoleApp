package sample.permission;

import java.util.List;

public class OfficalDevicePermissionChecker implements IPermissionChecker {


    @Override
    public boolean allAccepted() {
        return false;
    }

    @Override
    public boolean checkWithPermissionsAndClassName(List<Permission> permissions, Class<?> className) {
        for (Permission p : permissions) {
            if (p.getContent().equalsIgnoreCase("USE_" + className.getSimpleName().toUpperCase())) {
                return true;
            }
        }
        return false;
    }


}
