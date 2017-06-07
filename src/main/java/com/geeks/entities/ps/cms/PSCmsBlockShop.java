package com.geeks.entities.ps.cms;

import javax.persistence.*;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Entity
@Table(name = "ps_cms_block_shop")
public class PSCmsBlockShop {

    @Id
    @Column(name = "ID_CMS_BLOCK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_SHOP", nullable = false)
    private Integer idShop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

}