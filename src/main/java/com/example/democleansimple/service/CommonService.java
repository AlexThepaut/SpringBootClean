package com.example.democleansimple.service;

import com.example.democleansimple.service.mapper.CommonMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CommonService<I, E, T> {
    abstract JpaRepository<E, I> repository();
    abstract CommonMapper<E, T> mapper();

    public List<T> getAll() {
        return repository().findAll().stream().map(mapper()::toDto).collect(Collectors.toList());
    }

    public T save(T toSave) {
        return mapper().toDto(repository().save(mapper().toEntity(toSave)));
    }

    public void delete(T toDelete) {
        repository().delete(mapper().toEntity(toDelete));
    }
}
