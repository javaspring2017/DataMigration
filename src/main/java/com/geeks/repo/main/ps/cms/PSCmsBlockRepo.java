package com.geeks.repo.main.ps.cms;

import com.geeks.entities.ps.cms.PSCmsBlock;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
public interface PSCmsBlockRepo extends PagingAndSortingRepository<PSCmsBlock, Long> {
    List<PSCmsBlock> findAll();
}
