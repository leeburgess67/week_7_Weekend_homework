package Instruments;

import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano grandPiano;


    @Before
    public void before() {
        grandPiano = new Piano("Grand Piano", "Black", "Hardwood", false, InstrumentType.KEYS, 3500.00, 5990.00);


    }

    @Test
    public void canGetName() {
        assertEquals("Grand Piano", grandPiano.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", grandPiano.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Hardwood", grandPiano.getMaterial());
    }

    @Test
    public void canGetIsElectric() {
        assertEquals(false, grandPiano.isElectric());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.KEYS, grandPiano.getInstrumentType());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plonk - I'm a Piano", grandPiano.play());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(3500.00, grandPiano.getCostPrice(), 0);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(5990.00, grandPiano.getRetailPrice(), 0);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(2490.00, grandPiano.calculateMarkup(), 0);
    }


}
