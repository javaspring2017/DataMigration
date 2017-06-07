package com.geeks.controllers.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlock;
import com.geeks.services.ps.cms.PSCmsBlockService;

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
@RequestMapping("/api/ps_cms_block")
public class PSCmsBlockController {

    @Autowired
    private PSCmsBlockService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSCmsBlock>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
