/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventoofcode;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author chapis
 */
public class AdventoOfCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        muestraContenido("/Users/chapis/Documents/inputPartDos.txt");
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            String[] parts = cadena.split("");
            int floor = 0;
            int pos=0;
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equals("(")) {
                    floor += 1;
                } else {
                    pos=i + 1;
                    floor -= 1;
                    if(floor == -1){
                        System.out.println("posicion "+ pos);
                        break;
                    }
                }
            }
            System.out.println("El resultado final es " + floor);
        }
        b.close();
    }

}
