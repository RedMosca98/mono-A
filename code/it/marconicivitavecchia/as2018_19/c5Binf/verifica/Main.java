
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(2052,660);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder htmlsb= new StringBuilder();
		htmlsb.append("<html>");
		// TODO Creare la stringa HTML per il wireframe
		htmlsb.append("<h1>wireframe</h1>");
		// TODO Convertire lo StringBuilder in String
		String htmlText = htmlsb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

