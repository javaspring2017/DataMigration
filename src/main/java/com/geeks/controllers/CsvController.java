package com.geeks.controllers;

import com.geeks.entities.Csv;
import com.geeks.services.CsvService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@RestController
@RequestMapping("/api/csv")
public class CsvController {

    @Autowired
    private CsvService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Csv>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/listext", method = RequestMethod.GET)
    public ResponseEntity<List<Csv>> getListExt() {
        return new ResponseEntity<>(service.getAllExt(), HttpStatus.OK);
    }
}
