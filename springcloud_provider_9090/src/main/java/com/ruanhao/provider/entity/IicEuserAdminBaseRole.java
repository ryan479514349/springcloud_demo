package com.ruanhao.provider.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "iic_euser_admin_base_role")
public class IicEuserAdminBaseRole {
    /** * 主键 */
    @Id @TableId(type = IdType.AUTO)
    private Long id;
    /** * 角色ID */
    @Column(name = "role_id")
    private String roleId;
    /** * 角色类型 */
    @Column(name = "role_type")
    private String roleType;
    /** * 角色描述 */
    @Column(name = "role_desc")
    private String roleDesc;
    /** * 是否删除 0-未删除 1-已删除 */
    @Column(name = "is_deleted")
    private Byte deleted;
    /** * 创建者 */
    @Column(name = "created_by")
    private String createdBy;
    /** * 创建时间 */
    @Column(name = "created_date")
    private Date createdDate;
    /** * 更新者 */
    @Column(name = "updated_by")
    private String updatedBy;
    /** * 更新时间 */
    @Column(name = "updated_date")
    private Date updatedDate;
    /** * 获取主键 * * @return id - 主键 */
    public Long getId() {
        return id; }
    /** * 设置主键 * * @param id 主键 */
    public void setId(Long id) {
        this.id = id; }
    /** * 获取角色ID * * @return role_id - 角色ID */
    public String getRoleId() {
        return roleId; }
    /** * 设置角色ID * * @param roleId 角色ID */
    public void setRoleId(String roleId) {
        this.roleId = roleId; }
    /** * 获取角色类型 * * @return role_type - 角色类型 */
    public String getRoleType() {
        return roleType; }
    /** * 设置角色类型 * * @param roleType 角色类型 */
    public void setRoleType(String roleType) {
        this.roleType = roleType; }
    /** * 获取角色描述 * * @return role_desc - 角色描述 */
    public String getRoleDesc() {
        return roleDesc; }
    /** * 设置角色描述 * * @param roleDesc 角色描述 */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc; }
    /** * 获取是否删除 0-未删除 1-已删除 * * @return is_deleted - 是否删除 0-未删除 1-已删除 */
    public Byte getDeleted() {
        return deleted; }
    /** * 设置是否删除 0-未删除 1-已删除 * * @param deleted 是否删除 0-未删除 1-已删除 */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted; }
    /** * 获取创建者 * * @return created_by - 创建者 */
    public String getCreatedBy() {
        return createdBy; }
    /** * 设置创建者 * * @param createdBy 创建者 */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; }
    /** * 获取创建时间 * * @return created_date - 创建时间 */
    public Date getCreatedDate() {
        return createdDate; }
    /** * 设置创建时间 * * @param createdDate 创建时间 */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate; }
    /** * 获取更新者 * * @return updated_by - 更新者 */
    public String getUpdatedBy() {
        return updatedBy; }
    /** * 设置更新者 * * @param updatedBy 更新者 */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy; }
    /** * 获取更新时间 * * @return updated_date - 更新时间 */
    public Date getUpdatedDate() {
        return updatedDate; }
    /** * 设置更新时间 * * @param updatedDate 更新时间 */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate; }
}