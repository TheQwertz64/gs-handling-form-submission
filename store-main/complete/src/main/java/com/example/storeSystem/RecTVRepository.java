package com.example.storeSystem;

import java.util.Optional;
import org.springframework.data.repository.query.Param;

import org.springframework.data.repository.CrudRepository;

public interface RecTVRepository extends CrudRepository<RecTV, Integer> {


        RecTV findBysid(@Param("sid") long sid);

        Optional<RecTV> findByModel(String model);

        Optional<RecTV> findBySize(String size);

        Optional<RecTV> findByResolution(String resolution);

        Optional<RecTV> findByPrice(float price);


}
