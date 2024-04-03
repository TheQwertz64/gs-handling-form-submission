package com.example.handlingformsubmission;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RecTVRepo extends CrudRepository<RecTV, Long> {

        List<RecTV> findByContent(String Model);

        Optional<RecTV> findById(Long id);
}
