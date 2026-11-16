package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	private static final Logger logger = Logger.getLogger(WallPostImpl.class.getName());
	
	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public void setTxtFormatter() {
		fileHandler.setFormatter(txtFormatter);
	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;

	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		if (likes + 1 == 10) {
			logger.warning("El contador de likes llego a 10.");
		}
		this.likes = this.likes + 1;

	}

	@Override
	public void dislike() {
		if (likes - 1 == 0) {
			logger.warning("El contador de likes llego a 0.");
		}
		if (likes > 0) {
			this.likes = this.likes - 1;
		}
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
