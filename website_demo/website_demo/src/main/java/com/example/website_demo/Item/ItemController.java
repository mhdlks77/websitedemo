package com.example.website_demo.Item;

import org.springframework.stereotype.Controller;

@RestController
public class ItemController {
  
  @AutoWired
  private ItemRepository itemRepository;
  
  @GetMapping 
  public Item getItem(){
    var item = itemRepository.findAll();
    return item;
  }
  
  @PostMapping
  public void saveItem(Item item){
    itemRepository.save(item);
    
  }
  
}
