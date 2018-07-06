package com.example.demoTest;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ServiceItem {
	
	private  List<Item> item= Arrays.asList( 
		new Item("10","Item1","main Item"),
		new Item("11","Item2","second Item"),
		new Item("12","Item3","third Item"),
		new Item("13","Item4","forth new Item")
		);

	public List<Item> getAllItems() {
		return item;
	}

	public Item getItem(String id) {
		
		return (Item) item.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		}
		/*	for(int i=0;i<item.size();i++){
			
			Item it=item.get(i);
			if(it.getId().equals(id))
			{
				return item.get(i);
				
			}
			
		}
		return item.get(id);*/

	public void addItem(Item item2) {
		item.add(item2);
	}

	public void updateItem(String id, Item item2) {
		for(int i=0;i<item.size();i++){
			
			Item it=item.get(i);
			if(it.getId().equals(id))
			{
				item.set(i, item2);
				return;
			}
				
				
			}
	}

	public void deleteItem(String id) {
      item.removeIf(t->t.getId().equals(id));
		
	}
	
}
