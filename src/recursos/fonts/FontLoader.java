package recursos.fonts;
/*
 * Clase creada para cargar fuentes externas (fonts)
 */
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;
/* 
 * @author Tinoco
 */
public class FontLoader {
    //Poppins
    public static void registerPoppins() {
        String[] fontFiles = {
            "Poppins-Bold.ttf",
            "Poppins-Regular.ttf"
        };
        for (String fontFile : fontFiles) {
            try (InputStream is = FontLoader.class.getResourceAsStream(
                    "/recursos/fonts/poppins/" + fontFile)) {  
                if (is == null) {
                    System.err.println("No se encontró la fuente: " + fontFile);
                    continue;
                }
                Font font = Font.createFont(Font.TRUETYPE_FONT, is);
                GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
                System.out.println("Fuente registrada: " + fontFile); 
            } catch (Exception e) {
                System.err.println("Error con " + fontFile + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    /* Devuelve una instancia de la fuente Poppins (si está registrada). */
    public static Font getPoppins(float size, int style) {
        return new Font("Poppins", style, (int) size);
    }
}