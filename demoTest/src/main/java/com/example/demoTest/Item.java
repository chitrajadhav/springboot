package com.example.demoTest;

public class Item {

	private String Id;
	private String itemName;
	private String itemDescription;
	
	public Item(String id, String itemName, String itemDescription) {
		super();
		Id = id;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", itemName=" + itemName + ", itemDescription=" + itemDescription + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Item() {
		
	}
	
	
}
