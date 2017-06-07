package com.geeks.services.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlock;
import com.geeks.repo.main.ps.cms.PSCmsBlockRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Service
public class PSCmsBlockService {

    @Autowired
    private PSCmsBlockRepo repo;

    public List<PSCmsBlock> getAll() {
        return repo.findAll();
    }
}
