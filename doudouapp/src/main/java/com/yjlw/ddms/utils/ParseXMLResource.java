/**
 * 
 */
package com.yjlw.ddms.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.content.res.XmlResourceParser;

import com.yjlw.ddms.R;
import com.yjlw.ddms.entity.City;
import com.yjlw.ddms.entity.County;
import com.yjlw.ddms.entity.Province;


/**
 * Description：xml解析工具类<br/>
 * Copyright (c) , 2016, 原海忠 <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PullParsePronvinceInfo.java <br/>
 * Date:2016年8月26日
 * 
 * @author 原海忠
 * @version : 1.0
 */
public class ParseXMLResource {

	public static List<Province> parseXML(Context context) {

		// 思路：
		try {
			// 1、解析器工厂
			// 2、解析器
			XmlResourceParser parser = context.getResources().getXml(R.xml.citys_weather);

			// 3、解析
			int evntType = parser.getEventType();

			List<Province> provinces = null;

			Province province = null;
			City city = null;
			County county = null;

			while (evntType != XmlPullParser.END_DOCUMENT) {
				// 根据事件属性的类型，进行解析
				switch (evntType) {
				case XmlPullParser.START_DOCUMENT:
					provinces = new LinkedList<Province>();
					break;
				case XmlPullParser.START_TAG:
					String tagName = parser.getName();
					if ("p".equals(tagName)) {
						province = new Province();
						parseNodeAttr(parser, province);
					} else if ("pn".equals(tagName)) {
						province.setPn(parser.nextText());
					} else if ("c".equals(tagName)) {
						city = new City();
						parseNodeAttr(parser, city);
					} else if ("cn".equals(tagName)) {
						city.setCn(parser.nextText());
					} else if ("d".equals(tagName)) {
						county = new County();
						parseNodeAttr(parser, county);

						county.setDn(parser.nextText());

						// 直接将县城的实例添加到城市中
						city.getCounties().add(county);
					}

					break;
				case XmlPullParser.END_TAG:
					if ("c".equals(parser.getName())) {// 将城市信息添加到省中
						province.getCities().add(city);
					} else if ("p".equals(parser.getName())) {// 将省份信息添加到集合中
						provinces.add(province);
					}

					break;

				default:
					break;
				}

				// 将内部的指针移动到下一个解析点
				evntType = parser.next();
			}

			// 4、分析解析后的结果
			return provinces;
			// System.out.println("使用Pull解析后的结果是：\n");
			// for (Province p : provinces) {
			// System.out.println(p);
			// }

		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

	/**
	 * 解析点点的属性
	 * 
	 * @param parser
	 * @param obj
	 */
	private static void parseNodeAttr(XmlPullParser parser, Object obj) {
		for (int i = 0; i < parser.getAttributeCount(); i++) {
			String attrName = parser.getAttributeName(i);
			String attrValue = parser.getAttributeValue(i);

			if ("p_id".equals(attrName)) {
				((Province) obj).setP_id(attrValue);
			} else if ("c_id".equals(attrName)) {
				((City) obj).setC_id(attrValue);
			} else if ("d_id".equals(attrName)) {
				((County) obj).setD_id(attrValue);
			}
		}
	}

	/**
	 * 获得所有的省份以及直辖市的名称
	 * 
	 * @param provinces
	 * @return
	 */
	public static List<String> getAllProvinceNames(List<Province> provinces) {
		List<String> allProvinceNames = new LinkedList<String>();
		for (Province province : provinces) {
			allProvinceNames.add(province.getPn());
		}
		return allProvinceNames;
	}

	/**
	 * 获得选中的省份所包含的所有市的名称
	 * 
	 * @param provinces
	 * @param selectedProvinceName
	 * @return
	 */
	public static List<String> getAllCityNames(List<Province> provinces,
			String selectedProvinceName) {
		List<String> allCityNames = new LinkedList<String>();

		for (Province province : provinces) {
			if (selectedProvinceName != null
					&& selectedProvinceName.equals(province.getPn())) {
				for (City city : province.getCities()) {
					allCityNames.add(city.getCn());
				}
				break;
			}
		}

		return allCityNames;
	}

	/**
	 * 获得选中的省份,选中城市所包含的所有县的名称
	 * 
	 * @param provinces
	 * @param selectedProvinceName
	 * @param selectedCityName
	 * @return
	 */
	public static List<String> getAllCountyNames(List<Province> provinces,
			String selectedProvinceName, String selectedCityName) {
		List<String> allCountyNames = new LinkedList<String>();

		EXIT_FLG: for (Province province : provinces) {
			if (selectedProvinceName != null
					&& selectedProvinceName.equals(province.getPn())) {

				for (City city : province.getCities()) {

					if (selectedCityName != null
							&& selectedCityName.equals(city.getCn())) {

						for (County county : city.getCounties()) {
							allCountyNames.add(county.getDn());
						}

						break EXIT_FLG;

					}

				}

			}
		}

		return allCountyNames;
	}

}
