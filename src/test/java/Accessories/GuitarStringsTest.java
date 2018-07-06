package Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings strings;

    @Before
    public void before(){
        strings = new GuitarStrings("Ernie Ball", 3.50, 5.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Ernie Ball",strings.getDescription());
    }


    @Test
    public void canGetCostPrice(){
        assertEquals(3.50,strings.getCostPrice(), 0);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(5.99,strings.getRetailPrice(), 0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(2.49,strings.calculateMarkup(), 0);
    }



}
