package com.pbz4esilv.gildedrose;

public class Inventory {

    private Item[] items;

    public Item[] GetItems(){
        return items;   //It is needed for the InventoryTest Class
    }

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        //We have replaced the correct constructor for each Item
        items = new Item[]{
                new NormalKind("+5 Dexterity Vest", 10, 20),
                new AgedBrieKind("Aged Brie", 2, 0),
                new NormalKind("Elixir of the Mongoose", 5, 7),
                new SulfurateKind("Sulfuras, Hand of Ragnaros", 0, 80),
                new BackstageKind("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new ConjuredKind("Conjured Mana Cake", 3, 6)
        };

    }

    /*  each item in the array items[] will be checked for which class they are instance of and it will apply
        the specific updateQuality() method
    */

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof IAgedBrieKind) {
                ((AgedBrieKind) items[i]).updateQuality();
            }
            if (items[i] instanceof IBackstageKind) {
                ((BackstageKind) items[i]).updateQuality();
            }
            if (items[i] instanceof IConjuredKind) {
                ((ConjuredKind) items[i]).updateQuality();
            }
            if (items[i] instanceof INormalKind) {
                ((NormalKind) items[i]).updateQuality();
            }
            if (items[i] instanceof ISulfurateKind) {
                ((SulfurateKind) items[i]).updateQuality();
            }
        }
    }
}
