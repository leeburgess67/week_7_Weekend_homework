import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar lesPaul;

    @Before
    public void before(){
        lesPaul = new Guitar("Les Paul", "Black", "Rosewood", true, InstrumentType.STRINGS, 350.00, 599.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Les Paul", lesPaul.getName());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", lesPaul.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Rosewood", lesPaul.getMaterial());
    }

    @Test
    public void canGetIsElectric(){
        assertEquals(true, lesPaul.isElectric());
    }


}
