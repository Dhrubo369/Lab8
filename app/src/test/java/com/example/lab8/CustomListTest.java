package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private CustomList list2;
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
        list2 = MockCityList();

        City city1 = new City("Toronto", "ON");
        list2.addCity(city1);
        int listSize = list2.getCount();
        list2.deleteCity(city1);
        assertEquals(list2.getCount(), listSize - 1);
    }

    @Test
    public void countCityTest() {
        list = MockCityList();
        City city1 = new City("Toronto", "ON");
        City city2 = new City("Montreal", "QC");
        City city3 = new City("Toronto", "ON");
        list.addCity(city1);
        list.addCity(city2);
        list.addCity(city3);
        assertEquals(list.countCity("Toronto"), 2);
        assertEquals(list.countCity("Montreal"), 1);
        assertEquals(list.countCity("Vancouver"), 0);
    }
}

