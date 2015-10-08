package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class NormalKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        NormalKind n = new NormalKind("normal",1,10);
        n.updateQuality();  //here the quality and the sellIn will decrease by 1
        assertEquals(9, n.getQuality());
        n.updateQuality();  //here the quality will decrease by 1 because the SellIn < 0
        assertEquals(7, n.getQuality());
        n.setQuality(1);    //here we set the quality as 1
        n.updateQuality();  //here the quality will be 0
        assertEquals(0, n.getQuality());
    }
}