package gameoflife.models;

import gameoflife.models.CellColor;

public class CellState {
	public final String name;
	public final CellColor color;

	public CellState(String name, CellColor color) {
		this.name = name;
		this.color = color;
	}

	// TODO if this needs to change, change it
	public String toString() {
		return name;
	}
}