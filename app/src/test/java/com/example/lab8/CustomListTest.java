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
    public void hasCityTest() {
        list = MockCityList();
        City city1 = new City("Toronto", "ON");
        City city2 = new City("Montreal", "QC");
        City city3 = new City("Vancouver", "BC");
        list.addCity(city1);
        list.addCity(city2);
        assertTrue(list.hasCity(city1));
        assertTrue(list.hasCity(city2));
        assertFalse(list.hasCity(city3));
    }
}
