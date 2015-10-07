package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 07/10/2015.
 */
public class InventoryTest {

    @Test
    public void testUpdateQuality() throws Exception {
        Inventory i = new Inventory();
        i.updateQuality();
        assertEquals(9, i.GetItems()[0].getSellIn());
        assertEquals(19, i.GetItems()[0].getQuality());
        i.updateQuality();
        i.updateQuality();
        assertEquals(17, i.GetItems()[0].getQuality());

        Item[] newitems;
        newitems = new Item[]{
                new AgedBrieKind("Aged Brie", 5, 15),
                new BackstageKind("BackBack", 0, 5),
                new SulfurateKind("Sulfuras, Hand of Ragnaros", 0, 80),
        };

        Inventory j = new Inventory(newitems);

        j.updateQuality();
        assertEquals(16, newitems[0].getQuality());
        assertEquals(0,newitems[1].getQuality());
        assertEquals(80, newitems[2].getQuality());
        j.updateQuality();
        assertEquals(17, newitems[0].getQuality());
        assertEquals(0,newitems[1].getQuality());
        assertEquals(80,newitems[2].getQuality());

    }
}