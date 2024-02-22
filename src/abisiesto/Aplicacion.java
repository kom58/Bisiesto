package abisiesto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {

    private JPanel panBase;
    private JPanel panSuperior;
    private JPanel panMedio;
    private JPanel panInferior;
    private JPanel panRespuestas;
    private JButton btnVers1;
    private JButton btnVers2;
    private JLabel txtTitulo;
    private JLabel txtRespuesta;
    private JPanel panSalir;
    private JButton btnSalir;
    private JTextField datAno;
    private JPanel panSeparador1;
    private JPanel panSeparador2;

    public boolean bisiesto = false;


    public Aplicacion() {

        btnVers1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                version1();

            }
        });

        btnVers2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                version2();

            }
        });
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
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
