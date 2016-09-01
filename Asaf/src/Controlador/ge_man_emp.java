/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.frmge_empresa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author JuanJose
 */
public class ge_man_emp implements ActionListener{
    private final frmge_empresa view;
    
    public ge_man_emp(frmge_empresa vista){
        this.view = vista;
        iniciaremp();
    }
    /*INICIA*/
    private void iniciaremp(){
        this.view.setTitle("Empresaf");
        this.view.setLocation(10, 15);
    }
    public void goemp(){
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
