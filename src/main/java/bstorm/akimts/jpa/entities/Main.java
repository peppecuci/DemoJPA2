package bstorm.akimts.jpa.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceDemoMySQL");
        EntityManager manager = emf.createEntityManager();
        int id;
        Scanner sc = new Scanner(System.in);
        SectionDAO sectionDAO = new SectionDAO(manager);

        //sectionDAO.create(manager);

//        System.out.println("Id of the section to find:\n");
//        id = sc.nextInt();
//        Section s = sectionDAO.getOne(manager, id);
//        System.out.println(s);

        List<Section> list = sectionDAO.getAll(manager);
        list.forEach (System.out::println);



        emf.close();

    }
}
