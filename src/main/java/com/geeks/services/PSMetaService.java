package com.geeks.services;

import com.geeks.entities.PSMeta;
import com.geeks.repo.main.PSMetaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class PSMetaService {

    @Autowired
    private PSMetaRepo repo;

    public List<PSMeta> getAll() {
        return repo.findAll();
    }

}
