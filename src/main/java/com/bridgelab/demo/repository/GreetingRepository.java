package com.bridgelab.demo.repository;
import com.bridgelab.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{

}
