package com.example.handlingformsubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RepoService")
public class RepoService {
    @Autowired
    RecTVRepo tvrepo;

    public void saveTVs (RecTVRepo newRepo){
        //tvrepo.save(newRepo);
    }
}
