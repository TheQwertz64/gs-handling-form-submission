package com.example.storeSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.annotation.Generated;

@Entity
public class RecTV {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    protected Long sid;
    protected String model;
    protected String size;
    protected String resolution;
    protected String manufacturer;
    //protected float discount;
    protected int stock;
    protected float price;

    public RecTV(){
        this.sid = 0L;
        this.model = null;
        this.size = null;
        this.resolution = null;
        this.manufacturer = null;
        //this.discount = 0;
        this.stock = 0;
        this.price = 0;
    }

    public RecTV(long sid, String model, String size, String resolution, String manufacturer, int stock, float price){
        this.sid = sid;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        //this.discount = discount;
        this.stock = stock;
        this.price = price;
    }

    public Long getId() {
		return id;
	}

	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}

    /*public boolean checkDisplayTV(){
        if (this.getStock() == 1){
            return true;
        }
        return false;
    }*/

    public void setResolution(String res){
        this.resolution = res;
    }

    public String getResolution(){
        return this.resolution;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getStock(){
        return this.stock;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setManufacturer(String man){
        this.manufacturer = man;
    }

    @Override
    public String toString(){
        return String.format("TV[sid=%d, model='%s', size='%s', res='%s',manufacturer='%s', stock='%i', price='%f']",
        sid,model, size, resolution, manufacturer, stock, price);
    }

}
