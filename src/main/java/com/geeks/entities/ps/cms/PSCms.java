package com.geeks.entities.ps.cms;

import javax.persistence.*;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Entity
@Table(name = "ps_cms")
public class PSCms {

    @Id
    @Column(name = "ID_CMS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CMS_CATEGORY", nullable = false)
    private Integer idCmsCategory;

    @Column(name = "POSITION", nullable = false)
    private Integer position;

    @Column(name = "ACTIVE", nullable = false)
    private Byte active;

    @Column(name = "INDEXATION", nullable = false)
    private Byte indexation;

    @Column(name = "PROSLIDER")
    private String proslider;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCmsCategory() {
        return idCmsCategory;
    }

    public void setIdCmsCategory(Integer idCmsCategory) {
        this.idCmsCategory = idCmsCategory;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Byte getIndexation() {
        return indexation;
    }

    public void setIndexation(Byte indexation) {
        this.indexation = indexation;
    }

    public String getProslider() {
        return proslider;
    }

    public void setProslider(String proslider) {
        this.proslider = proslider;
    }
}
