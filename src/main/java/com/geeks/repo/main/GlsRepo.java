package com.geeks.repo.main;

import com.geeks.entities.Gls;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

/**
 * Created by Anastasiia on 06.06.2017.
 */
public interface GlsRepo extends PagingAndSortingRepository<Gls, Long> {
    List<Gls> findAll();
}
