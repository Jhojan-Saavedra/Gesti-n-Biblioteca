package com.api.biblioteca.controllers;

import com.api.biblioteca.models.UserModel;
import com.api.biblioteca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libro")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getlibro() {
        return this.userService.getlibro();
    }

    @PostMapping
    public UserModel savelibro(@RequestBody UserModel user) {
        return this.userService.savelibro(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getlibroById(@PathVariable("id") Long id) {
        return this.userService.getlibroById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updatelibroById(@RequestBody UserModel request, @PathVariable("id") Long id) {
        return this.userService.updatelibroById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deletelibroById(@PathVariable("id") Long id) {
        Boolean ok = this.userService.deletelibroById(id);
        if (ok) {
            return "Se eliminó el libro con id " + id;
        } else {
            return "No pudo eliminar el libro con id" + id;
        }
    }
}
