package Shop;

import Accessories.GuitarStrings;
import Accessories.SheetMusic;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    GuitarStrings strings;
    SheetMusic sheetMusic;
    ArrayList<ISell> products;


    @Before
    public void before(){
        strings = new GuitarStrings("Ernie Ball", 3.50, 5.99);
        sheetMusic = new SheetMusic("Sheet Music", 5.00, 9.99);
        products = new ArrayList<ISell>();
        products.add(strings);
        products.add(sheetMusic);

        shop = new Shop(products);
    }

    @Test
    public void canGetProducts() {
        assertEquals(2, shop.getProducts().size());
    }
}
