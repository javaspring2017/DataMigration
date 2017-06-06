package com.geeks.entities;

import javax.persistence.*;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Entity
@Table(name = "DESTOC")
public class Destoc {
    @Id
    @Column(name = "INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DATE", nullable = false)
    private String date;

    @Column(name = "FICHIER", nullable = false)
    private Integer fichier;

    @Column(name = "FIN", nullable = false)
    private Integer fin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getFichier() {
        return fichier;
    }

    public void setFichier(Integer fichier) {
        this.fichier = fichier;
    }

    public Integer getFin() {
        return fin;
    }

    public void setFin(Integer fin) {
        this.fin = fin;
    }

}
