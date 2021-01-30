/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventoofcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author chapis
 */
public class AdventoDiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        muestraConDiaDos("/Users/chapis/Documents/diaDos.txt");
    }

    public static void muestraConDiaDos(String archivo) throws FileNotFoundException, IOException {
        String medidas;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int x = 0;
        while ((medidas = b.readLine()) != null) {
            int[] a = Arrays.stream(medidas.split("x")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(a);
            int c1 = a[0];
            int c2 = a[1];
            int c3 = a[2];
            int lado1 = a[0] * 2;
            int lado2 = a[1] * 2;
            int suma = lado1 + lado2;
            int suma2 = c1 * c2 * c3;
            int total = suma + suma2;
            x += total;
        }
        System.out.println("El total de pies es: " + x);
    }
}
