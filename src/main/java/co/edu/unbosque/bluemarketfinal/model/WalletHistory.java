package co.edu.unbosque.bluemarketfinal.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class WalletHistory {
    protected String type;
    protected double fcoins;
    protected Date registeredAt;
    protected int id;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    protected User user;

    public WalletHistory(){}

    public WalletHistory(String type, double fcoins, Date registeredAt, int id, User user) {
        this.type = type;
        this.fcoins = fcoins;
        this.registeredAt = registeredAt;
        this.id = ID_GENERATOR.getAndIncrement();
        this.user = user;
    }

    @Override
    public String toString() {
        return "WalletHistory{" +
                "type='" + type + '\'' +
                ", fcoins=" + fcoins +
                ", registeredAt=" + registeredAt +
                ", user=" + user +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFcoins() {
        return fcoins;
    }

    public void setFcoins(double fcoins) {
        this.fcoins = fcoins;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
