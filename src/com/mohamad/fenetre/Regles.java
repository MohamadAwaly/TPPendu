package com.mohamad.fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Regles extends JPanel {

	private Color color = Color.white;
	private JLabel labelTitre = new JLabel("le jeu du PENDU: ");
	private JLabel labelCompteDesPpoints = new JLabel();
	private JLabel labelMessage = new JLabel();
	private Font font = new Font("Courier", Font.BOLD, 15);

	public Regles() {

		this.setLayout(new BorderLayout());
		// Definition du titre
		labelTitre.setFont(new Font("Arial", Font.BOLD, 30));
		this.labelTitre.setHorizontalAlignment(JLabel.CENTER);
		this.labelTitre.setVerticalAlignment(JLabel.CENTER);
		this.add(labelTitre, BorderLayout.NORTH);

		// Regle des point
		labelCompteDesPpoints.setText("<html>COMPTE DES POINTS:<br>" + "<html><br>"
				+ "<html>Mot trouvé sans erreur :.........100Pts<br>"
				+ "<html>Mot trouvé avec 1 erreur :........50Pts<br>"
				+ "<html>Mot trouvé avec 2 erreurs :......35Pts<br>"
				+ "<html>Mot trouvé avec 3 erreurs :......25Pts<br>"
				+ "<html>Mot trouvé avec 4 erreurs :......15Pts<br>"
				+ "<html>Mot trouvé avec 5 erreurs :......10Pts<br>"
				+ "<html>Mot trouvé avec 6 erreurs :........5Pts<br>");
		labelCompteDesPpoints.setFont(new Font("Arial", Font.BOLD, 20));
		this.labelCompteDesPpoints.setHorizontalAlignment(JLabel.CENTER);
		this.labelCompteDesPpoints.setVerticalAlignment(JLabel.CENTER);
		this.add(labelCompteDesPpoints, BorderLayout.CENTER);
		// Petit Message pied de page
		labelMessage
				.setText("<html>Je vous souhaite bien du plaisir.... <br>"
						+ "<html>Et, si vous pensez pouvoir trouver un mot en un coup, c'est que vous pensez que le dictionnaire est petit !<br>"
						+ "<html>Hors, pour votre information, il comprend plus de 336 000 mots... Donc bonne chance!! ;)<br>" +
						"<html<br>");
		labelMessage.setFont(new Font("Arial", Font.BOLD, 15));
		this.labelMessage.setHorizontalAlignment(JLabel.CENTER);
		this.labelMessage.setVerticalAlignment(JLabel.CENTER);
		this.add(labelMessage, BorderLayout.SOUTH);
	}
	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

}
