package com.geeks.repo.main;

import com.geeks.entities.Destoc;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface DestocRepo extends PagingAndSortingRepository<Destoc, Long> {
    List<Destoc> findAll();
}