package com.pbz4esilv.gildedrose;

/**
 * Created by Dilan on 06/10/2015.
 */
/*
    This class is created for the Items which will have the same evolution in quality as Backstage
*/
public class BackstageKind extends Item implements IBackstageKind {

    public BackstageKind(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
            if (getSellIn() < 11) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }

            if (getSellIn() < 6) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            setQuality(getQuality() - getQuality());
        }
    }
}
