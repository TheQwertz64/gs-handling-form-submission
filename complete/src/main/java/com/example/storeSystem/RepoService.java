package com.example.storeSystem;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("repoService")
public class RepoService {
    
    @Autowired
    private RecTVRepo tvrepo;

    //https://www.youtube.com/watch?v=lpcOSXWPXTk&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=29
    private List<RecTV> tvInventory = new ArrayList<>(Arrays.asList(
        new RecTV(),
        new RecTV(),
        new RecTV(),
        new RecTV(),
        new RecTV()
    ));

    public List<RecTVRepo> getAllTvs(){
        List<RecTVRepo> alltvs = new ArrayList<>();
        tvrepo.findAll().forEach(tvInventory::add);
        return alltvs;
    }

    public void addTV(RecTV newTv){
        tvInventory.add(newTv);
    }


    
    //public void saveRecTVRepo (RecTVRepo newRepo){
    //        tvrepo.save(newRepo);
    //}

    //public void deleteTV(String id) {
    //    tvrepo.removeIf(tv -> tv.getId().equals(id));
    //}
}
