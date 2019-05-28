package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDao <T extends Entity> implements Dao<T>{

    File driverFile = new File("D:\\Taxi-agency\\src\\com\\taxiagency\\resources");

    @Override
    public void save(T obj) {
        try(FileWriter fileWriter = new FileWriter(driverFile);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter)){
            bufferedWriter.write(obj.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(T obj) {

    }

    @Override
    public void upsert(T obj) {

    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public T findById(String id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();;
        try (FileReader fileReader = new FileReader(driverFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            bufferedReader.read();
            Object line = null;

            while ((line = bufferedReader.readLine()) != null) {
                list.add((T) line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

