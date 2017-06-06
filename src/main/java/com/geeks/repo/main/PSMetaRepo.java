package com.geeks.repo.main;

import com.geeks.entities.PSMeta;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface PSMetaRepo extends PagingAndSortingRepository<PSMeta, Long> {

    @Query("from PSMeta p")
    List<PSMeta> findAll();

}
