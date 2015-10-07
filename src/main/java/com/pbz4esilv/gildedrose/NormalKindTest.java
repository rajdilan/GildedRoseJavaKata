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
        n.updateQuality();
        assertEquals(9, n.getQuality());
        n.updateQuality();
        assertEquals(7, n.getQuality());
        n.setQuality(1);
        n.updateQuality();
        assertEquals(0, n.getQuality());
    }
}