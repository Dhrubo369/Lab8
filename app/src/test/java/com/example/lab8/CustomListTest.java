package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city1 = new City("Toronto", "ON");
        City city2 = new City("Montreal", "QC");
        list.addCity(city1);
        list.addCity(city2);
        int initialSize = list.getCount();
        list.deleteCity(city1);
        assertEquals(list.getCount(), initialSize - 1);
        assertFalse(list.hasCity(city1));
    }
}
