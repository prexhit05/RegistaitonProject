package com.oaklandsytems.employeeregistration.Entities;

public class LoginForm {
    private String loginId;
    private String password;

    public LoginForm() {
    }

    public LoginForm(String userName, String password) {
        this.loginId = userName;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Loginform{" +
                "userName='" + loginId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
