package com.example.ptiringo.domain.repository

import com.example.ptiringo.domain.entity.Downtown
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DowntownRepository : JpaRepository<Downtown, Long> {
    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    override fun findAll(): List<Downtown>
}
