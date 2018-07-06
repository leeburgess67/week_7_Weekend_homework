package Shop;

import Accessories.GuitarStrings;
import Accessories.SheetMusic;
import Instruments.Drums;
import Instruments.ENUMS.InstrumentType;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    Shop shop;
    GuitarStrings strings;
    SheetMusic sheetMusic;
    Drums drums;
    ArrayList<ISell> products;


    @Before
    public void before(){
        strings = new GuitarStrings("Ernie Ball", 3.50, 5.99);
        sheetMusic = new SheetMusic("Sheet Music", 5.00, 9.99);
        drums = new Drums("Yamaha custom kit", "Green", "Maple", false, InstrumentType.PERCUSSION, 400.00, 699.00);
        products = new ArrayList<>();
        products.add(strings);
        products.add(sheetMusic);

        shop = new Shop(products);
    }

    @Test
    public void canGetProducts() {
        assertEquals(2, shop.getProducts().size());
    }

    @Test
    public void canAddItemToStock() {
        shop.addStock(drums);
        assertEquals(3, shop.getProducts().size());
    }

    @Test
    public void canGetTotalStockValue__CostPrice(){
        assertEquals(8.50, shop.getTotalValueAtCostPrice(), 0);
    }

    @Test
    public void canGetTotalStockValue__RetailPrice(){
        assertEquals(15.98, shop.getTotalValueAtRetailPrice(), 0);
    }

    @Test
    public void canGetTotalStockValue__Profit(){
        assertEquals(7.48, shop.getTotalProfit(), 0);
    }

    @Test
    public void tillIncreasesWithSale(){
        shop.sellItem(drums);
        assertEquals(799.00, shop.getTill(), 0);
    }


}
