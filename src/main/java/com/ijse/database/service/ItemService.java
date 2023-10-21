package com.ijse.database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.database.entity.Item;

@Service
public interface ItemService {
    Item createItem(Item item);//create method
    Item getItemById(Long id);//read user by category_id
    List <Item> getAllItems();//read all categories
    Item updateItem(Long id, Item item);//update by id

    
}
