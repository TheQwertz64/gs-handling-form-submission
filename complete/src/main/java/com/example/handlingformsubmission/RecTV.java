package com.example.handlingformsubmission;

public class RecTV {
    protected String model;
    protected String size;
    protected String resolution;
    protected String manufacturer;
    protected float discount;
    protected int stock;
    protected float price;
    protected String priceRange;

    public RecTV(){
        this.model = null;
        this.size = null;
        this.resolution = null;
        this.manufacturer = null;
        this.discount = 0;
        this.stock = 0;
        this.price = 0;
    }

    public RecTV(String model, String size, String resolution, String manufacturer, float discount, int stock, float price){
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.discount = discount;
        this.stock = stock;
        this.price = price;
    }

    public boolean checkDisplayTV(){
        if (this.getStock() == 1){
            return true;
        }
        return false;
    }

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

}
