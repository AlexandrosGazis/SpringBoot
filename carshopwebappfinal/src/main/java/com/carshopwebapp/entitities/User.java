package com.carshopwebapp.entitities;

public class User {
    private Long id;
    private String afm;
    private String emailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "afm='" + afm + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

