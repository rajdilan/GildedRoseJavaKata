package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class BackstageKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        BackstageKind b = new BackstageKind("bcs",11,12);
        b.updateQuality();  //here the quality will increase by 1
        assertEquals(13, b.getQuality());
        b.updateQuality();  //here the quality will increase by 2 because the sellIn < 11
        assertEquals(15, b.getQuality());
        b.setSellIn(5);
        b.updateQuality();  //here the quality will increase by 3 because the sellIn < 6
        assertEquals(18, b.getQuality());
        b.setSellIn(0);
        b.updateQuality(); //here the quality will be 0 because sellIn < 0
        assertEquals(0, b.getQuality());
    }
}