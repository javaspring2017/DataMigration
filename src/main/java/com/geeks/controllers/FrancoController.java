package com.geeks.controllers;

import com.geeks.entities.Franco;
import com.geeks.services.FrancoService;

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
@RequestMapping("/api/francos")
public class FrancoController {

    @Autowired
    private FrancoService service;

    /**
     * <p>Info: Get list of francos.</p>
     * <p>Path: <b>/api/francos/list</b>.</p>
     * <p>Request method: <b>GET</b>.</p>
     *
     * @return HttpStatus.OK with list of francos.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Franco>> getFrancos() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
