package com.example.ptiringo.domain.entity

import javax.persistence.*

/**
 * 商業集積地区
 *
 * @property id ID
 * @property prefecture 都道府県
 * @property code1 商業集積地番号1
 * @property code2 商業集積地番号2
 * @property name 商店街名
 * @property commercialAccumulationCode 集積細分コード
 * @property officeCount 事業所数
 * @property insideShopCount 大規模小売店舗内事業所数
 * @property employeeCount 従業者数
 * @property annualSalesTurnover 年間商品販売額
 * @property area 売場面積
 * @property point 位置
 * @author ptiringo
 */
@Entity
data class Downtown(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Embedded
        val prefecture: Prefecture,

        val code1: Int,

        val code2: Int,

        val name: String,

        val commercialAccumulationCode: Int,

        val officeCount: Int,

        @Column(nullable = true)
        var insideShopCount: Int?,

        val employeeCount: Int,

        val annualSalesTurnover: Long,

        @Column(nullable = true)
        var area: Int?,

        @Embedded
        val point: Point
)