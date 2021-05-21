package examenmediotermino_tc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class ArchivoTextoRead {

    private ArrayList<String> cadenas = new ArrayList();
    private String lectura;
    
    public String getLectura() {
        return lectura;
    }
    public void setLectura(String lectura) {
        this.lectura = lectura;
    }
    public ArchivoTextoRead() {

    }

    public ArrayList<String> getCadenas() {
        return cadenas;
    }

    public void setCadenas(ArrayList<String> cadenas) {
        this.cadenas = cadenas;
    }
    public void lectura() {
        Scanner input = null;
        File archivo = null;
        try {
            archivo = new File("./input.txt");
            input = new Scanner(archivo);
            input.useDelimiter(";");
            while (input.hasNext()) {
                lectura = input.next();
                cadenas.add(lectura);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.close();
    }
}
