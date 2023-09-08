
package com.mycompany.mysql01.persistencia;

import com.mycompany.mysql01.logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController UserJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario User) {
        UserJpa.create(User);
    }
    
}
