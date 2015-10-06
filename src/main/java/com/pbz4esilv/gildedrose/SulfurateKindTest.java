package com.pbz4esilv.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class SulfurateKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        SulfurateKind s = new SulfurateKind("nnnn",2,95);
        s.updateQuality();
        assertEquals(95,s.getQuality());

    }
}