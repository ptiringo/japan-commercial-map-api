package com.example.ptiringo.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ptiringo.domain.entity.Downtown;

public interface DowntownRepository extends PagingAndSortingRepository<Downtown, Long> {
}
