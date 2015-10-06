package com.pbz4esilv.gildedrose;

/**
 * Created by Dilan on 06/10/2015.
 */
public class SulfurateKind extends Item implements ISulfurateKind{
    public SulfurateKind(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        setQuality(getQuality());
    }
}
