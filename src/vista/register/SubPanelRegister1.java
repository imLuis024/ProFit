package vista.register;

import controlador.UsuarioControlador;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import modelo.Usuario;
import vista.login.Login;

/**
 *
 * @author luish
 */
public class SubPanelRegister1 extends javax.swing.JPanel {

    /**
     * Creates new form SubPanelVista1
     */
    public SubPanelRegister1() {
        initComponents();
        SwingUtilities.invokeLater(() -> {
            System.out.println("Ancho jPnlDerecha: " + jPnlDerecha.getWidth());
            System.out.println("Alto jPnlDerecha: " + jPnlDerecha.getHeight());
        });

        SwingUtilities.invokeLater(() -> {
            System.out.println("Ancho jPnlDerecha: " + jPnlIzuiqerda.getWidth());
            System.out.println("Alto jPnlDerecha: " + jPnlIzuiqerda.getHeight());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlIzuiqerda = new javax.swing.JPanel();
        jPnlTitle = new javax.swing.JPanel();
        jLblTittle = new javax.swing.JLabel();
        jPnlLoginButton = new javax.swing.JPanel();
        jLblTxt = new javax.swing.JLabel();
        jLblLink = new javax.swing.JLabel();
        jPnlFullName = new javax.swing.JPanel();
        jPnlNombre = new javax.swing.JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fondo del tema
                Color bg = (Color) UIManager.get("SubPanel.background");
                g2.setColor(bg);

                // Fondo redondeado
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                g2.dispose();
                super.paintComponent(g);
            }

        };
        jLblNombre = new javax.swing.JLabel();
        jPnlInternoNombre = new javax.swing.JPanel();
        jLblIconNombre = new javax.swing.JLabel();
        jPnlApellido = new javax.swing.JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fondo del tema
                Color bg = (Color) UIManager.get("SubPanel.background");
                g2.setColor(bg);

                // Fondo redondeado
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                g2.dispose();
                super.paintComponent(g);
            }

        };
        jLblApellido = new javax.swing.JLabel();
        jPnlInternoApellido = new javax.swing.JPanel();
        jLblIconApellido = new javax.swing.JLabel();
        jPnlEmail = new javax.swing.JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fondo del tema
                Color bg = (Color) UIManager.get("SubPanel.background");
                g2.setColor(bg);

                // Fondo redondeado
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                g2.dispose();
                super.paintComponent(g);
            }

        };
        jLblEmail = new javax.swing.JLabel();
        jPnlInternoEmail = new javax.swing.JPanel();
        jLblIconEmail = new javax.swing.JLabel();
        jPnlPassword = new javax.swing.JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fondo del tema
                Color bg = (Color) UIManager.get("SubPanel.background");
                g2.setColor(bg);

                // Fondo redondeado
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                g2.dispose();
                super.paintComponent(g);
            }

        };
        jLblPassword = new javax.swing.JLabel();
        jPnlInternoPassword = new javax.swing.JPanel();
        jPasswordField = new javax.swing.JPasswordField();
        jLblIconPassword = new javax.swing.JLabel();
        jPnlPhone = new javax.swing.JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Fondo del tema
                Color bg = (Color) UIManager.get("SubPanel.background");
                g2.setColor(bg);

                // Fondo redondeado
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                g2.dispose();
                super.paintComponent(g);
            }

        };
        jLblPhone = new javax.swing.JLabel();
        jPnlInternoPhone = new javax.swing.JPanel();
        jFormattedTxFPhone = new javax.swing.JFormattedTextField();
        jLblIconPhone = new javax.swing.JLabel();
        jPnlLoginButton1 = new javax.swing.JPanel();
        jBtnCrearCuenta = new recursos.ui.IndividualButton("Crear cuenta")
        ;
        jPnlDerecha = new javax.swing.JPanel();
        jLblBackgroundImage = new recursos.ui.ScaledImageLabel() ;

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.GridLayout(1, 2));

        jPnlIzuiqerda.setLayout(new java.awt.GridLayout(7, 1, 0, 10));
        jPnlIzuiqerda.setBorder(new EmptyBorder(8,12,8,12));

        jPnlTitle.setLayout(new java.awt.GridLayout(1, 1));

        jLblTittle.setText("Registrar Cuenta");
        jLblTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTittle.putClientProperty("FlatLaf.styleClass", "h1");
        jPnlTitle.add(jLblTittle);

        jPnlIzuiqerda.add(jPnlTitle);

        jPnlLoginButton.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        jLblTxt.setText("¿Ya tienes cuenta?");
        jLblTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPnlLoginButton.add(jLblTxt);

        jLblLink.setText("Iniciar sesión");
        jLblLink.setForeground((Color) UIManager.get("LabelValor.foreground"));
        jLblLink.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblLinkMouseClicked(evt);
            }
        });
        jPnlLoginButton.add(jLblLink);

        jPnlIzuiqerda.add(jPnlLoginButton);

        jPnlFullName.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        jPnlNombre.setLayout(new java.awt.GridLayout(2, 1, 0, 2));
        jPnlNombre.setBorder(new com.formdev.flatlaf.ui.FlatRoundBorder());
        jPnlNombre.setOpaque(false);

        jLblNombre.setText("Primer nombre");
        jLblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlNombre.add(jLblNombre);

        jPnlInternoNombre.setLayout(new java.awt.GridLayout(1, 2));
        jPnlInternoNombre.setOpaque(false);

        jTxtFNombre.setOpaque(false);
        jTxtFNombre.setBorder(new EmptyBorder(8,12,8,12));
        jPnlInternoNombre.add(jTxtFNombre);

        jLblIconNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIconNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ImageIcon personIcon = new ImageIcon(getClass().getResource("/recursos/icons/profit_person1.png"));

        Image scaledPerson = personIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

        jLblIconNombre.setIcon(new ImageIcon(scaledPerson));

        // Asignar la imagen escalada al JLabel
        jPnlInternoNombre.add(jLblIconNombre);

        jPnlNombre.add(jPnlInternoNombre);

        jPnlFullName.add(jPnlNombre);

        jPnlApellido.setLayout(new java.awt.GridLayout(2, 1, 0, 2));
        jPnlApellido.setBorder(new com.formdev.flatlaf.ui.FlatRoundBorder());
        jPnlApellido.setOpaque(false);

        jLblApellido.setText("Último Apellido");
        jLblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblApellido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlApellido.add(jLblApellido);

        jPnlInternoApellido.setLayout(new java.awt.GridLayout(1, 2));
        jPnlInternoApellido.setOpaque(false);

        jTxtFApellido.setOpaque(false);
        jTxtFApellido.setBorder(new EmptyBorder(8,12,8,12));
        jPnlInternoApellido.add(jTxtFApellido);

        jLblIconApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIconApellido.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLblIconApellido.setIcon(new ImageIcon(scaledPerson)); //Se creó el icono en jLblIconNombre
        jPnlInternoApellido.add(jLblIconApellido);

        jPnlApellido.add(jPnlInternoApellido);

        jPnlFullName.add(jPnlApellido);

        jPnlIzuiqerda.add(jPnlFullName);

        jPnlEmail.setLayout(new java.awt.GridLayout(2, 1, 0, 2));
        jPnlEmail.setBorder(new com.formdev.flatlaf.ui.FlatRoundBorder());
        jPnlEmail.setOpaque(false);

        jLblEmail.setText("Email");
        jLblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlEmail.add(jLblEmail);

        jPnlInternoEmail.setLayout(new java.awt.GridLayout(1, 2));
        jPnlInternoEmail.setOpaque(false);

        jTxtFEmail.setOpaque(false);
        jTxtFEmail.setBorder(new EmptyBorder(8,12,8,12));
        jPnlInternoEmail.add(jTxtFEmail);

        jLblIconEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIconEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ImageIcon emalIcon = new ImageIcon(getClass().getResource("/recursos/icons/profit_email1.png"));

        Image scaledEmail = emalIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

        jLblIconEmail.setIcon(new ImageIcon(scaledEmail));
        jPnlInternoEmail.add(jLblIconEmail);

        jPnlEmail.add(jPnlInternoEmail);

        jPnlIzuiqerda.add(jPnlEmail);

        jPnlPassword.setLayout(new java.awt.GridLayout(2, 1, 0, 2));
        jPnlPassword.setBorder(new com.formdev.flatlaf.ui.FlatRoundBorder());
        jPnlPassword.setOpaque(false);

        jLblPassword.setText("Contraseña");
        jLblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlPassword.add(jLblPassword);

        jPnlInternoPassword.setLayout(new java.awt.GridLayout(1, 2));
        jPnlInternoPassword.setOpaque(false);

        jPasswordField.setOpaque(false);
        jPasswordField.setBorder(new EmptyBorder(8,12,8,12));
        jPnlInternoPassword.add(jPasswordField);

        jLblIconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIconPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ImageIcon passwordIcon = new ImageIcon(getClass().getResource("/recursos/icons/profit_password1.png"));

        Image scaledPassword = passwordIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

        jLblIconPassword.setIcon(new ImageIcon(scaledPassword));
        jLblIconPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblIconPasswordMousePressed(evt);
            }
        });
        jPnlInternoPassword.add(jLblIconPassword);

        jPnlPassword.add(jPnlInternoPassword);

        jPnlIzuiqerda.add(jPnlPassword);

        jPnlPhone.setLayout(new java.awt.GridLayout(2, 1, 0, 2));
        jPnlPhone.setBorder(new com.formdev.flatlaf.ui.FlatRoundBorder());
        jPnlPhone.setOpaque(false);

        jLblPhone.setText("Telefono");
        jLblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPhone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlPhone.add(jLblPhone);

        jPnlInternoPhone.setLayout(new java.awt.GridLayout(1, 2));
        jPnlInternoPhone.setOpaque(false);

        try {
            javax.swing.text.MaskFormatter formatoTelefono = new javax.swing.text.MaskFormatter("###-###-####");
            formatoTelefono.setPlaceholderCharacter('_');

            jFormattedTxFPhone = new javax.swing.JFormattedTextField(formatoTelefono);
            jFormattedTxFPhone.setOpaque(false);
            jFormattedTxFPhone.setBorder(new javax.swing.border.EmptyBorder(8, 12, 8, 12));
            jFormattedTxFPhone.setFont(new java.awt.Font("Poppins", java.awt.Font.PLAIN, 11));
            jFormattedTxFPhone.setForeground(java.awt.Color.WHITE);
            jFormattedTxFPhone.setCaretColor(java.awt.Color.WHITE);
            jFormattedTxFPhone.setBackground((java.awt.Color) javax.swing.UIManager.get("SubPanel.background"));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
            jFormattedTxFPhone = new javax.swing.JFormattedTextField(); // fallback sin formato
        }
        jPnlInternoPhone.add(jFormattedTxFPhone);

        jLblIconPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIconPhone.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ImageIcon phoneIcon = new ImageIcon(getClass().getResource("/recursos/icons/profit_phone1.png"));

        Image scaledPhone = phoneIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

        jLblIconPhone.setIcon(new ImageIcon(scaledPhone));
        jPnlInternoPhone.add(jLblIconPhone);

        jPnlPhone.add(jPnlInternoPhone);

        jPnlIzuiqerda.add(jPnlPhone);

        jPnlLoginButton1.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));
        jPnlLoginButton1.setLayout(new java.awt.GridLayout(1, 1));

        jBtnCrearCuenta.putClientProperty("JComponent.roundRect", true);             // activa redondeo FlatLaf
        jBtnCrearCuenta.putClientProperty("JComponent.style", "arc: 20; borderWidth: 1;"); // radio 20px, grosor 1px
        jBtnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearCuentaActionPerformed(evt);
            }
        });
        jPnlLoginButton1.add(jBtnCrearCuenta);

        jPnlIzuiqerda.add(jPnlLoginButton1);

        add(jPnlIzuiqerda);

        jPnlDerecha.setLayout(new java.awt.GridLayout(1, 1));

        ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/images/profit_login_register_background.png"));
        ((recursos.ui.ScaledImageLabel) jLblBackgroundImage).setImage(icon.getImage());

        // Asignar la imagen escalada al JLabel
        jPnlDerecha.add(jLblBackgroundImage);

        add(jPnlDerecha);
    }// </editor-fold>//GEN-END:initComponents
    private boolean passwordMostrando = false;
    private char passwordEchoOriginal;
    private boolean echoGuardado = false;


    private void jLblLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLinkMouseClicked
        // Revaldar y repintar el JFrame al hacer clic:
        app.Main.frame.setContentPane(new vista.login.Login());
        app.Main.frame.revalidate();
        app.Main.frame.repaint();
    }//GEN-LAST:event_jLblLinkMouseClicked

    private void jLblIconPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblIconPasswordMousePressed
        // TODO add your handling code here:
        // Guardar el echo char original solo la primera vez
        if (!echoGuardado) {
            passwordEchoOriginal = jPasswordField.getEchoChar();
            echoGuardado = true;
        }

        if (!passwordMostrando) {
            // Mostrar contraseña
            jPasswordField.setEchoChar((char) 0);
            passwordMostrando = true;
        } else {
            // Restaurar contraseña oculta
            jPasswordField.setEchoChar(passwordEchoOriginal);
            passwordMostrando = false;
        }
    }//GEN-LAST:event_jLblIconPasswordMousePressed

    private void jBtnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearCuentaActionPerformed
        // TODO add your handling code here:
        Usuario u = new Usuario();
        u.setNombre(jTxtFNombre.getText());
        u.setApellido(jTxtFApellido.getText());
        u.setEmail(jTxtFEmail.getText());
        u.setContraseña(new String(jPasswordField.getPassword()));
        u.setTelefono(jFormattedTxFPhone.getText());

        UsuarioControlador controlador = new UsuarioControlador();

        if (controlador.agregar(u)) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            app.Main.frame.setContentPane(new vista.login.Login());
            app.Main.frame.revalidate();
            app.Main.frame.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario");
        }
    }//GEN-LAST:event_jBtnCrearCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCrearCuenta;
    private javax.swing.JFormattedTextField jFormattedTxFPhone;
    private javax.swing.JLabel jLblApellido;
    private javax.swing.JLabel jLblBackgroundImage;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblIconApellido;
    private javax.swing.JLabel jLblIconEmail;
    private javax.swing.JLabel jLblIconNombre;
    private javax.swing.JLabel jLblIconPassword;
    private javax.swing.JLabel jLblIconPhone;
    private javax.swing.JLabel jLblLink;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblPhone;
    private javax.swing.JLabel jLblTittle;
    private javax.swing.JLabel jLblTxt;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPanel jPnlApellido;
    private javax.swing.JPanel jPnlDerecha;
    private javax.swing.JPanel jPnlEmail;
    private javax.swing.JPanel jPnlFullName;
    private javax.swing.JPanel jPnlInternoApellido;
    private javax.swing.JPanel jPnlInternoEmail;
    private javax.swing.JPanel jPnlInternoNombre;
    private javax.swing.JPanel jPnlInternoPassword;
    private javax.swing.JPanel jPnlInternoPhone;
    private javax.swing.JPanel jPnlIzuiqerda;
    private javax.swing.JPanel jPnlLoginButton;
    private javax.swing.JPanel jPnlLoginButton1;
    private javax.swing.JPanel jPnlNombre;
    private javax.swing.JPanel jPnlPassword;
    private javax.swing.JPanel jPnlPhone;
    private javax.swing.JPanel jPnlTitle;
    private final javax.swing.JTextField jTxtFApellido = new javax.swing.JTextField();
    private final javax.swing.JTextField jTxtFEmail = new javax.swing.JTextField();
    private final javax.swing.JTextField jTxtFNombre = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
