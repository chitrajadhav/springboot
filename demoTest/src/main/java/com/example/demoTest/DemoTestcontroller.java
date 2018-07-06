package com.example.demoTest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTestcontroller {

	@Autowired
	private ServiceItem serviceItem;
	
	
	@RequestMapping("/entry")
	public String getString()
	{
		return "hello Chitra";
	}
	
	@RequestMapping("/en")
	public int getID()
	{
		return 10;
	}
	
	/*@RequestMapping("/item")
	public List<Item> getAllItems()
	{
		return Arrays.asList( 
		new Item(10,"Item1","main Item"),
		new Item(11,"Item2","second Item"),
		new Item(12,"Item3","third Item"),
		new Item(13,"Item4","forth Item")
		);
		
	}*/
	@RequestMapping("/item")
	public List<Item> getAllItem()
	{
		return  serviceItem.getAllItems();
	}
	
	@RequestMapping("/item/{Id}")
	public Item getItem(@PathVariable String Id)
	{
		return serviceItem.getItem(Id);
	}
	
	@RequestMapping(method= RequestMethod.POST,value="/item")
	public void addItem(@RequestBody Item item)
	{
		serviceItem.addItem(item);
		
	}
	
	@RequestMapping(method= RequestMethod.PUT,value="/item/{id}")
	public void updateItem(@RequestBody Item item, @PathVariable String id)
	{
		serviceItem.updateItem(id, item);
		
	}

	@RequestMapping(method= RequestMethod.DELETE,value="/item/{id}")
	public void deleteItem( @PathVariable String id)
	{
		serviceItem.deleteItem(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
