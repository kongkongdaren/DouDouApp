/**
 * 
 */
package com.yjlw.ddms.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * Description：省份（直辖市）实体类
 */
public class Province {
	private String p_id;// 编号
	private String pn;// 名称
	private List<City> cities = new LinkedList<City>();// 城市

	/**
	 * 
	 */
	public Province() {
		super();
	}

	/**
	 * @param p_id
	 * @param pn
	 * @param cities
	 */
	public Province(String p_id, String pn, List<City> cities) {
		super();
		this.p_id = p_id;
		this.pn = pn;
		this.cities = cities;
	}

	/**
	 * @return the p_id
	 */
	public String getP_id() {
		return p_id;
	}

	/**
	 * @param p_id
	 *            the p_id to set
	 */
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	/**
	 * @return the pn
	 */
	public String getPn() {
		return pn;
	}

	/**
	 * @param pn
	 *            the pn to set
	 */
	public void setPn(String pn) {
		this.pn = pn;
	}

	/**
	 * @return the cities
	 */
	public List<City> getCities() {
		return cities;
	}

	/**
	 * @param cities
	 *            the cities to set
	 */
	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Province [p_id=" + p_id + ", pn=" + pn + ", cities=" + cities + "]";
	}

}
