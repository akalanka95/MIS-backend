package com.epic.MIS.model;

import javax.persistence.*;

@Entity
@Table(name = "loginData")
public class LoginData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String userRole;
    private String status;
    private String userroleStatus;
    private String sysUserStatus;
    private String empStatus;
    private String branchStauts;
    private String sessionKey;
    private String name;
    private String branch;
    private String branchCode;
    private String message;
    private boolean validationStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserroleStatus() {
        return userroleStatus;
    }

    public void setUserroleStatus(String userroleStatus) {
        this.userroleStatus = userroleStatus;
    }

    public String getSysUserStatus() {
        return sysUserStatus;
    }

    public void setSysUserStatus(String sysUserStatus) {
        this.sysUserStatus = sysUserStatus;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getBranchStauts() {
        return branchStauts;
    }

    public void setBranchStauts(String branchStauts) {
        this.branchStauts = branchStauts;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }
}
