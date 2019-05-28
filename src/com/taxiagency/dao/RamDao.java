package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.*;

public class RamDao<T extends Entity> implements Dao<T> {

    private Map<String, Entity> ram;

    public RamDao() {
        this.ram = new HashMap<>();
    }

    @Override
    public void save(Entity obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void update(Entity obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void upsert(Entity obj) {
        if (ram.containsValue(obj)) {
            update(obj);
        } else {
            save(obj);
        }
    }

    @Override
    public void delete(Entity obj) {
        ram.remove(obj.getId());
    }

    @Override
    public T findById(String id) {
        return (T) ram.get(id);
    }

    @Override
    public List<T> findAll() {
        List<T> objects = new ArrayList<>();
        Set<String> keys = ram.keySet();

        for (String key : keys) {
            Entity obj = ram.get(key);
            objects.add((T) obj);
        }

        return objects;
    }
}
