package com.example.ptiringo.domain.entity

import javax.persistence.Column
import javax.persistence.Embeddable

/**
 * 都道府県
 *
 * @property code 都道府県コード
 * @author ptiringo
 */
@Embeddable
data class Prefecture(
        @Column(name = "prefectureCode")
        val code: Int
)