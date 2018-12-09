package cn.hang.manage.pojo;

public class HRolePermPO {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Long roleId;

    /**
     * 
     */
    private Long permissionId;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return role_id 
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 
     * @return permission_id 
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId 
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}