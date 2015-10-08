package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class ConjuredKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        ConjuredKind ck = new ConjuredKind("nn", 1 , 7);
        ck.updateQuality(); //here the quality will decrease by 2
        assertEquals(5,ck.getQuality());
        ck.updateQuality(); //here the quality will decrease by 4 because the sellIn < 0
        assertEquals(1, ck.getQuality());
        ck.updateQuality(); //here the quality will be 0
        assertEquals(0,ck.getQuality());

    }
}