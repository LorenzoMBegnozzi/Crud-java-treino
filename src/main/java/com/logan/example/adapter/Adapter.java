package com.logan.example.adapter;

public interface Adapter<T, J> {
//recebo um json no create, vai chegar o dto e vai transfomars em entidade para salvar, e faço isso para poder listar no front
    T toEntity(J dto);

    J toDTO(T entity);
}
