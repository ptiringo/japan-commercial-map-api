package com.example.ptiringo.domain.repository

import com.example.ptiringo.domain.entity.Downtown
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.Repository

interface DowntownDataRepository : Repository<Downtown, Long> {
    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    fun findAll(): Iterable<Downtown>
}

@org.springframework.stereotype.Repository
interface DowntownRepository : JpaRepository<Downtown, Long> {
    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    override fun findAll(): List<Downtown>
}
