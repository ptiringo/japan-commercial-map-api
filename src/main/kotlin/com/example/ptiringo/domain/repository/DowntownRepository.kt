package com.example.ptiringo.domain.repository

import org.springframework.data.repository.PagingAndSortingRepository

import com.example.ptiringo.domain.entity.Downtown

interface DowntownRepository : PagingAndSortingRepository<Downtown, Long>
