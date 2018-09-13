package main;

import java.awt.Color;

import items.TypeOfItem;

/**
 * List all the rarity
 * @author MissBipBip
 *
 */
public enum Rarity {
    Common(Color.GRAY),
    Uncommon(Color.YELLOW),
    Rare(Color.GREEN),
    Very_Rare(Color.MAGENTA),
    Ultra_Rare(Color.PINK);
	
	private final Color color;
	
	Rarity(Color color) {
        this.color = color;
    }

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
}
