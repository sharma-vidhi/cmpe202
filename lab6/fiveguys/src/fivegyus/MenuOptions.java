package fivegyus;

import java.util.ArrayList;
import java.util.List;

public class MenuOptions {
	
	private String description;
	private Double price ;
	private List<MenuOptions> toppings;
	
	public void addChild(MenuOptions i) {
		toppings.add(i);
		
	}

	public void removeChild(MenuOptions i) {
		toppings.remove(i);
	}

	public List<MenuOptions> getChild() {
		return toppings;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public MenuOptions(String description, Double price) {
		this.description = description;
		this.price = price;
		toppings = new ArrayList<MenuOptions>();
	}

	@Override
	public String toString() {
		return  description ;
	}
	
	

	


}
