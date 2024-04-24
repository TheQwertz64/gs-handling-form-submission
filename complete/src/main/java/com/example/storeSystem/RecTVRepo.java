package com.example.storeSystem;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RecTVRepo extends CrudRepository<RecTV, Integer> {
    
        //List<RecTV> findBymodel(String model);

        Optional<RecTV> findById(int id);

        Optional<RecTV> findBysid(Long sid);

        Optional<RecTV> findByModel(String model);

        Optional<RecTV> findBySize(String size);

        Optional<RecTV> findByResolution(String resolution);

        Optional<RecTV> findByPrice(float price);


}
