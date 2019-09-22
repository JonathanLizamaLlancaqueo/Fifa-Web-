package dci.ufro.cl.fifa.services;

import dci.ufro.cl.fifa.model.Player;

import java.io.*;
import java.util.ArrayList;

public class ManejoDato {

	public boolean validarExistencia(String ubicacionArchivo) {
		File f = new File(ubicacionArchivo);
		return f.exists();
	}

	/**
	 * Method that reads a text in csv format.
	 *
	 * @param ubicacionArchivo where is the file.
	 * @param existencia see if the file exists.
	 * @return data from csv format text.
	 */
	public ArrayList<String[]> ObtenerDatos(String ubicacionArchivo, boolean existencia) throws FileNotFoundException, IOException {
		if (existencia) {
			String linea;
			ArrayList<String[]> datos = new ArrayList<String[]>();
			FileReader fr = new FileReader(ubicacionArchivo);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			while ((linea = br.readLine()) != null) {
				datos.add(linea.split(","));
			}
			return datos;
		}
		return null;
	}

	/**
	 * 
	 * @param players
	 * @param nationality
	 */
	public ArrayList<Player> selecNacionalidad(ArrayList<Player> players, String nationality) {
		// TODO - implement ManejoDato.selecNacionalidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param players
	 * @param age
	 */
	public ArrayList<Player> selecEdad(ArrayList<Player> players, int age) {
		// TODO - implement ManejoDato.selecEdad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param club
	 */
	public ArrayList<Player> selecClub(ArrayList<Player> jugadores, String club) {
		// TODO - implement ManejoDato.selecClub
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param ranting
	 */
	public ArrayList<Player> selecRating(ArrayList<Player> jugadores, int ranting) {
		// TODO - implement ManejoDato.selecRating
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param potencial
	 */
	public ArrayList<Player> selecPotencial(ArrayList<Player> jugadores, int potencial) {
		// TODO - implement ManejoDato.selecPotencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param players
	 * @param name
	 */
	public Player selectName(ArrayList<Player> players, String name) {
		// TODO - implement ManejoDato.selecNombre
		throw new UnsupportedOperationException();
	}

}