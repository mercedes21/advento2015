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
import java.util.Arrays;

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
        int suma = 0;
        int sumaMenor = 0;
        int total = 0;
        while ((medidas = b.readLine()) != null) {
            String[] separador = medidas.split("x");
            int l = Integer.parseInt(separador[0]);
            int w = Integer.parseInt(separador[1]);
            int h = Integer.parseInt(separador[2]);
            int largo = l * w;
            int ancho = w * h;
            int alto = h * l;
            int menor = 0;

            if (largo < ancho && largo < alto) {
                menor = largo;
            } else if (ancho < largo && ancho < alto) {
                menor = ancho;
            } else if (alto < largo && alto < ancho) {
                menor = alto;
            } else if (largo == ancho && ancho < alto || largo == ancho && alto < ancho || largo == ancho && largo < alto || largo == ancho && ancho < largo || largo == ancho && largo < ancho) {
                menor = ancho;
            } else if (alto == ancho && ancho < alto || alto == ancho && alto < ancho || alto == ancho && largo < alto || alto == ancho && ancho < largo || alto == ancho && largo < ancho) {
                menor = alto;
            } else if (largo == alto && ancho < alto || largo == alto && alto < ancho || largo == alto && largo < alto || largo == alto && ancho < largo || largo == alto && largo < ancho) {
                menor = largo;
            } else if (largo == ancho || largo == alto || ancho == largo || ancho == alto) {
                menor = largo;
            } else {
            }
            int largof = largo * 2;
            int anchof = ancho * 2;
            int altof = alto * 2;
            sumaMenor += menor;
            suma += largof + anchof + altof;
        }
        total = sumaMenor + suma;
        System.out.println("total  " + total);
    }
}
