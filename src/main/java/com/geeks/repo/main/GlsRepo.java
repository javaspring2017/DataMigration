package com.geeks.repo.main;

import com.geeks.entities.Gls;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface GlsRepo extends PagingAndSortingRepository<Gls, Long> {

    @Query("from Gls g")
    List<Gls> findAll();

}
