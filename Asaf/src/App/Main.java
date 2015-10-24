/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App;

import Controlador.MenuPrincipal;
import Vista.frmMenuPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 
 * @author JuanJose
 */
public class Main {
        public static void main(String[] args) {
        //se crean los objetos MODELO Y VISTA
        //modelo modelo = new modelo();
        frmMenuPrincipal vista = new frmMenuPrincipal();
       //Para colocar un skin propio de java
       try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            new MenuPrincipal(vista).go();
        } catch (UnsupportedLookAndFeelException ex) {}
          catch (ClassNotFoundException ex) {}
          catch (InstantiationException ex) {}
          catch (IllegalAccessException ex) {}
    } 
}
