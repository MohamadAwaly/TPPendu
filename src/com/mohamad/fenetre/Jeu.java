package com.mohamad.fenetre;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Jeu extends JPanel {
	
	private Color color = Color.white;
	
	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

	}

}
