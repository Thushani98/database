package com.ijse.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.database.entity.Item;
import com.ijse.database.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(Item item){
        //create user in DB
        return itemRepository.save(item);
    }

    @Override
    public Item getItemById(Long id){
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public List <Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item updateItem(Long id , Item item){
    Item existingItem = itemRepository.findById(id).orElse(null);

        if(existingItem != null){
            existingItem.setName(item.getName());
            return itemRepository.save(existingItem);
        }else{
            return null;
        }
        
    }
    
}
