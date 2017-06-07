package com.geeks.repo.main;

import com.geeks.entities.PSHookAlias;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface PSHookAliasRepo extends PagingAndSortingRepository<PSHookAlias, Long> {
    List<PSHookAlias> findAll();
}