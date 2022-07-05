//package bstorm.akimts.jpa;
//
//import bstorm.akimts.jpa.entities.Section;
//import jakarta.persistence.*;
//
//import java.util.List;
//
//public class MainAlexandre {
//
//    public static void main(String[] args) {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceDemoMySQL");
//        EntityManager manager = emf.createEntityManager();
//
//        //GET ONE
//        Section s = manager.find(Section.class, 1010 );
//
//        System.out.println( s );
//
//        //GET ALL
//        TypedQuery<Section> query = manager.createQuery("SELECT s FROM Section s", Section.class);
//        List<Section> list = query.getResultList();
//
//        list.forEach(System.out::println);
//
//        //INSERT
////        Section toInsert = new Section(3, "to delete", null);
////
////        manager.getTransaction().begin();
////        manager.persist( toInsert );
////        manager.getTransaction().commit();
//
//        //DELETE
////        Section toDelete = manager.find(Section.class, 3);
////        manager.getTransaction().begin();
////        manager.remove( toDelete );
////        manager.getTransaction().commit();
//
//        //UPDATE
//        manager.getTransaction().begin();
//        s.setDelegateId(25);
//        manager.getTransaction().commit();
//
//
//
//        emf.close();
//    }
//}
