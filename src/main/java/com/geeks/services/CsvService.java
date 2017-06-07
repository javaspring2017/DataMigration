package com.geeks.services;

import com.geeks.entities.Csv;
import com.geeks.repo.main.CsvRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@Service
public class CsvService {

    @Autowired
    private CsvRepo repo;

    public List<Csv> getAll() {
        return repo.findAll();
    }
}
