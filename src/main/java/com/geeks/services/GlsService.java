package com.geeks.services;

import com.geeks.entities.Gls;
import com.geeks.repo.main.GlsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class GlsService {

    @Autowired
    private GlsRepo repo;

    public List<Gls> getAll() {
        return repo.findAll();
    }
}
