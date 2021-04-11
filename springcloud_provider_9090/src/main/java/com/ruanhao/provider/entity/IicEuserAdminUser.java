package com.ruanhao.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "iic_euser_admin_user")
public class IicEuserAdminUser{
    /** * 主键
     *
      */
    @Id
    @TableId(type = IdType.AUTO)
    private Long id;
    /** * 用户ID */
    @Column(name = "user_id")
    private String userId;
    /** * 用户姓名 */
    @Column(name = "user_name")
    private String userName;
    /** * 手机号码 */
    @Column(name = "mobile_no")
    private String mobileNo;
    /** * 手机号码区号 */
    @Column(name = "mobile_no_pre_code")
    private String mobileNoPreCode;
    /** * 用户状态（0-草稿 1-已生效 2-已禁用 3-已删除） */
    private String status;
    /** * 是否删除 0-未删除 1-已删除 */
    @Column(name = "is_deleted")
    @TableField(value ="is_deleted")
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
    /** * 获取用户ID * * @return user_id - 用户ID */
    public String getUserId() {
        return userId; }
    /** * 设置用户ID * * @param userId 用户ID */
    public void setUserId(String userId) {
        this.userId = userId; }
    /** * 获取用户姓名 * * @return user_name - 用户姓名 */
    public String getUserName() {
        return userName; }
    /** * 设置用户姓名 * * @param userName 用户姓名 */
    public void setUserName(String userName) {
        this.userName = userName; }
    /** * 获取手机号码 * * @return mobile_no - 手机号码 */
    public String getMobileNo() {
        return mobileNo; }
    /** * 设置手机号码 * * @param mobileNo 手机号码 */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo; }
    /** * 获取手机号码区号 * * @return mobile_no_pre_code - 手机号码区号 */
    public String getMobileNoPreCode() {
        return mobileNoPreCode; }
    /** * 设置手机号码区号 * * @param mobileNoPreCode 手机号码区号 */
    public void setMobileNoPreCode(String mobileNoPreCode) {
        this.mobileNoPreCode = mobileNoPreCode; }
    /** * 获取用户状态（0-草稿 1-已生效 2-已禁用 3-已删除） * * @return status - 用户状态（0-草稿 1-已生效 2-已禁用 3-已删除） */
    public String getStatus() {
        return status; }
    /** * 设置用户状态（0-草稿 1-已生效 2-已禁用 3-已删除） * * @param status 用户状态（0-草稿 1-已生效 2-已禁用 3-已删除） */
    public void setStatus(String status) {
        this.status = status; }
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