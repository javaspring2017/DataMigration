package com.geeks.controllers;

import com.geeks.entities.PSMeta;
import com.geeks.services.PSMetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@RestController
@RequestMapping("/api/ps_meta")
public class PSMetaController {

    @Autowired
    private PSMetaService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSMeta>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
