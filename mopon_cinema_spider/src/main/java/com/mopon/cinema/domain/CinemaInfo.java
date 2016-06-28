package com.mopon.cinema.domain;

import java.sql.Date;

public class CinemaInfo {
	
	/**
	 * 格式：yyyy-MM-dd 
	 * @param 放映日期
	 */  	
  private Date release_date;
  
  /**
   * @param 渠道名称
   */
  private String  channel_name;
  
  /**
   * @param 城市
   */
  private String city;
  
  /**
   * @param 区域
   */
  private String area;
  
  /**
   * @param 影院名称
   */
  private String cinema_name;
  
  /**
   * @param 影院地址
   */
  private String chinema_address;
  
  /**
   * @param 影片名称
   */
  private String film_name;
  
  /**
   * @param 场次
   */
  private Integer sesion;
  
  /**
   * 格式：HH时mm分 E
   * @param 放映时间
   */
  private Date show_time;
  
  /**
   * @param 放映类型
   */
  private String showing_type;
  
  /**
   * @param 影厅名称
   */
  private String screens_name;
  
  /**
   * @param 渠道销售价
   */
  private long channel_sales_price;
  
  /**
   * @param 渠道会员价
   */
  private long channel_member_price;

public Date getRelease_date() {
	return release_date;
}

public void setRelease_date(Date release_date) {
	this.release_date = release_date;
}

public String getChannel_name() {
	return channel_name;
}

public void setChannel_name(String channel_name) {
	this.channel_name = channel_name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getCinema_name() {
	return cinema_name;
}

public void setCinema_name(String cinema_name) {
	this.cinema_name = cinema_name;
}

public String getChinema_address() {
	return chinema_address;
}

public void setChinema_address(String chinema_address) {
	this.chinema_address = chinema_address;
}

public String getFilm_name() {
	return film_name;
}

public void setFilm_name(String film_name) {
	this.film_name = film_name;
}

public Integer getSesion() {
	return sesion;
}

public void setSesion(Integer sesion) {
	this.sesion = sesion;
}

public Date getShow_time() {
	return show_time;
}

public void setShow_time(Date show_time) {
	this.show_time = show_time;
}

public String getShowing_type() {
	return showing_type;
}

public void setShowing_type(String showing_type) {
	this.showing_type = showing_type;
}

public String getScreens_name() {
	return screens_name;
}

public void setScreens_name(String screens_name) {
	this.screens_name = screens_name;
}

public long getChannel_sales_price() {
	return channel_sales_price;
}

public void setChannel_sales_price(long channel_sales_price) {
	this.channel_sales_price = channel_sales_price;
}

public long getChannel_member_price() {
	return channel_member_price;
}

public void setChannel_member_price(long channel_member_price) {
	this.channel_member_price = channel_member_price;
}
  
}
