package com.hq.bean;

public class Goods {

	private Integer id;
	private String goodsName;
	private String  englishName;
	private Integer goodsSize;
	private Double goodsMoney;
	private Integer goodsNumber;
	private String goodsTaglib;
	private String goodsPic;
	private Brand brand;
	private Type type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public Integer getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(Integer goodsSize) {
		this.goodsSize = goodsSize;
	}
	public Double getGoodsMoney() {
		return goodsMoney;
	}
	public void setGoodsMoney(Double goodsMoney) {
		this.goodsMoney = goodsMoney;
	}
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public String getGoodsTaglib() {
		return goodsTaglib;
	}
	public void setGoodsTaglib(String goodsTaglib) {
		this.goodsTaglib = goodsTaglib;
	}
	public String getGoodsPic() {
		return goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", englishName=" + englishName + ", goodsSize="
				+ goodsSize + ", goodsMoney=" + goodsMoney + ", goodsNumber=" + goodsNumber + ", goodsTaglib="
				+ goodsTaglib + ", goodsPic=" + goodsPic + ", brand=" + brand + ", type=" + type + "]";
	}
	public Goods(Integer id, String goodsName, String englishName, Integer goodsSize, Double goodsMoney,
			Integer goodsNumber, String goodsTaglib, String goodsPic, Brand brand, Type type) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.englishName = englishName;
		this.goodsSize = goodsSize;
		this.goodsMoney = goodsMoney;
		this.goodsNumber = goodsNumber;
		this.goodsTaglib = goodsTaglib;
		this.goodsPic = goodsPic;
		this.brand = brand;
		this.type = type;
	}
	
	
}
