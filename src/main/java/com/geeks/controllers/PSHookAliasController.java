package com.geeks.controllers;

import com.geeks.entities.PSHookAlias;
import com.geeks.services.PSHookAliasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@RestController
@RequestMapping("/api/ps_hook_alias")
public class PSHookAliasController {

    @Autowired
    private PSHookAliasService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSHookAlias>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
