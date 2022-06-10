package co.edu.unbosque.bluemarketfinal.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class LikeArt {
    protected int id_like;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    protected User user;
    protected Date likeRegisteredAt;
    protected Art art;

    public LikeArt(){}

    public LikeArt(int id_like, User user, Date likeRegisteredAt, Art art) {
        this.id_like = ID_GENERATOR.getAndIncrement();
        this.user = user;
        this.likeRegisteredAt = likeRegisteredAt;
        this.art = art;
    }

    @Override
    public String toString() {
        return "LikeArt{" +
                "id_like=" + id_like +
                ", user=" + user +
                ", likeRegisteredAt=" + likeRegisteredAt +
                ", art=" + art +
                '}';
    }

    public int getId_like() {
        return id_like;
    }

    public void setId_like(int id_like) {
        this.id_like = id_like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLikeRegisteredAt() {
        return likeRegisteredAt;
    }

    public void setLikeRegisteredAt(Date likeRegisteredAt) {
        this.likeRegisteredAt = likeRegisteredAt;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }
}
