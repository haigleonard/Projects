/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.swing.JOptionPane;

/**
 *
 * @author aidanshimmon
 */
public class ErrorMessage 
{
    public static void infoBox(String message, String barName)
    {
        JOptionPane.showMessageDialog(null, message, ""+barName, JOptionPane.INFORMATION_MESSAGE);
    }
}
