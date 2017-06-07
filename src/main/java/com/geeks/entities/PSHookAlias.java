package com.geeks.entities;

import javax.persistence.*;

/**
 * Created by Anastasiia on 06.06.2017.
 */

@Entity
@Table(name = "PS_HOOK_ALIAS")
public class PSHookAlias {

    @Id
    @Column(name = "ID_HOOK_ALIAS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ALIAS", length = 64, unique = true, nullable = false)
    private String alias;

    @Column(name = "NAME", length = 64, nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
