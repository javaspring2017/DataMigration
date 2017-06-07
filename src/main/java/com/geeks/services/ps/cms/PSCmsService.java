package com.geeks.services.ps.cms;

import com.geeks.entities.ps.cms.PSCms;
import com.geeks.repo.main.ps.cms.PSCmsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Service
public class PSCmsService {

    @Autowired
    private PSCmsRepo repo;

    public List<PSCms> getAll() {
        return repo.findAll();
    }
}
