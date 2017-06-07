package com.geeks.controllers.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlockLang;
import com.geeks.services.ps.cms.PSCmsBlockLangService;

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
@RequestMapping("/api/ps_cms_block_lang")
public class PSCmsBlockLangController {

    @Autowired
    private PSCmsBlockLangService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PSCmsBlockLang>> getList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}