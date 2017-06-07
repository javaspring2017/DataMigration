package com.geeks.entities.ps.cms;

import javax.persistence.*;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Entity
@Table(name = "ps_cms_block_page")
public class PSCmsBlockPage {

    @Id
    @Column(name = "ID_CMS_BLOCK_PAGE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CMS_BLOCK", nullable = false)
    private Integer idCmsBlock;

    @Column(name = "ID_CMS", nullable = false)
    private Integer idCms;

    @Column(name = "IS_CATEGORY", nullable = false)
    private Byte isCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCmsBlock() {
        return idCmsBlock;
    }

    public void setIdCmsBlock(Integer idCmsBlock) {
        this.idCmsBlock = idCmsBlock;
    }

    public Integer getIdCms() {
        return idCms;
    }

    public void setIdCms(Integer idCms) {
        this.idCms = idCms;
    }

    public Byte getIsCategory() {
        return isCategory;
    }

    public void setIsCategory(Byte isCategory) {
        this.isCategory = isCategory;
    }
}
