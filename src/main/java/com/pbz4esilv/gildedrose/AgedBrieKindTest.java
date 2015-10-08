package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class AgedBrieKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        AgedBrieKind ag = new AgedBrieKind("aged",12,16);
        ag.updateQuality(); //here the quality and the sellIn will increase by 1
        ag.updateQuality(); //here the quality and the sellIn will increase by 1
        assertEquals(18, ag.getQuality());
        assertEquals(10, ag.getSellIn());
        ag.setSellIn(0);
        ag.updateQuality(); //here the quality will increase by 2
        assertEquals(20, ag.getQuality());

    }
}