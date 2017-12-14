package Client.RessourceFactory;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class RessourcesFactory {
	static int NB_POSITION = 4;
	static int NB_SPRITE = 3;
	
	private static String cheminImagePersonnage = "/Client/IHM/Images/personnage.png";
	private static String cheminImageArme = "/Client/IHM/Images/arme.jpg";
	
	private static Texture texturePersonnage;
	private static Texture textureArme;

	public static void loadImage() {
		try {
			texturePersonnage = TextureLoader.getTexture("PNG", Class.class.getResourceAsStream(cheminImagePersonnage));
			textureArme = TextureLoader.getTexture("JPG", Class.class.getResourceAsStream(cheminImageArme));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static Texture getImage(TypeImage type) {
		switch(type) {
		case PERSONNAGE :
			return texturePersonnage;
		case ARME :
			return textureArme;
		default:
			break;
		}
		return null;
	}
	
}
