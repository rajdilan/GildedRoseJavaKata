package com.pbz4esilv.gildedrose;

/**
 * Created by Dilan on 06/10/2015.
 */
/*
    This class is created for the Items which will have the same evolution in quality as Sulfurate
*/

public class SulfurateKind extends Item implements ISulfurateKind{
    public SulfurateKind(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){
        setQuality(getQuality());   //the quality never change for the Sulfarate
    }
}
