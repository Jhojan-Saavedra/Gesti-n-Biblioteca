# Sistema de Gestión de Tareas

### 📋 Descripción del Proyecto

Este proyecto es una aplicación de gestión de tareas desarrollada con Spring Boot, que implementa un API RESTful para realizar operaciones CRUD (Crear, Leer, Actualizar, Borrar) sobre una entidad Tarea.

La aplicación sigue el patrón de diseño MVC (Modelo-Vista-Controlador), separando claramente las responsabilidades:

*    Modelo: La clase Tarea que representa la entidad de datos.
*    Repositorio: Interfaces de Spring Data JPA para la persistencia de datos.
*   Servicio: La capa de lógica de negocio que interactúa con el repositorio.
*    Controlador: La capa de la API REST que maneja las solicitudes HTTP.

El proyecto está configurado para conectarse a una base de datos PostgreSQL.

### 🚀 Tecnologías Utilizadas

*    Java 17: Lenguaje de programación.
*    Spring Boot: Framework para el desarrollo rápido de aplicaciones Java.
*    Spring Data JPA: Para la persistencia y mapeo de objetos a la base de datos.
*   PostgreSQL: Base de datos relacional.
*  Maven: Herramienta de gestión de dependencias del proyecto.

### 🛠️ Requisitos del Sistema

Para ejecutar este proyecto, necesitas tener instalado:

* JDK 17 o superior.
* Apache Maven 3.6.0 o superior.
* PostgreSQL 12 o superior.
* Un IDE como IntelliJ IDEA o VS Code.

### INTEGRANTES

* Jhojan Saavedra - Model y Repository
* Yised Patricia Robles - Controller
* Larry Jan Pierr - Service
* Shanya Herrera Rubio - Postman
