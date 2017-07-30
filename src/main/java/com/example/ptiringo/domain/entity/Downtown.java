package com.example.ptiringo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * 商業集積地区
 * @author ptiringo
 */
@Data
@Entity
public class Downtown {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** 都道府県コード */
	private Integer prefectureCode;
	/** 商業集積地番号1 */
	private Integer code1;
	/** 商業集積地番号2 */
	private Integer code2;
	/** 商店街名 */
	private String name;
	/** 集積細分コード */
	private Integer commercialAccumulationCode;
	/** 事業所数 */
	private Integer officeCount;
	/** 大規模小売店舗内事業所数 */
	@Column(nullable = true)
	private Integer insideShopCount;
	/** 従業者数 */
	private Integer employeeCount;
	/** 年間商品販売額 */
	private Long annualSalesTurnover;
	/** 売場面積 */
	@Column(nullable = true)
	private Integer area;

	/** 緯度 */
	@Column(nullable = true)
	private Double latitude;
	/** 経度 */
	@Column(nullable = true)
	private Double longitude;
}
