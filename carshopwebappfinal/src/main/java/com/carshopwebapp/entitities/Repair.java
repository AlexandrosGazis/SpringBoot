package com.carshopwebapp.entitities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "repair")
public class Repair {


    @Id
    private int id;
    //@Column  if the private name was different from the ones of our db

    @Column(name = "datetime")
    private String date; //match datetime column with a variable named date

    @Column(name = "katastasi")     //for date see: https://www.baeldung.com/hibernate-date-time
    private String katastasi;//match katastasi column with a variable named status

    @Column(name = "eidosepiskeuis")
    private String eidosepiskeuis;

    @Column(name = "kostos")
    private double kostos;

    @Column(name = "owner") //here add the connection with other table
    private String owner;

    @Column(name = "perigrafi")
    private String perigrafi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKatastasi() {
        return katastasi;
    }

    public void setKatastasi(String katastasi) {
        this.katastasi = katastasi;
    }

    public String getEidosepiskeuis() {
        return eidosepiskeuis;
    }

    public void setEidosepiskeuis(String eidosepiskeuis) {
        this.eidosepiskeuis = eidosepiskeuis;
    }

    public double getKostos() {
        return kostos;
    }

    public void setKostos(double kostos) {
        this.kostos = kostos;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", date=" + date +
                ", katastasi=" + katastasi +
                ", eidosepiskeuis=" + eidosepiskeuis +
                ", kostos=" + kostos +
                ", owner=" + owner +
                ", perigrafi=" + perigrafi  +
                '}';
    }
}
