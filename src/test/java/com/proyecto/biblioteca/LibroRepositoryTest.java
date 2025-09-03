package com.proyecto.biblioteca.repository;

import com.proyecto.biblioteca.model.Libro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class LibroRepositoryTest {

    @Autowired
    private LibroRepository libroRepository;

    @Test
    void guardarYLeerLibro() {

        Libro libro = new Libro();
        libro.setTitulo("Mi primer libro");
        libro.setAutor("Autor Desconocido");
        libro.setAnioPublicacion(2025);
        libro.setDisponible(true);


        Libro guardado = libroRepository.save(libro);


        assertThat(guardado.getId()).isNotNull();
        assertThat(guardado.getTitulo()).isEqualTo("Mi primer libro");
    }
}
