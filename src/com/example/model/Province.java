package com.example.model;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	
	public int Id(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getProvinceCode(){
		return provinceCode;
	}
   
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}
	public String getProvinceName(){
		return provinceName;
	}
   
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
}
