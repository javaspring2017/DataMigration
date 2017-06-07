package com.geeks.repo.main;

import com.geeks.entities.Csv;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface CsvRepo extends PagingAndSortingRepository<Csv, Long> {
    List<Csv> findAll();
}
