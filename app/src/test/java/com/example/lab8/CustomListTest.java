package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int size = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), size + 1);
    }

    /**
     * create a CustomList
     * check to see if hasCity indicates that city is in the list
     */
    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB");
        list = MockCityList();
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * create a list, add a city, then try and delete it
     */
    @Test
    public void deleteCityTest() {
        City city = new City("Edmonton", "AB");
        list = MockCityList();
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    /**
     * create a list, add some cities, check the count
     */
    @Test
    public void cityCountTest() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.addCity(city);
        assertEquals(list.countCities(), 2);
    }
}
