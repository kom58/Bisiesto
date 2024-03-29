package abisiesto;

import javax.swing.*;

public class Aplicacion {

    private JPanel panBase;
    private JButton btnVers1;
    private JButton btnVers2;
    private JLabel txtRespuesta;
    private JButton btnSalir;
    private JTextField datAno;

    public Aplicacion() {

        btnVers1.addActionListener(e -> version1());
        btnVers2.addActionListener(e -> version2());
        btnSalir.addActionListener(e -> System.exit(0));
        datAno.addActionListener(e -> version1());
    }

    public void version1() {


        String anoPuesto = datAno.getText();                // Lee el año puesto
        int a = Integer.parseInt(anoPuesto);                // Lo convierte en int
        Respuestas res = new Respuestas();                  // Crea objeto res
        Version1 v1 = new Version1();                       // Crea objeto v

        // Comprueba que es del siglo XXI
        if (a < 2000 || a > 2100) {
            //  Respuestas 1 no es año del XXI
            String r = res.escribeRespuesta(anoPuesto, 1);
            txtRespuesta.setText(r);
        } else {
            if (v1.esBisiesto(a)) {
                //  Respuestas 2 SI es bisiesto
                String r = res.escribeRespuesta(anoPuesto, 2);
                txtRespuesta.setText(r);
            } else {
                //  Respuestas 3 NO es bisiesto
                String r = res.escribeRespuesta(anoPuesto, 3);
                txtRespuesta.setText(r);
            }
        }

    }

    public void version2() {

        String anoPuesto = datAno.getText();                // Lee el año puesto
        int a = Integer.parseInt(anoPuesto);                // Lo convierte en int
        Respuestas res = new Respuestas();                  // Crea objeto res
        Version2 v2 = new Version2();                       // Crea objeto v

        // Comprueba que es del siglo XXI
        if (a < 2000 || a > 2100) {
            //  Respuestas 1 no es año del XXI
            String r = res.escribeRespuesta(anoPuesto, 1);
            txtRespuesta.setText(r);
        } else {
            if (v2.esBisiestoVers2(a)) {
                //  Respuestas 2 SI es bisiesto
                String r = res.escribeRespuesta(anoPuesto, 2);
                txtRespuesta.setText(r);
            } else {
                //  Respuestas 3 NO es bisiesto
                String r = res.escribeRespuesta(anoPuesto, 3);
                txtRespuesta.setText(r);
            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Años bisiestos");
        frame.setContentPane(new Aplicacion().panBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }


}
