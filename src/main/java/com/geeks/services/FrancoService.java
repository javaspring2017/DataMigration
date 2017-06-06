package com.geeks.services;

import com.geeks.entities.Franco;
import com.geeks.repo.main.FrancoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class FrancoService {

    @Autowired
    private FrancoRepo repo;

    public List<Franco> getAll() {
        return repo.findAll();
    }
}
