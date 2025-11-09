package app;

import javax.swing.*;
import recursos.fonts.FontLoader;
import recursos.temas.ProFitDarkTheme;
import vista.login.Login;

public class Main {

    public static void main(String[] args) {
        try {
            //  Registrar las fuentes Poppins
            FontLoader.registerPoppins();

            //  Aplicar tu tema personalizado
            if (!ProFitDarkTheme.setup()) {
                System.err.println("Error al aplicar tema");
                System.exit(1);
            }
        } catch (Exception e) {
            System.err.println("Error al aplicar tema o registrar fuentes: " + e.getMessage());
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ProFit - Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            Login Login = new Login();
            frame.setContentPane(Login);
        });
    }
}
