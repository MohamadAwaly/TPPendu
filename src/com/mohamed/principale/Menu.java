package com.mohamed.principale;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import sun.security.krb5.internal.APOptions;

public class Menu {
	
	public JMenuBar menu = new JMenuBar();
	
	// entete menue
	private JMenu fichier = new JMenu("Fichier");
	private JMenu aPropos = new JMenu("A propos");
	
	// sous menue Fichier
	public JMenuItem nouveau = new JMenuItem("Nouveau");
	public JMenuItem scores = new JMenuItem("Scores");
	public JMenuItem regles = new JMenuItem("Regles");
	public JMenuItem quitter = new JMenuItem("Quitter");
	public JMenuItem apropo = new JMenuItem("?");
	
	// Constructeur
	public Menu() {
		initMenu();
	}
	
	// initisilisation du menu
	private void initMenu(){
		menu.add(fichier);
		menu.add(aPropos);
		fichier.add(nouveau);
		fichier.add(scores);
		aPropos.add(regles);
		fichier.add(quitter);
		aPropos.add(apropo);
		
	}
}
