package com.geeks.entities.ps.cms;

import javax.persistence.*;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Entity
@Table(name = "ps_cms_block")
public class PSCmsBlock {

    @Id
    @Column(name = "ID_CMS_BLOCK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CMS_CATEGORY", nullable = false)
    private Integer idCmsCategory;

    @Column(name = "LOCATION", nullable = false)
    private Byte location;

    @Column(name = "POSITION", nullable = false)
    private Integer position;

    @Column(name = "DISPLAY_STORE", nullable = false)
    private Byte display_store;

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

    public Byte getLocation() {
        return location;
    }

    public void setLocation(Byte location) {
        this.location = location;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Byte getDisplay_store() {
        return display_store;
    }

    public void setDisplay_store(Byte display_store) {
        this.display_store = display_store;
    }

}
