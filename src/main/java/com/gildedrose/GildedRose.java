package com.gildedrose;

class GildedRose {
    Item[] items;

    final private String agedBrie   = "Aged Brie";
    final private String backstage  = "Backstage passes to a TAFKAL80ETC concert";
    final private String conjured   = "Conjured";
    final private String sulfuras   = "Sulfuras, Hand of Ragnaros";

    public GildedRose (Item[] items) {
        this.items = items;
    }

    public void updateQuality () {
        for (int i = 0; i < items.length; i++) {

            if (items[i].getName().equals(agedBrie)) {
                items[i].setQuality(items[i].getQuality() + 1);
                items[i].setSellIn(items[i].getSellIn() - 1);

            } else if (items[i].getName().equals(backstage)) {
                if (items[i].getSellIn() == 0) {
                    items[i].setQuality(0);
                } else if ((items[i].getSellIn() <= 10) && (items[i].getSellIn() > 5)) {
                    items[i].setQuality(items[i].getQuality() + 2);
                    items[i].setSellIn(items[i].getSellIn() - 1);
                } else if ((items[i].getSellIn() <= 5) && (items[i].getSellIn() > 0)) {
                    items[i].setQuality(items[i].getQuality() + 3);
                    items[i].setSellIn(items[i].getSellIn() - 1);
                } else {
                    items[i].setQuality(items[i].getQuality() + 1);
                    items[i].setSellIn(items[i].getSellIn() - 1);
                }
            } else if (items[i].getName().equals(conjured)) {
                items[i].setQuality(items[i].getQuality() - 2);
                items[i].setSellIn(items[i].getSellIn() - 1);
            } else if (!items[i].getName().equals(sulfuras)) {
                if (items[i].getSellIn() == 0) {
                    items[i].setQuality(items[i].getQuality() - 2);
                } else {
                    items[i].setQuality(items[i].getQuality() - 1);
                    items[i].setSellIn(items[i].getSellIn() - 1);
                }
            }


            if (items[i].getQuality() < 0) {
                items[i].setQuality(0);
            }

            if (items[i].getQuality() > 50) {
                items[i].setQuality(50);
            }



  /*          if (!items[i].getName().equals("Aged Brie")
                    && !items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].getQuality() > 0) {
                    if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0) {
                if (!items[i].getName().equals("Aged Brie")) {
                    if (!items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].getQuality() > 0) {
                            if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(0);
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }*/
        }
    }
}