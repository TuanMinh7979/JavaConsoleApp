package sample.permission;

import java.util.List;

public class EmployeeRole extends Role {
    public EmployeeRole() {
        super("EmployeeRole");
        updatePermissionList();
    }

    @Override
    protected void updatePermissionList() {
        this.permissionList = List.of(
                new Permission("USE_PRINTER"),
                new Permission("USE_FAXMACHINE"),
                new Permission("USE_PHOTOCOPIER"));
    }


}
