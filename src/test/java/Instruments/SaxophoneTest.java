package Instruments;

import Instruments.ENUMS.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Saxamaphone", "Gold", "Shiny Brass", false, InstrumentType.BRASS, 400.00, 599.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Saxamaphone",saxophone.getName());
    }

    @Test
    public void canGetColour(){
        assertEquals("Gold",saxophone.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Shiny Brass",saxophone.getMaterial());
    }

    @Test
    public void canGetIsElectric(){
        assertEquals(false,saxophone.isElectric());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.BRASS,saxophone.getInstrumentType());
    }

    @Test
    public void canPlay(){
        assertEquals("Baker Street",saxophone.play());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(400.00,saxophone.getCostPrice(), 0);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(599.00,saxophone.getRetailPrice(), 0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(199.00,saxophone.calculateMarkup(), 0);
    }



}
