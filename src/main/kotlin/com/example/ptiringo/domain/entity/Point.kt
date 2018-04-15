package com.example.ptiringo.domain.entity

import javax.persistence.Embeddable

/**
 * 位置
 *
 * @property latitude 緯度
 * @property longitude 経度
 * @author ptiringo
 */
@Embeddable
data class Point(
        val latitude: Double,
        val longitude: Double
)