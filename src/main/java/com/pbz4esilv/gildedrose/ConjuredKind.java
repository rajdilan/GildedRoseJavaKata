package com.pbz4esilv.gildedrose;

/**
 * Created by Dilan on 06/10/2015.
 */
public class ConjuredKind extends Item implements IConjuredKind{
    public ConjuredKind(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    public void updateQuality() {

        if(getQuality()>0) {
            setQuality(getQuality() - 2);
        }
        if(getSellIn()<0) {
            setQuality(getQuality() - 2);
        }
        if(getQuality()<=0){
            //setQuality(getQuality()-getQuality());
            setQuality(0);
        }
    }
}
