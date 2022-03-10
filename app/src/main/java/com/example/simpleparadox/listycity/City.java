package com.example.simpleparadox.listycity;

public class City {
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(Object o) {
        City otherCity = (City) o;
        return this.city.equals(otherCity.city) && this.province.equals(otherCity.province);
    }
}
