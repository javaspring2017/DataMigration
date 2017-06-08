package com.geeks.repo.ext;

import com.geeks.entities.Csv;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Anastasiia on 07.06.2017.
 */
public interface CsvRepoExt extends PagingAndSortingRepository<Csv, Long> {
    List<Csv> findAll();
}
