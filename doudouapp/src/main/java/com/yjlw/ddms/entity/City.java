/**
 * 
 */
package com.yjlw.ddms.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * 城市实体类
 */
public class City {
	private String c_id;// 编号
	private String cn;// 名称
	private List<County> counties = new LinkedList<County>();// 多个县

	/**
	 * 
	 */
	public City() {
		super();
	}

	/**
	 * @param c_id
	 * @param cn
	 * @param counties
	 */
	public City(String c_id, String cn, List<County> counties) {
		super();
		this.c_id = c_id;
		this.cn = cn;
		this.counties = counties;
	}

	/**
	 * @return the c_id
	 */
	public String getC_id() {
		return c_id;
	}

	/**
	 * @param c_id
	 *            the c_id to set
	 */
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	/**
	 * @return the cn
	 */
	public String getCn() {
		return cn;
	}

	/**
	 * @param cn
	 *            the cn to set
	 */
	public void setCn(String cn) {
		this.cn = cn;
	}

	/**
	 * @return the counties
	 */
	public List<County> getCounties() {
		return counties;
	}

	/**
	 * @param counties
	 *            the counties to set
	 */
	public void setCounties(List<County> counties) {
		this.counties = counties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [c_id=" + c_id + ", cn=" + cn + ", counties=" + counties + "]";
	}

}
