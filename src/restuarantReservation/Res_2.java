/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restuarantReservation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author sitap
 */
public class Res_2 extends javax.swing.JFrame {

    /**
     * Creates new form Res_1
     */
    public Res_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	img_2 = new javax.swing.JLabel();
        res_2 = new javax.swing.JLabel();
        booking = new javax.swing.JButton();
        home = new javax.swing.JLabel();
        star = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(413, 735));
        setSize(new java.awt.Dimension(413, 735));

        img_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restuarantReservation/res_2re.jpg"))); // NOI18N

        res_2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        res_2.setText("Res_2");

        booking.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        booking.setText("Booking");
        booking.setPreferredSize(new java.awt.Dimension(222, 40));
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restuarantReservation/homeBut.png"))); // NOI18N
        home.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		MainFrame mf = new MainFrame();
                mf.setVisible(true);
                dispose();
        	}
        });
        
        star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restuarantReservation/starBut.png"))); // NOI18N
        star.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(null, "Added to Favorite");
//        		Favorite fav = new Favorite();
//                fav.setVisible(true);
//                dispose();
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                	.addGap(30, 30, 30)
                	.addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addGap(15, 15, 15)
                	.addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                	.addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addGap(50, 50, 50))
                .addGroup(layout.createSequentialGroup()
                	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                		.addComponent(img_2)
                        .addGroup(layout.createSequentialGroup()
                        	.addGap(33, 33, 33)
                        	.addComponent(res_2)))
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_2)
                .addGap(15, 15, 15)
                .addComponent(res_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home)
                	.addComponent(star))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>                        

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    	Booking b = new Booking();
        b.setVisible(true);
        dispose();
    }                                       

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Failed to apply look-and-feel.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Res_2().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton booking;
    private javax.swing.JLabel home;
    private javax.swing.JLabel img_2;
    private javax.swing.JLabel res_2;
    private javax.swing.JLabel star;
    // End of variables declaration                   
}
