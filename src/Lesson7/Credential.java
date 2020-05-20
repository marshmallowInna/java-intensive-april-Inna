package Lesson7;

import java.util.Objects;

public class Credential {
    private String login;
    private String password;
    private String role;// user manager admin

    public Credential() {
    }

    public Credential(String login, String password, String role) {
        this.login = login;
        this.password = password;
      /*  if (role.toUpperCase().equals(Role.ADMIN.name().toUpperCase())){//compare strings( сравнивать строки верхнего и нижнего регистра
            this.role = Role.ADMIN;
    }else if (role.toUpperCase().equals(Role.User.name().toUpperCase())) {
            this.role = Role.User;
        }*/
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credential)) return false;
        Credential that = (Credential) o;
        return getLogin().equals(that.getLogin()) &&
                getPassword().equals(that.getPassword()) &&
                getRole().equals(that.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getRole());
    }

    @Override
    public String toString() {
        return "Credential{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


