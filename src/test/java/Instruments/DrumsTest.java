package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("Yamaha custom kit", "Green", "Maple", false, InstrumentType.PERCUSSION, 400.00, 699.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha custom kit",drums.getName());
    }

    @Test
    public void canGetColour(){
        assertEquals("Green",drums.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Maple",drums.getMaterial());
    }

    @Test
    public void canGetIsElectric(){
        assertEquals(false,drums.isElectric());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.PERCUSSION,drums.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("Bish Bosh, Ting",drums.play());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(400.00,drums.getCostPrice(), 0);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(699.00,drums.getRetailPrice(), 0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(299.00,drums.calculateMarkup(), 0);
    }



}
