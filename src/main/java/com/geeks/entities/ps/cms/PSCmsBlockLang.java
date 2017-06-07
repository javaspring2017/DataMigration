package com.geeks.entities.ps.cms;

import javax.persistence.*;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Entity
@Table(name = "ps_cms_block_lang")
public class PSCmsBlockLang {

    @Id
    @Column(name = "ID_CMS_BLOCK", nullable = false)
    private Integer idCmsBlock;

    @Column(name = "ID_LANG", nullable = false)
    private Integer idLang;

    @Column(name = "NAME", length = 40, nullable = false)
    private String name;

    public Integer getIdCmsBlock() {
        return idCmsBlock;
    }

    public void setIdCmsBlock(Integer idCmsBlock) {
        this.idCmsBlock = idCmsBlock;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
