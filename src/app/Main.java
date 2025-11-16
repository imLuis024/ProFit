package app;

import javax.swing.*;
import recursos.fonts.FontLoader;
import recursos.temas.ProFitDarkTheme;
import vista.login.Login;

public class Main {

    // Declarar el JFrame como variable estática
    public static JFrame frame;

    public static void main(String[] args) {
        try {
            FontLoader.registerPoppins();
            ProFitDarkTheme.setup();
        } catch (Exception e) {
            System.err.println("Error al aplicar tema o fuentes: " + e.getMessage());
        }

        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("ProFit - Sistema de Suplementos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1000, 500);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new Login());
            frame.setVisible(true);
        });
    }
}
