package com.api.biblioteca.services;

import com.api.biblioteca.models.UserModel;
import com.api.biblioteca.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<UserModel> getlibro() {
        return (List<UserModel>) userRepository.findAll();
    }

    public UserModel savelibro(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getlibroById(Long id) {
        return userRepository.findById(id);
    }

    public UserModel updatelibroById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();

        user.setTitulo(request.getTitulo());
        user.setAutor(request.getAutor());
        user.setAnioPublicacion(request.getAnioPublicacion());
        user.setDisponible(request.isDisponible());

        return user;
        }

        public Boolean deletelibroById(Long id) {
            try {
                userRepository.deleteById(id);
                return true;
            } catch (Exception err) {
                return false;
            }
        }
}
