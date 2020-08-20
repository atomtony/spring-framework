package org.springframework.car;

public class Car {
	private int maxSpee;
	private String brand;
	private double price;

	public int getMaxSpee() {
		return maxSpee;
	}

	public void setMaxSpee(int maxSpee) {
		this.maxSpee = maxSpee;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"maxSpee=" + maxSpee +
				", brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
