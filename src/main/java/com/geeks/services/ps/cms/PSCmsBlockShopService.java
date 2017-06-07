package com.geeks.services.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlockShop;
import com.geeks.repo.main.ps.cms.PSCmsBlockShopRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Service
public class PSCmsBlockShopService {

    @Autowired
    private PSCmsBlockShopRepo repo;

    public List<PSCmsBlockShop> getAll() {
        return repo.findAll();
    }
}
