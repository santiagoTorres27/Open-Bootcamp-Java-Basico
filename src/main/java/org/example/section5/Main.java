package org.example.section5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD crud = new CocheCRUDImpl();

        crud.save();
        crud.findAll();
        crud.delete();
    }
}
