package co.edu.unbosque.bluemarketfinal.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Art {
    protected String name;
    protected float price;
    protected String imagePath;
    protected String description;
    protected String category;
    protected int id_art;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    protected User user;

    public Art(){}

    public Art(String name, float price, String imagePath, String description, String category, int id_art, User user) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
        this.description = description;
        this.category = category;
        this.id_art = id_art;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Art{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", imagePath='" + imagePath + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", id_art=" + id_art +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId_art() {
        return id_art;
    }

    public void setId_art(int id_art) {
        this.id_art = id_art;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
