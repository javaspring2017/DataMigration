package com.geeks.services.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlockLang;
import com.geeks.repo.main.ps.cms.PSCmsBlockLangRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Service
public class PSCmsBlockLangService {

    @Autowired
    private PSCmsBlockLangRepo repo;

    public List<PSCmsBlockLang> getAll() {
        return repo.findAll();
    }
}
