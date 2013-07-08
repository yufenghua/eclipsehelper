package com.panql.prop;

/**
 * 
 *The property is used to describle a item of config infomation
 * @author panql
 */
public class Property {
	private String name;

	private String value;

	/**  
	 * 获取name  
	 * @return name name  
	 */
	public String getName() {
		return name;
	}

	/**  
	 * 设置name  
	 * @param name name  
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**  
	 * 获取value  
	 * @return value value  
	 */
	public String getValue() {
		return value;
	}

	/**  
	 * 设置value  
	 * @param value value  
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
