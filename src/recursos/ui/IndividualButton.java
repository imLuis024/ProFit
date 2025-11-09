package recursos.ui;

import javax.swing.*;
import java.awt.*;

/*
 * Botón individual con fuente y estilo personalizados.
 * Muestra un solo texto centrado y conserva el fondo configurado
 * en el tema (.properties).
 *
 * @author Tinoco
 */
public class IndividualButton extends JButton {

    private final JLabel labelName;

    public IndividualButton(String text) {
        super(); // no pasamos texto para evitar duplicado
        setLayout(new BorderLayout());
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(true); // ✅ deja que el botón pinte su fondo
        setOpaque(true);            // ✅ necesario para que Swing respete el background

        // Configura el color de fondo según el tema (UIManager)
        setBackground(UIManager.getColor("Button.background"));
        setForeground(UIManager.getColor("Label.foregroundClave"));

        // Label centrado
        labelName = new JLabel(text, SwingConstants.CENTER);
        labelName.setForeground(UIManager.getColor("Label.foreground"));
        labelName.setFont(UIManager.getFont("LabelClave.font"));

        add(labelName, BorderLayout.CENTER);
    }

    public void setLabelText(String newText) {
        labelName.setText(newText);
    }

    public void setLabelColor(Color color) {
        labelName.setForeground(color);
    }
}

