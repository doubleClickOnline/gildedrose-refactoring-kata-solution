package com.gildedrose.items;

import com.gildedrose.items.types.AgedBrie;
import com.gildedrose.items.types.BackstagePassesTAFKAL80ETConcert;
import com.gildedrose.items.types.Item;
import com.gildedrose.items.types.SulfurasHandOfRagnaros;

public class ItemFactory {

	public Item create(String name, int sellIn, int quality) {
		switch (name) {
			case "Aged Brie":									return new AgedBrie(name, sellIn, quality);
			case "Sulfuras, Hand of Ragnaros":					return new SulfurasHandOfRagnaros(name, sellIn, quality);
			case "Backstage passes to a TAFKAL80ETC concert":		return new BackstagePassesTAFKAL80ETConcert(name, sellIn, quality);
		}
		return new Item(name, sellIn, quality);
	}
}
