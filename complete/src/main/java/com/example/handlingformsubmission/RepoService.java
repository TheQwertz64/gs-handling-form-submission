package com.example.handlingformsubmission;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("repoService")
public class RepoService {
    
    @Autowired
    RecTVRepo tvrepo;

    
    //public void saveRecTVRepo (RecTVRepo newRepo){
    //        tvrepo.save(newRepo);
    //}

    //public void deleteTV(String id) {
    //    tvrepo.removeIf(tv -> tv.getId().equals(id));
    //}
}
