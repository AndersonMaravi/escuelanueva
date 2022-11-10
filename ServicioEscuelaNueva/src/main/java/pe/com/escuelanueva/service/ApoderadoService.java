package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.ApoderadoEntity;

public interface ApoderadoService {
    //funcion para mostrar todos los distritos
    List<ApoderadoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<ApoderadoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<ApoderadoEntity>findById(Long id);
    //funcion para registrar
    ApoderadoEntity add(ApoderadoEntity a);
    //funcion para actualizar
    ApoderadoEntity update(ApoderadoEntity a);
    //funcion para eliminar
    ApoderadoEntity delete(ApoderadoEntity a);
    
}
