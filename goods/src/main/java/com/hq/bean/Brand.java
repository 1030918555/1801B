package com.hq.bean;

public class Brand {
	private Integer id;
	private String brandName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Brand(Integer id, String brandName) {
		super();
		this.id = id;
		this.brandName = brandName;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", brandName=" + brandName + "]";
	}
	
	

}
