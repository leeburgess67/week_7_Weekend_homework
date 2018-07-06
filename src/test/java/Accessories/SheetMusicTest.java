package Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Sheet Music", 5.00, 9.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Sheet Music",sheetMusic.getDescription());
    }


    @Test
    public void canGetCostPrice(){
        assertEquals(5.00,sheetMusic.getCostPrice(), 0);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(9.99,sheetMusic.getRetailPrice(), 0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(4.99,sheetMusic.calculateMarkup(), 0);
    }


}
