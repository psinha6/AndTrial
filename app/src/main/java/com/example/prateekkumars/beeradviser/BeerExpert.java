package com.example.prateekkumars.beeradviser;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by prateekkumars on 3/15/2017.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Jack Amber");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
