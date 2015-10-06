/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Para no olvidar la referencias jajaja.
 * http://www.jc-mouse.net/proyectos/gestion-de-stock-la-vista-parte-3
 */
package Controlador;

import Vista.frmMenuPrincipal;
import javax.swing.JFrame;

/**
 * Asaf 2.0 Version mejorada y acepta ingreso de datos.
 * @author JuanJo
 */
public class Asaf {
    public static void main(String[] args) {
        //Busco el menu principal para hacer su despliegue.
        frmMenuPrincipal menu = new frmMenuPrincipal();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que termine todo cuando salga.
        menu.setVisible(true); // Lo hace visible a la vista humana.
    }  
}