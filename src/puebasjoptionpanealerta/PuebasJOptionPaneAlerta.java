/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puebasjoptionpanealerta;

import javax.swing.JOptionPane;

/**
 *
 * @author aparracorbacho
 */
public class PuebasJOptionPaneAlerta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Alert Mensaje", "Alert titulo", JOptionPane.ERROR_MESSAGE); 
        /**
         * Al crear la alerta hay que importar javax.swing.JOptionPane
         * El mensaje va primero y luego el titulo
         */
    }
    
}
