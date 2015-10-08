package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 07/10/2015.
 */
public class InventoryTest {

    @Test
    public void testUpdateQuality() throws Exception {
        /*
            The following tests will operate with the implemented array items[] in the class
         */
        Inventory i = new Inventory();
        i.updateQuality();
        assertEquals(9, i.GetItems()[0].getSellIn());   //Check if the first Item returns the expected SellIn
        assertEquals(19, i.GetItems()[0].getQuality()); //Check if the first Item returns the expected quality
        i.updateQuality();
        i.updateQuality();
        assertEquals(17, i.GetItems()[0].getQuality()); //Check if the first Item returns the expected quality


        /*
            The following tests will operate with the array newitems[] which we will create
         */
        Item[] newitems;
        /*
            Insertion of Items in the array
         */
        newitems = new Item[]{
                new AgedBrieKind("Aged Brie", 5, 15),
                new BackstageKind("BackBack", 0, 5),
                new SulfurateKind("Sulfurasras", 0, 95),
        };

        Inventory j = new Inventory(newitems);

        j.updateQuality();
        assertEquals(16, newitems[0].getQuality()); //Check if the first Item returns the expected quality
        assertEquals(0,newitems[1].getQuality());   //Check if the second Item returns the expected quality
        assertEquals(95, newitems[2].getQuality()); //Check if the third Item returns the expected quality
        j.updateQuality();
        assertEquals(17, newitems[0].getQuality()); //Check if the first Item returns the expected quality
        assertEquals(0,newitems[1].getQuality());   //Check if the second Item returns the expected quality
        assertEquals(95,newitems[2].getQuality());  //Check if the third Item returns the expected quality

    }
}