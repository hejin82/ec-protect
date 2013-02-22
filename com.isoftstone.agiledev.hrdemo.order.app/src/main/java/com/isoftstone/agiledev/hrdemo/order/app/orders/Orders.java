package com.isoftstone.agiledev.hrdemo.order.app.orders;




public class Orders {

	private String order_id;
	
	private Integer user_id;
	
	private String order_date;
	
	private String pay_way;
	
	private Integer total_money;
	
	private String order_state;
	
	private String order_commodity_id;
	
	private Integer commodity_count;
	
	private String deliver_way;

	public Orders(){
		
	}
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getPay_way() {
		return pay_way;
	}
	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}
	public Integer getTotal_money() {
		return total_money;
	}
	public void setTotal_money(Integer total_money) {
		this.total_money = total_money;
	}
	public String getOrder_state() {
		return order_state;
	}
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
	public String getOrder_commodity_id() {
		return order_commodity_id;
	}
	public void setOrder_commodity_id(String order_commodity_id) {
		this.order_commodity_id = order_commodity_id;
	}
	public Integer getCommodity_count() {
		return commodity_count;
	}
	public void setCommodity_count(Integer commodity_count) {
		this.commodity_count = commodity_count;
	}
	public String getDeliver_way() {
		return deliver_way;
	}
	public void setDeliver_way(String deliver_way) {
		this.deliver_way = deliver_way;
	}
	
	
}