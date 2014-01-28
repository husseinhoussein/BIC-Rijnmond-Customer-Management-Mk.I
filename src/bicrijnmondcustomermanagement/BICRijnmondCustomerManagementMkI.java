/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicrijnmondcustomermanagement;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ikkileo
 */
public class BICRijnmondCustomerManagementMkI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new DataView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
