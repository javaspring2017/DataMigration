package com.geeks.repo.main.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlockPage;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
public interface PSCmsBlockPageRepo extends PagingAndSortingRepository<PSCmsBlockPage, Long> {
    List<PSCmsBlockPage> findAll();
}