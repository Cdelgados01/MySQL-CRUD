
package com.mycompany.mysql01;

import com.mycompany.mysql01.logica.Controladora;
import com.mycompany.mysql01.logica.Usuario;
import com.mycompany.mysql01.persistencia.ControladoraPersistencia;
import java.util.Date;

public class MySQL01 {

    public static void main(String[] args) {
        
        Controladora control = new Controladora ();
        Usuario User = new Usuario(21, "Nancy", "Suárez", new Date());
        control.crearUsuario(User);
    } 
}
