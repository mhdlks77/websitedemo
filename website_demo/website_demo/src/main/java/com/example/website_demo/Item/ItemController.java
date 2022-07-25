package com.example.website_demo.Item;

import org.springframework.stereotype.Controller;

@RestController
public class ItemController {
  
  @AutoWired
  private ItemRepository itemRepository;
  
  @GetMapping 
  public List<Item> getItem(){
    var items = itemRepository.findAll();
    return items;
  }
  
  @PostMapping
  public void saveItem(Item item){
    itemRepository.save(item);
    
  }
  
}
