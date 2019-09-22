package dci.ufro.cl.fifa.model;

import dci.ufro.cl.fifa.services.ManejoDato;

import java.io.IOException;
import java.util.ArrayList;

public class ListPlayer {

    public static ArrayList<Player> players = new ArrayList<>();

    public ListPlayer() throws IOException {
        addPlayer();
        showPlayers();

    }

    /**
     * This method stores the attributes of each player in an array list.
     *
     */
    public static void addPlayer() throws IOException {
        ManejoDato leer = new ManejoDato();
        ArrayList<String[]> totalPlayers = leer.ObtenerDatos("dataFifa.csv",true);
        for (int i = 0; i < totalPlayers.size(); i++) {
            String name = totalPlayers.get(i)[2];
            String photo = totalPlayers.get(i)[4];
            String nationality = totalPlayers.get(i)[5];
            int rating = Integer.parseInt(totalPlayers.get(i)[7]);
            int age = Integer.parseInt(totalPlayers.get(i)[3]);
            String club = totalPlayers.get(i)[9];
            int potential = Integer.parseInt(totalPlayers.get(i)[8]);
            players.add(new Player(name,photo, nationality,rating,age,club,potential));

        }

    }

    /**
     * This method returns the array of players.
     */
    public static ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * This method shows by console each Player with their respective attributes.
     */
    public void showPlayers() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Jugador N°"+(i+1));
            System.out.println(players.get(i).toString());
        }
    }





}
