package org.dh.c2023II.clinica.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IController<E> {
    List<E> listarTodos();
}
