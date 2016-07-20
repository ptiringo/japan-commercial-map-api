package com.example.ptiringo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	private long id;

	/** 都道府県コード */
	private int prefectureCode;
	/** 商業集積地番号1 */
	private int code1;
	/** 商業集積地番号2 */
	private int code2;
	/** 商店街名 */
	private String name;
	/** 集積細分コード */
	private int commercialAccumulationCode;
	/** 事業所数 */
	private int officeCount;
	/** 大規模小売店舗内事業所数 */
	@Column(nullable = true)
	private int insideShopCount;
	/** 従業者数 */
	private int employeeCount;
	/** 年間商品販売額 */
	private long annualSalesTurnover;
	/** 売場面積 */
	@Column(nullable = true)
	private int area;

}
