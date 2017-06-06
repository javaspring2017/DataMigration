package com.geeks.repo.main;

import com.geeks.entities.Franco;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface FrancoRepo extends PagingAndSortingRepository<Franco, Long> {
    List<Franco> findAll();
}