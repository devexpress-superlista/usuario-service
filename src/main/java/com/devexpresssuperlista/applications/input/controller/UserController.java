package com.devexpresssuperlista.applications.input.controller;

import com.devexpresssuperlista.adapters.input.usecase.GetUserUseCase;
import com.devexpresssuperlista.applications.domain.dto.UserDTO;
import com.devexpresssuperlista.applications.domain.entity.User;
import com.devexpresssuperlista.applications.usecase.SaveUserUseCase;
import com.devexpresssuperlista.infra.exception.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final SaveUserUseCase saveUserUseCase;
    private final GetUserUseCase getUserUseCase;
    private final ModelMapper modelMapper;

    @Autowired
    public UserController(SaveUserUseCase saveUserUseCase, GetUserUseCase getUserUseCase, ModelMapper modelMapper) {
        this.saveUserUseCase = saveUserUseCase;
        this.getUserUseCase = getUserUseCase;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody UserDTO user) {
        User userToSave = modelMapper.map(user, User.class);
        return new ResponseEntity<User>(saveUserUseCase.saveUser(userToSave), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() throws UserNotFoundException {
        var users = getUserUseCase.getAllUsers();

        if (users.isPresent()) {
            return new ResponseEntity<List<User>>(users.get(), HttpStatus.OK);
        }

        throw new UserNotFoundException("Usuario não encontrado");
    }


}
