package com.example.ptiringo.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * 商業集積地区
 *
 * @property id ID
 * @property prefectureCode 都道府県コード
 * @property code1 商業集積地番号1
 * @property code2 商業集積地番号2
 * @property name 商店街名
 * @property commercialAccumulationCode 集積細分コード
 * @property officeCount 事業所数
 * @property insideShopCount 大規模小売店舗内事業所数
 * @property employeeCount 従業者数
 * @property annualSalesTurnover 年間商品販売額
 * @property area 売場面積
 * @property latitude 緯度
 * @property longitude 経度
 * @author ptiringo
 */
@Entity
data class Downtown(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    var prefectureCode: Int,

    var code1: Int,

    var code2: Int,

    var name: String,

    var commercialAccumulationCode: Int,

    var officeCount: Int,

    @Column(nullable = true)
    var insideShopCount: Int?,

    var employeeCount: Int,

    var annualSalesTurnover: Long,

    @Column(nullable = true)
    var area: Int?,

    var latitude: Double,

    var longitude: Double
)