package com.api.crudTareas.repositories;

import com.api.crudTareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUTareaRepository extends JpaRepository<Tarea, Long> {
}
