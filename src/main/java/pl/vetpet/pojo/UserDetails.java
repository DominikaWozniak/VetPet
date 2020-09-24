package pl.vetpet.pojo;

import pl.vetpet.enums.Permission;

import java.util.List;

public class UserDetails {

    private Long id;
    private String login;
    private String password;
    private List<Permission> permission;
    private List<WorkHours> workHours;
    private List<Bill> bills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }

    public List<WorkHours> getWorkHours() {
        return workHours;
    }

    public void setWorkHours(List<WorkHours> workHours) {
        this.workHours = workHours;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
