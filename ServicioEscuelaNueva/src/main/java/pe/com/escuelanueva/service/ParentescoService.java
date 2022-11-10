
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ParentescoEntity;


public interface ParentescoService {
    //funcion para mostrar todos los distritos
    List<ParentescoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<ParentescoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<ParentescoEntity>findById(Long id);
    //funcion para registrar
    ParentescoEntity add(ParentescoEntity p);
    //funcion para actualizar
    ParentescoEntity update(ParentescoEntity p);
    //funcion para eliminar
    ParentescoEntity delete(ParentescoEntity p);
    
}
