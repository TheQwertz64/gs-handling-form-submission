package com.example.storeSystem;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("repoService")
public class RepoService {
    
    @Autowired
    private RecTVRepository tvrepo;

    //sample db
    private List<RecTV> tvInventory = new ArrayList<>(Arrays.asList(
        new RecTV(1L, "HJ1234", "42\"","1920x1080","LG", 42, 394.99f),
        new RecTV(2L, "KL4231","55\"","1280x720", "TCL", 12, 349.99f),
        new RecTV(3L, "MN8777", "60\"", "3840x2160", "Sony", 21, 849.99f),
        new RecTV(4L, "JB3212", "32\"", "1920x1080", "Toshiba", 33, 274.99f),
        new RecTV(5L, "OP1282", "70\"", "4096x2160", "Samsung", 5, 1699.99f),
        new RecTV(6L, "NE6423", "55\"", "4096x2160", "Samsung", 0, 999.99f)
    ));


    public List<RecTV> getAllTvs(){
        List<RecTV> alltvs = new ArrayList<>();
        tvrepo.findAll().forEach(tvInventory::add);
        return alltvs;
    }

    public RecTV findThatTv(long sid){
        return tvrepo.findBysid(sid);
    }


    /*Bad check method but basically if the tv the user searched
    matches two of the criteria of one in the db, the site will
    display that one for viewing, this implementation is really
    bad since it no way to deal with the fact that tvs will
    have the same values in some cases and should use a more 
    thoughout searching methodology
    */
    public Optional<RecTV> findByTwo(RecTV filler){
        int pts = 0;
        Optional<RecTV> foundTv = Optional.ofNullable(new RecTV());
        if(filler.getModel() != null){
            if(tvrepo.findByModel(filler.getModel()) != null){ 
                pts++;
                foundTv = tvrepo.findByModel(filler.getModel());
            }
        }
        if(filler.getSize() != null){
            if(tvrepo.findBySize(filler.getSize()) != null){ 
                pts++;
                foundTv = tvrepo.findBySize(filler.getSize());
            }
        }
        if(filler.getResolution() != null){
            if(tvrepo.findByResolution(filler.getResolution()) != null){ 
                pts++;
                foundTv = tvrepo.findByResolution(filler.getResolution());
            }
        }
        if(filler.getPrice() != 0.0f){
            if(tvrepo.findByPrice(filler.getPrice()) != null){ 
                pts++;
                foundTv = tvrepo.findByPrice(filler.getPrice());
            }
        }
        if(pts > 1){
            return foundTv;
        }
        return null;

    }

}
