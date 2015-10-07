package com.pbz4esilv.gildedrose;

/**
 * Created by Dilan on 06/10/2015.
 */
public class ConjuredKind extends Item implements IConjuredKind {

    public ConjuredKind(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setQuality(getQuality() - 2);
        setSellIn(getSellIn() - 1);
        if(getSellIn()<0) {
            setQuality(getQuality() - 2);
        }
        if(getQuality()<=0) {
            setQuality(getQuality() - getQuality());
        }

    }
}
