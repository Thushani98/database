package com.ijse.database.repository;

import org.springframework.stereotype.Repository;
import com.ijse.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository<User , Long>{
    
    

}
