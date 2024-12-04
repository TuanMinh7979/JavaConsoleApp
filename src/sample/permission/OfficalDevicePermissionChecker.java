package sample.permission;

import java.util.List;

public class OfficalDevicePermissionChecker implements IPermissionChecker {
    public boolean canUseDevice(List<Permission> permissions, Class<?> deviceType) {
        for (Permission p : permissions) {
            if (p.getContent().equalsIgnoreCase("USE_" + deviceType.getSimpleName().toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean allAccepted() {
        return false;
    }
}
