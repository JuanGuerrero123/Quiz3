package com.example.BDSpringSD.InterfaceService;


import com.example.BDSpringSD.Model.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    // AQUI SE VAN A CREAR LOS METODOS QUE VOY USAR

    public List<Estudiante> listar();

    public void guardar(Estudiante est);

    public Optional<Estudiante> editar(int id);

    public void eliminar (int id);


}
