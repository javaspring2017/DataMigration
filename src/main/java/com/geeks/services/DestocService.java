package com.geeks.services;

import com.geeks.entities.Destoc;
import com.geeks.repo.main.DestocRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class DestocService {

    @Autowired
    private DestocRepo repo;

    public List<Destoc> getAll() {
        return repo.findAll();
    }
}
