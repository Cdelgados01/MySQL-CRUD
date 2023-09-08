
package com.mycompany.mysql01.logica;

import com.mycompany.mysql01.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia ControlPersist = new ControladoraPersistencia ();
        
    public void crearUsuario (Usuario User){
    ControlPersist.crearUsuario (User);
            
    }        
}
