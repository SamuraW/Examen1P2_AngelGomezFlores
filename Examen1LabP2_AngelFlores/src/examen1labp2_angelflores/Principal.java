/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1labp2_angelflores;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel G
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_direccionIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_mascaraRed = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_hostName = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        jlb_lista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mascara de Red:");

        jLabel2.setText("Direccion IP:");

        jLabel3.setText("Hostname");

        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_listar.setText("Listar");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });

        jlb_lista.setBackground(new java.awt.Color(153, 153, 153));
        jlb_lista.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlb_lista.setForeground(new java.awt.Color(0, 0, 0));
        jlb_lista.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LISTA DE COMPUTADORAS");
        jLabel4.setOpaque(true);

        btn_ingresar.setText("Ingresar PC");
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_PrincipalLayout = new javax.swing.GroupLayout(jp_Principal);
        jp_Principal.setLayout(jp_PrincipalLayout);
        jp_PrincipalLayout.setHorizontalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                                .addComponent(btn_agregar)
                                .addGap(61, 61, 61)
                                .addComponent(btn_listar)
                                .addGap(53, 53, 53)
                                .addComponent(btn_ingresar))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_PrincipalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_direccionIp, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jp_PrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_mascaraRed, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_hostName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PrincipalLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(672, Short.MAX_VALUE)))
        );
        jp_PrincipalLayout.setVerticalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txt_direccionIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mascaraRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_lista, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_listar)
                    .addComponent(btn_ingresar))
                .addGap(24, 24, 24))
            .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PrincipalLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        // TODO add your handling code here:
        direccionIp = txt_direccionIp.getText();
        txt_direccionIp.addKeyListener(new KeyAdapter(){
        @Override
        public void keyTyped(KeyEvent e){
            char cara = e.getKeyChar();
            if (Character.isDigit(cara)) {
                System.out.println("Es un numero");
            }else {
                JOptionPane.showMessageDialog(null, "Ese no es un numero");
                e.consume();
            }
        }
    

//        for (int i = 0; i < direccionIp.length() ; i++) {
//            if (direccionIp.charAt(i) == 'A' ||) {
//                
//            }
//        }
        String mascaraRed = txt_mascaraRed.getText();
        String hostName = txt_hostName.getText();
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo De pc:(1)Escritorio/2)Laptop)"));
        switch (tipo) {
            case 1: {
                /*
                 Capacidad de RAM
■ Capacidad de almacenamiento
■ Tipo de almacenamiento (HDD o SSD)
■ Indicación de si tiene tarjeta gráfica o no

                 */
                int capacidadRam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad de ram:"));
                double capacidadAlmacenamiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad de Almacenamiento::"));
                String tipoAlmacenamiento = JOptionPane.showInputDialog(null, "Ingrese el tipo de Almcenamiento de HDD/SSD:");
                String grafica = JOptionPane.showInputDialog(null, "tiene grafica (si)/(no):");
                Escritorio escritorio = new Escritorio(capacidadRam, capacidadAlmacenamiento, tipoAlmacenamiento, grafica, direccionIp, mascaraRed, hostName);
                computadoras.add(escritorio);
                break;

            }
            case 2: {
                /*
                String marca;
                String definicionPantalla;
                String Rgb;
                 */
                String marca = JOptionPane.showInputDialog(null, "Ingrese la marca de la computadora:");
                String definicionPantalla = JOptionPane.showInputDialog(null, "Ingrese la definicio de la pantalla:");
                String Rgb = JOptionPane.showInputDialog(null, "La Laptop tiene RGB(si)/(no):");
                Laptop laptop = new Laptop(marca, definicionPantalla, Rgb, direccionIp, mascaraRed, hostName);
                computadoras.add(laptop);
                break;
            }

        }

    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
        // TODO add your handling code here:
        for (int i = 0; i < computadoras.size(); i++) {
            jlb_lista.setText(computadoras.get(i).toString());
        }
    }//GEN-LAST:event_btn_listarMouseClicked

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
        // TODO add your handling code here:
       
        recorriendo();
        int seleccionando = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion de la PC que desea ingresar:"));
        if (seleccionando < 0 || seleccionando > computadoras.size()) {
            seleccionando = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese de nuevo la posicion de la PC que desea ingresar:"));
        } else {
            JOptionPane.showMessageDialog(null, "no hay ninguno con la posicion ingresada(pueda ser que no agrego ningun usuario)");
        }
        this.setVisible(false);
        System.out.print(computadoras.get(seleccionando).getHostName() + "#");
        String ping = entrada.next();
        String comando1 = ping.substring(0, 5);
        if (comando1.equalsIgnoreCase("ping_")) {
            String guardandoNumeros = ping.substring(5);
            String pSegmento = guardandoNumeros.substring(5, 8);
            String sSegmento = guardandoNumeros.substring(9, 13);
            String tSegmento = guardandoNumeros.substring(14);
            System.out.println("" + pSegmento);
            System.out.println("" + sSegmento);
            System.out.println("" + tSegmento);

        } else if (comando1.equalsIgnoreCase("exit")) {
            this.setVisible(true);

        }else if (comando1.equalsIgnoreCase("show")){
            System.out.println("Direccion de Ip:"+computadoras.get(seleccionando).getDireccionIp()+"\n Mascara  de Red:"+computadoras.get(seleccionando).getMascaraDered());
        }
        ping = entrada.next();

    }//GEN-LAST:event_btn_ingresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void recorriendo() {
        for (int i = 0; i < computadoras.size(); i++) {
            JOptionPane.showMessageDialog(null, computadoras.get(i).toString());
            System.out.println(""+computadoras.get(i).toString());

        }
    }
    public Scanner entrada = new Scanner(System.in);
    public String direccionIp;
    public ArrayList<Pc> computadoras = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlb_lista;
    private javax.swing.JPanel jp_Principal;
    private javax.swing.JTextField txt_direccionIp;
    private javax.swing.JTextField txt_hostName;
    private javax.swing.JTextField txt_mascaraRed;
    // End of variables declaration//GEN-END:variables
}
