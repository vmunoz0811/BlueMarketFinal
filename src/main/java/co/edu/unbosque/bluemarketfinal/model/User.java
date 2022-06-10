package co.edu.unbosque.bluemarketfinal.model;

public class User {

    protected String name;
    protected String mail;
    protected String password;
    protected String role;
    protected double fcoins;

    public User(){}

    public User(String name, String mail, String password, String role, double fcoins) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.role = role;
        this.fcoins = fcoins;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", fcoins=" + fcoins +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public double getFcoins() {
        return fcoins;
    }

    public void setFcoins(double fcoins) {
        this.fcoins = fcoins;
    }
}
