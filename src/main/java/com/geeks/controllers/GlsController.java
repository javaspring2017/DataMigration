package com.geeks.controllers;

import com.geeks.entities.Gls;
import com.geeks.services.GlsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
@RestController
@RequestMapping("/api/glss")
public class GlsController {

    @Autowired
    private GlsService service;

    /**
     * <p>Info: Get list of glss.</p>
     * <p>Path: <b>/api/glss/list</b>.</p>
     * <p>Request method: <b>GET</b>.</p>
     *
     * @return HttpStatus.OK with list of glss.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Gls>> getGlss() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
