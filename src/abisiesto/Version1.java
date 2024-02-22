package abisiesto;

public class Version1 {

    // Devuelve true si el año a es bisiesto
    // VERSION 1
    public boolean esBisiesto(int a) {

        boolean bisiesto = false;

        if (a % 4   == 0) bisiesto = true;
        if (a % 100 == 0) bisiesto = false;
        if (a % 400 == 0) bisiesto = true;

        return bisiesto;
    }



}
