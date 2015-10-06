package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class ConjuredKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        ConjuredKind ck = new ConjuredKind("nn", 1 , 3);
        ck.updateQuality();
        assertEquals(1,ck.getQuality());
        assertEquals(0,ck.getSellIn());
        ck.updateQuality();
        assertEquals(0,ck.getQuality());
        assertEquals(-1,ck.getSellIn());

    }
}