package abisiesto;

public class Respuestas {

    public String escribeRespuesta(String ano , int a) {

        String escribir = " Error ";

        if ( a == 1 ){
            escribir = "Tiene que ser del siglo XXI, el " + ano + " no lo es, prueba con otro.";
        }
        if ( a == 2 ){
            escribir = "El año " + ano + " es BISIESTO";
        }
        if ( a == 3 ){
            escribir = "El año " + ano + " NO es un año bisiesto, prueba con otro.";
        }
        return escribir;
    }

}
