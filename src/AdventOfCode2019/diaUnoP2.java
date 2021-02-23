/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventOfCode2019;

import static AdventOfCode2019.diaUno.muestraModulo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chapis
 */
public class diaUnoP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        muestraModulo("/Users/chapis/Documents/2019DiaUno.txt");
    }

    public static void muestraModulo(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int x = 0;
        while ((cadena = b.readLine()) != null) {
            int modulo = Integer.parseInt(cadena);
            while (modulo > 0) {
                modulo = (int) Math.floor(modulo / 3) - 2;
                if (modulo > 0) {
                    x += modulo;
                }
            }
        }
        System.out.println("el total de modulos es:" + x);
    }

}
