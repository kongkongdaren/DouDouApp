/**
 * 
 */
package com.yjlw.ddms.entity;

/**
 * Description：县
 */
public class County {
	private String d_id;// 编号
	private String dn;// 名称

	/**
	 * 
	 */
	public County() {
		super();
	}

	/**
	 * @param d_id
	 * @param dn
	 */
	public County(String d_id, String dn) {
		super();
		this.d_id = d_id;
		this.dn = dn;
	}

	/**
	 * @return the d_id
	 */
	public String getD_id() {
		return d_id;
	}

	/**
	 * @param d_id
	 *            the d_id to set
	 */
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	/**
	 * @return the dn
	 */
	public String getDn() {
		return dn;
	}

	/**
	 * @param dn
	 *            the dn to set
	 */
	public void setDn(String dn) {
		this.dn = dn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "County [d_id=" + d_id + ", dn=" + dn + "]";
	}

}
