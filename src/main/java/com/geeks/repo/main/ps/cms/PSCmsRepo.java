package com.geeks.repo.main.ps.cms;

import com.geeks.entities.ps.cms.PSCms;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
public interface PSCmsRepo extends PagingAndSortingRepository<PSCms, Long> {
    List<PSCms> findAll();
}