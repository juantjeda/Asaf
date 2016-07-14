/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.frmMenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author JuanJose
 */
public class MenuPrincipal implements ActionListener{
    private final frmMenuPrincipal view;
    
    public MenuPrincipal(frmMenuPrincipal vista){
        this.view = vista;
        iniciar();
    }
    /*INICIA*/
    private void iniciar(){
        this.view.setTitle("Asaf");
        this.view.setLocationRelativeTo(null);
    }
    public void go(){
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
