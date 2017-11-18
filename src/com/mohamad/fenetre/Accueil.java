package com.mohamad.fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.prism.Image;

public class Accueil extends JPanel {
	private static final long serialVersionUID = -6844827730269257171L;
	private Color color = Color.white;
	private JLabel label = new JLabel("Bienvenu dans le jeu de PENDU");
	private JLabel photoLael = new JLabel(new ImageIcon("images/image1.jpg"));
	private JLabel explicationLabel = new JLabel();

	public Accueil() {
		this.setLayout(new BorderLayout());
		Font font = new Font("Courier", Font.BOLD, 15);
		
		//premier jlabel titre du jeu "entete"
		label.setFont(new Font("Arial", Font.BOLD, 30));
		this.label.setHorizontalAlignment(JLabel.CENTER);
		this.label.setVerticalAlignment(JLabel.CENTER);
		this.add(label, BorderLayout.NORTH);
		
		this.photoLael.setHorizontalAlignment(JLabel.CENTER);
		this.photoLael.setVerticalAlignment(JLabel.CENTER);
		this.add(photoLael, BorderLayout.CENTER);
		
		// Jlabel  explication du jeu "pied de page"
		explicationLabel.setFont(font);
		explicationLabel.setHorizontalAlignment(JLabel.CENTER);
		explicationLabel.setVerticalAlignment(JLabel.CENTER);
		explicationLabel
				.setText("<html>Vous avez 7 coups pour trouver le mot cache! Et si vous reussissez: on recommence ! <br>"
						+ " Plus vous avez trouve de mots, plus votre score grandira!! Alors a vous de jouer ! <html>");
		this.add(explicationLabel, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
