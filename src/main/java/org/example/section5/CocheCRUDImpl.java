package org.example.section5;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("save() called");
    }

    @Override
    public void findAll() {
        System.out.println("findAll() called");
    }

    @Override
    public void delete() {
        System.out.println("delete() called");
    }
}
