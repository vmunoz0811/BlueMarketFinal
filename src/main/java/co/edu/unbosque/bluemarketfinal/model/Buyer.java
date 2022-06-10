package co.edu.unbosque.bluemarketfinal.model;

public class Buyer extends User{
    public Buyer(String name, String mail, String password, String role) {
        super(name, mail, password, role, 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getMail() {
        return super.getMail();
    }

    public void setMail(String mail) {
        super.setMail(mail);
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public String getRole() {
        return super.getRole();
    }

    public void setRole(String role) {
        super.setRole(role);
    }

    public double getFcoins() {
        return super.getFcoins();
    }

    public void setFcoins(double fcoins) {
        super.setFcoins(fcoins);
    }
}
