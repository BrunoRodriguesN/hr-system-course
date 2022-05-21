package br.com.bruno.userapi.services.impl;

import br.com.bruno.userapi.domain.User;
import br.com.bruno.userapi.repositories.UserRepository;
import br.com.bruno.userapi.services.UserService;
import br.com.bruno.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));

    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
