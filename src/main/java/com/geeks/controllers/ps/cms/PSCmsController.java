package com.geeks.controllers.ps.cms;

import com.geeks.entities.PSMeta;
import com.geeks.entities.ps.cms.PSCms;
import com.geeks.services.PSMetaService;
import com.geeks.services.ps.cms.PSCmsService;
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
@RequestMapping("/api/ps_cms")
public class PSCmsController {

    @Autowired
    private PSCmsService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSCms>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
