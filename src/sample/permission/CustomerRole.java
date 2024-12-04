package sample.permission;

import java.util.List;

public class CustomerRole extends Role {
    public CustomerRole() {
        super("CustomerRole");
        updatePermissionList();
    }

    @Override
    protected void updatePermissionList() {
        this.permissionList = List.of(new Permission("USE_PHOTOCOPIER"));
    }


}
