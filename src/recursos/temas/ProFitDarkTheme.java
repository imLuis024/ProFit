package recursos.temas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;

/*
 * Tema oscuro personalizado ProFit
 * Carga automáticamente la configuración desde ProFitDarkTheme.properties
 */
public class ProFitDarkTheme extends FlatDarkLaf {

    public static final String NAME = "ProFit Dark Theme";

    public static boolean setup() {
        // 🔹 Registra la carpeta donde están los .properties
        FlatLaf.registerCustomDefaultsSource("recursos.temas");
        // 🔹 Aplica este tema
        return setup(new ProFitDarkTheme());
    }

    @Override
    public String getName() {
        return NAME;
    }

    // 🔹 Muy importante: forzar la carga de los defaults del archivo .properties
    static {
        // Esto obliga a FlatLaf a aplicar tu archivo ProFitDarkTheme.properties
        FlatLaf.registerCustomDefaultsSource("recursos.temas");
    }
}
