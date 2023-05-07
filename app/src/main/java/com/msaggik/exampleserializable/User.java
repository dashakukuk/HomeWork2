package com.msaggik.exampleserializable;

import java.io.Serializable;

public class User implements Serializable {

    // поля сущности
    private String name;
    private String address;
    private String email;
    private String prise;

    // необходимый конструктор
    public User(String name, String address, String email, String prise) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.prise = prise;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrise() { return prise; }

    public void setPrise(String prise) { this.prise = prise; }
}
