package recursos.ui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;

public class ScaledImageLabel extends JLabel {

    private Image image;

    public void setImage(Image img) {
        this.image = img;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
