package com.example.ptiringo.domain.repository

import com.example.ptiringo.domain.entity.Downtown
import org.springframework.data.repository.Repository

interface DowntownRepository : Repository<Downtown, Long> {
    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    fun findAll(): Iterable<Downtown>
}
