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
@RequestMapping("/api/ps_metas")
public class PSMetaController {

    @Autowired
    private PSMetaService service;

    /**
     * <p>Info: Get list of ps_metas.</p>
     * <p>Path: <b>/api/ps_metas/list</b>.</p>
     * <p>Request method: <b>GET</b>.</p>
     *
     * @return HttpStatus.OK with list of ps_metas.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSMeta>> getPSMetas() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
