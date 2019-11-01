package com.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GildedRoseTest {

    Item[] items;
    GildedRose gildedRose;


    @Test
    public void should_decrease_quality_by_1_when_update_quality () {
        // Arrange
        items = new Item[]{new Item("Rose", 10, 20)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(19);
    }

    @Test
    public void should_decrease_day_by_1_when_update_quality() {
        // Arrange
        items = new Item[]{new Item("Rose", 10, 20)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getSellIn()).isEqualTo(9);
    }

    @Test
    public void should_decrease_quality_twice_when_sell_by_date_passed () {
        // Arrange
        items = new Item[]{new Item("Rose", 0, 50)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(48);
    }

    @Test
    public void should_not_return_negative_quality () {
        // Arrange
        items = new Item[]{new Item("Rose", 10, 0)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(0);
    }

    @Test
    public void should_increase_quality_when_aged_brie_item () {
        // Arrange
        items = new Item[]{new Item("Aged Brie", 10, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(16);
    }

    @Test
    public void should_return_maximum_quality_value_50_when_quality_is_greater_than_50_test1 () {
        // Arrange
        items = new Item[]{new Item("Aged Brie", 10, 60)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(50);
    }

    @Test
    public void should_return_maximum_quality_value_50_when_quality_is_greater_than_50_test2 () {
        // Arrange
        items = new Item[]{new Item("Rose", 10, 60)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(49);
    }

    @Test
    public void should_not_decrease_quality_when_item_is_sulfuras () {
        // Arrange
        items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(15);
    }

    @Test
    public void should_not_be_sold_quality_when_item_is_sulfuras () {
        // Arrange
        items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getSellIn()).isEqualTo(10);
    }

    @Test
    public void should_increase_quality_by_2_when_backstage_passes_and_sell_in_10d_or_less () {
        // Arrange
        items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(17);
    }

    @Test
    public void should_increase_quality_by_3_when_backstage_passes_and_sell_in_5d_or_less () {
        // Arrange
        items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(18);
    }


    @Test
    public void should_decrease_to_0_when_backstage_passes_take_concert () {
        // Arrange
        items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(0);
    }

    @Test
    public void should_increase_by_1_otherwise () {
        // Arrange
        items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 20, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(16);
    }
   @Test
    public void should_decrease_by_2_when_item_is_conjured () {
        // Arrange
        items = new Item[]{new Item("Conjured", 10, 15)};
        gildedRose = new GildedRose(items);

        // Act
        gildedRose.updateQuality();

        // Assert
        assertThat(items[0].getQuality()).isEqualTo(13);
    }



}
