package com.geeks.controllers;

import com.geeks.entities.Destoc;
import com.geeks.services.DestocService;

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
@RequestMapping("/api/destocs")
public class DestocController {

    @Autowired
    private DestocService service;

    /**
     * <p>Info: Get list of destocs.</p>
     * <p>Path: <b>/api/destocs/list</b>.</p>
     * <p>Request method: <b>GET</b>.</p>
     *
     * @return HttpStatus.OK with list of destocs.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Destoc>> getFrancos() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
