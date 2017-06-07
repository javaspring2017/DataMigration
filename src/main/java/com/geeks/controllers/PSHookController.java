package com.geeks.controllers;

import com.geeks.entities.PSHook;
import com.geeks.services.PSHookService;

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
@RequestMapping("/api/ps_hook")
public class PSHookController {

    @Autowired
    private PSHookService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSHook>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}