package com.geeks.services;

import com.geeks.entities.PSHook;
import com.geeks.repo.main.PSHookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class PSHookService {

    @Autowired
    private PSHookRepo repo;

    public List<PSHook> getAll() {
        return repo.findAll();
    }
}