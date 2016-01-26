package com.sample;

public class ShipingFurniture {
	/*public enum Type {
		SMALL, MEDIUM, BIG
	}*/
	
	private float sellPrice;
	private float totalPrice;
	int shipingCost;
//	private Type typeOfShiping;
	
	public float getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getShipingCost() {
		return shipingCost;
	}
	public void setShipingCost(int shipingCost) {
		this.shipingCost = shipingCost;
		setTotalPrice();
	}
	public float getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice() {
		this.totalPrice = getSellPrice() + getShipingCost();
	}
	/*public Type getTypeOfShiping() {
		return typeOfShiping;
	}
	public void setTypeOfShiping(Type typeOfShiping) {
		this.typeOfShiping = typeOfShiping;
	}*/
	
	public String toString() {
		return "Total cost for the aquisition: " + getTotalPrice() + ". " + "The shiping costs were: " + getShipingCost();
	}
	
}
