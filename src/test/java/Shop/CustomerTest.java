package Shop;

import Accessories.GuitarStrings;
import Accessories.SheetMusic;
import Instruments.Drums;
import Instruments.ENUMS.InstrumentType;
import Instruments.Guitar;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    Drums drums;
    GuitarStrings strings;
    SheetMusic sheetMusic;
    ArrayList<ISell> products;
    Shop shop;

    @Before
    public void before() {
        customer1 = new Customer("Jimbo", 1000);
        customer2 = new Customer("Skinto", 100);
        strings = new GuitarStrings("Ernie Ball", 3.50, 5.99);
        sheetMusic = new SheetMusic("Sheet Music", 5.00, 9.99);
        drums = new Drums("Yamaha custom kit", "Green", "Maple", false, InstrumentType.PERCUSSION, 400.00, 699.00);
        products = new ArrayList<>();
        products.add(strings);
        products.add(sheetMusic);

        shop = new Shop(products);
    }

    @Test
    public void customerCanPurchaseIfEnoughMoney(){
        customer1.purchaseItem(drums, shop);
        assertEquals(1, customer1.getBasket().size());
    }

    @Test
    public void customerCantPurchaseIfNotEnoughMoney(){
        customer2.purchaseItem(drums, shop);
        assertEquals(0, customer1.getBasket().size());
    }









}

