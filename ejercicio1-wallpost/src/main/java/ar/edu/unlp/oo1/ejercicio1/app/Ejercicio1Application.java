package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.*;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.UperCaseFormatter;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger logger = Logger.getLogger(WallPostImpl.class.getName());
		logger.setLevel(Level.WARNING);
		FileHandler wallImpl = new FileHandler("wallImpl.log");
		wallImpl.setFormatter(new SimpleFormatter());
		logger.addHandler(wallImpl);

		Logger uiLogger = Logger.getLogger(WallPostUI.class.getName());
		uiLogger.setLevel(Level.INFO);
		FileHandler wallUi = new FileHandler("wallUI.log");
		wallUi.setFormatter(new SimpleFormatter());
		uiLogger.addHandler(wallUi);

		uiLogger.info("Inicio App WallPost");

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				new WallPostUI();
			}
		});


		// EJ 3
		Logger logger2 = Logger.getLogger(WallPostImpl.class.getName());
		FileHandler archivo = new FileHandler("Mayus.log");
		archivo.setFormatter(new UperCaseFormatter());
		logger2.addHandler(archivo);

		// EJ 3 pero JSON

		Logger logger3 = Logger.getLogger(WallPostImpl.class.getName());
		ConsoleHandler console = new ConsoleHandler();
		console.setFormatter(new JSONFormatter());
		logger3.addHandler(console);


	}

}
