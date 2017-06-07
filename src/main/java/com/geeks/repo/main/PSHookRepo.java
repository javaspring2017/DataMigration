package com.geeks.repo.main;

import com.geeks.entities.PSHook;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface PSHookRepo extends PagingAndSortingRepository<PSHook, Long> {
    List<PSHook> findAll();
}