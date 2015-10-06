package com.pbz4esilv.gildedrose;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dilan on 06/10/2015.
 */
public class ConjuredKindTest {

    @Test
    public void testUpdateQuality() throws Exception {
        ConjuredKind ck = new ConjuredKind("name",3,1);
        //ck.updateQuality();
        assertEquals(520,ck.getSellIn());
    }


}