package com.zy.javabean;

public class UserAddress {
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	
	
	public UserAddress() {
		super();
	}
	public UserAddress(String province, String city) {
		super();
		this.province = province;
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
