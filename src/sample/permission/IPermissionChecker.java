package sample.permission;

import java.util.List;

public interface  IPermissionChecker {
    boolean allAccepted();
    boolean checkWithPermissionsAndClassName(List<Permission> permissions, Class<?> className);
}
