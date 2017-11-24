package com.mohamad.fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.scripts.JO;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.mohamed.principale.Menu;
import com.sun.corba.se.spi.orbutil.fsm.Action;

public abstract class FenPrincipal extends JFrame {
	private Menu menu = new Menu();
	private static final long serialVersionUID = -7981151332104828009L;
	private JPanel contenaire = new JPanel();
	Accueil pageDacceuil = new Accueil();
	Regles regles = new Regles();
	Jeu jeu = new Jeu();
	String bouton = "";

	public FenPrincipal() {
		this.setTitle("Le pendu");
		this.setSize(700, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(true);

		this.setContentPane(contenaire);
		contenaire.setBackground(Color.red);
		contenaire.setLayout(new BorderLayout());
		contenaire.add(pageDacceuil, BorderLayout.CENTER);
		// contenaire.add(label, BorderLayout.NORTH);
		// pageDacceuil.add(label);

		this.setJMenuBar(menu.menu);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		// this.menu.nouveau.addActionListener(new NouveauListener());
		menu.nouveau.addActionListener(new NouveauListener1());
		menu.regles.addActionListener(new RegleListener());
		menu.apropo.addActionListener(new ApropoListener());
		// Quitter l application
		menu.quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	public void ChangePan() {
		// contenaire.add(aPropo, BorderLayout.CENTER);
		if (bouton == "nouveauJeu") {
			this.setContentPane(jeu);
			this.revalidate();
		}
		if (bouton == "RegleDuJeu") {
			this.setContentPane(regles);
			this.revalidate();
		}

	}

	class NouveauListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bouton = "nouveauJeu";
			FenPrincipal.this.ChangePan();
		}
	}

	class RegleListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bouton = "RegleDuJeu";
			FenPrincipal.this.ChangePan();
		}
	}

	class ApropoListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Createur: AWALY Mohamad \n "
					+ "License: Freeware\n"
					+ "Copyright: awaly.mohamad@gmail.com\n",
					bouton, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
