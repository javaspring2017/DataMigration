package com.geeks.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Entity
@Table(name = "PS_META")
public class PSMeta {

    @Id
    @Column(name = "ID_META")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PAGE", length = 64)
    private String page;

    @Column(name = "CONFIGURABLE")
    private Byte configurable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Byte getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Byte configurable) {
        this.configurable = configurable;
    }
}
