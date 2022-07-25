package com.example.website_demo;

import com.example.website_demo.Item.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {


  @GetMapping
  public String getItem(@RequestParam Long id){
    // Item item = itemRepository.findById(id):
    Item item = new Item(id, "Hammoudi", 15D, 5);
    return item.getName() + " - " + item.getId();

  }

  @PostMapping
  public Item saveItem(@RequestBody Item item){
    //itemRepository.save(item);
    Item item1 = new Item(1L, "Hammoudi", 15D, 5);
    return item1;
  }


  
}
