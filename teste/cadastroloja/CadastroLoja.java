/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package teste.cadastroloja;

import javax.swing.JOptionPane;
import telas.FrmLogin;

public class CadastroLoja {

    public static void main(String[] args) {
        try{
            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setResizable(false); 
            frmLogin.setVisible(true);
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao iniciar! " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
