/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author sistemas
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login=Login.getLogin(); // se conecta la clase Login con la instancia login y haciendo el uso del singleton, metodo getLogin()
        login.setVisible(true); //con el llamado de la clase Login con la instancia login se hace visible la interfaz grafica de la clase Login
    }
    
}
