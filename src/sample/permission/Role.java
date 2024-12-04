package sample.permission;

import java.util.List;

public abstract class Role {

    private String name;
    List<Permission> permissionList;

    protected Role(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }


    protected abstract void updatePermissionList();


}
