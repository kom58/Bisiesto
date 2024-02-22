package abisiesto;

public class Version2 {

    // Devuelve true si el año a es bisiesto
    public boolean esBisiestoVers2(int a) {

        boolean bisiesto = (((a % 400 == 0) || (a % 100 != 0)) && (a % 4 == 0));
        return bisiesto;
    }


}
