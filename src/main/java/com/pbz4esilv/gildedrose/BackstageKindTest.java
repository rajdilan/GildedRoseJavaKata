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
        b.updateQuality();
        assertEquals(13, b.getQuality());
        b.updateQuality();
        assertEquals(15, b.getQuality());
        b.setSellIn(5);
        b.updateQuality();
        assertEquals(18, b.getQuality());
        b.setSellIn(0);
        b.updateQuality();
        assertEquals(0, b.getQuality());
    }
}