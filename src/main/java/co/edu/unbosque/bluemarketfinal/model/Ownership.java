package co.edu.unbosque.bluemarketfinal.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Ownership {
    protected int id_own;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    protected User user;
    protected Date ownRegisteredAt;
    protected Art art;

    public Ownership(){}

    public Ownership(int id_own, User user, Date ownRegisteredAt, Art art) {
        this.id_own = id_own;
        this.user = user;
        this.ownRegisteredAt = ownRegisteredAt;
        this.art = art;
    }

    @Override
    public String toString() {
        return "Ownership{" +
                "id_own=" + id_own +
                ", user=" + user +
                ", ownRegisteredAt=" + ownRegisteredAt +
                ", art=" + art +
                '}';
    }

    public int getId_own() {
        return id_own;
    }

    public void setId_own(int id_own) {
        this.id_own = id_own;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOwnRegisteredAt() {
        return ownRegisteredAt;
    }

    public void setOwnRegisteredAt(Date ownRegisteredAt) {
        this.ownRegisteredAt = ownRegisteredAt;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }
}
