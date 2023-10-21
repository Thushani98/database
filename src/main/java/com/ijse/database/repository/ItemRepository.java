package com.ijse.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.database.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item , Long>{
    
}
