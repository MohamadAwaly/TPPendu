package com.mohamad.fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Jeu extends JPanel {

	private Color color = Color.white;
	//Pour jouter les boutons
	private JPanel container = new JPanel();
	//Ajouter le label 1 en boxLayout
	private JPanel container1 = new JPanel();
	// Ajouter le label 2 en BoxLayout
	private JPanel container2 = new JPanel();
	// Ajouter le Container 1 et 2 dans le panel 3
	private JPanel container3 = new JPanel();
	//Ajout de la premier photo
	private JPanel containerPhoto1 = new JPanel();
	private JLabel label = new JLabel("Nombre de mot trouve: ");
	private JLabel label1 = new JLabel("Votre Score Actuel est de: ");
	// photo de depart
	private JLabel photo1 = new JLabel(new ImageIcon("images/image1.jpg"));
	
	// Tableau des Boutons
	String[] tabString = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "W", "X",
			"Y", "Z" };
	
	// creation d un tableau de bouton qui recoi la taille du tabString
	JButton tabBouton[] = new JButton[tabString.length];
	
	// dimention des boutons
	private Dimension dim = new Dimension(50, 40);
	private Dimension dim2 = new Dimension(50, 170);
	
	public Jeu() {
		
		this.setLayout(new BorderLayout());

		container1.setLayout(new BoxLayout(container1, BoxLayout.LINE_AXIS));
		container2.setLayout(new BoxLayout(container2, BoxLayout.LINE_AXIS));
		container3.setLayout(new BoxLayout(container3, BoxLayout.PAGE_AXIS));
		
		container1.add(label);
		container2.add(label1);
		container3.add(container1);
		container3.add(container2 );
		
		containerPhoto1.setPreferredSize(dim2);
		containerPhoto1.add(photo1);
		//photo1.setPreferredSize(dim2);
		//containerPhoto1.setPreferredSize(dim2);
		container.setPreferredSize(dim2);
		
		this.add(containerPhoto1);
		this.add(container3, BorderLayout.NORTH);
		this.add(container,BorderLayout.SOUTH);
		JButton bouton = new JButton();

		for (int i = 0; i < tabString.length; i++) {

			tabBouton[i] = new JButton(tabString[i]);
			tabBouton[i].setPreferredSize(dim);
			container.add(tabBouton[i]);
			
			switch (i) {
			case 1:
				tabBouton[i].addActionListener(new Desablebouton());
				//tabBouton[i].setEnabled(false);
				break;
			}
			
			
		}
	}

	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	}
	
	class Desablebouton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			e.getSource();
				
			
		}
	}

}
