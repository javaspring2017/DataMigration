package com.geeks.entities;

import javax.persistence.*;

/**
 * Created by Anastasiia on 06.06.2017.
 */

@Entity
@Table(name = "PS_HOOK")
public class PSHook {

    @Id
    @Column(name = "ID_HOOK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 64, unique = true, nullable = false)
    private String name;

    @Column(name = "TITLE", length = 64, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "POSITION", nullable = false)
    private Byte position;

    @Column(name = "LIVE_EDIT", nullable = false)
    private Byte liveEdit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    public Byte getLiveEdit() {
        return liveEdit;
    }

    public void setLiveEdit(Byte liveEdit) {
        this.liveEdit = liveEdit;
    }
}