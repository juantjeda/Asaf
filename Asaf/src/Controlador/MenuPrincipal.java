/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.frmMenuPrincipal;

/**
 * 
 * @author JuanJose
 */
public class MenuPrincipal {
    private frmMenuPrincipal view;
    public MenuPrincipal(frmMenuPrincipal vista){
        this.view = vista;
        iniciar();
    }
    /*INICIA*/
    private void iniciar(){
        view.setTitle("Asaf");
        view.setLocationRelativeTo(null);
    }
    public void go(){
        this.view.setVisible(true);
    }
}
