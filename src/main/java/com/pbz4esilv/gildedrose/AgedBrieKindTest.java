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
        ag.updateQuality();
        ag.updateQuality();
        assertEquals(18,ag.getQuality());
        assertEquals(10,ag.getSellIn());

    }
}