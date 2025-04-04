package com.selidrissi.todowithcucumber.infrastructure;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class JpaTodoRepositoryStub implements JpaTodoRepository {
    private List<TodoEntity> todoEntities = new ArrayList<>();

    @Override
    public void flush() {

    }

    @Override
    public <S extends TodoEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TodoEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TodoEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TodoEntity getOne(UUID uuid) {
        return null;
    }

    @Override
    public TodoEntity getById(UUID uuid) {
        return null;
    }

    @Override
    public TodoEntity getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends TodoEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TodoEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TodoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TodoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TodoEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TodoEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TodoEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends TodoEntity> S save(S entity) {
        todoEntities.add(entity);
        return entity;
    }

    @Override
    public <S extends TodoEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TodoEntity> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public List<TodoEntity> findAll() {
        return null;
    }

    @Override
    public List<TodoEntity> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(TodoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends TodoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<TodoEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TodoEntity> findAll(Pageable pageable) {
        return null;
    }
}
