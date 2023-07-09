package com.pro.sky.HW11_spring.products;
import java.util.Objects;
public class Products {
    private int id;
    private String name;
    public Products(String name) {
        this.id = id+1;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return getId() == products.getId() && Objects.equals(getName(), products.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
