package com.geeks.services;

import com.geeks.entities.PSHookAlias;
import com.geeks.repo.main.PSHookAliasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class PSHookAliasService {

    @Autowired
    private PSHookAliasRepo repo;

    public List<PSHookAlias> getAll() {
        return repo.findAll();
    }
}
