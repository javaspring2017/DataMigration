package com.geeks.services.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlockPage;
import com.geeks.repo.main.ps.cms.PSCmsBlockPageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
@Service
public class PSCmsBlockPageService {

    @Autowired
    private PSCmsBlockPageRepo repo;

    public List<PSCmsBlockPage> getAll() {
        return repo.findAll();
    }
}
