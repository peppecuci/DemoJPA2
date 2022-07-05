package bstorm.akimts.jpa.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class SectionDAO {

    private final EntityManager emf;

    //CREATE = INSERT
    public void create(EntityManager managerFunction) {
        Section toInsert = new Section(110, "My new section", 150);

        managerFunction.getTransaction().begin();
        managerFunction.persist( toInsert );
        managerFunction.getTransaction().commit();
    }

    //READ
    public Section getOne(EntityManager managerFunction, int idFunction) {
        Section s = managerFunction.find(Section.class, idFunction);
        return s;
    }


    public List<Section> getAll(EntityManager managerFunction) {
        TypedQuery<Section> query = managerFunction.createQuery("SELECT s FROM Section s", Section.class);

        return query.getResultList(); //AUTRE FACONS D'ECRIRE LE RETURN DE LA LISTE<SECTION>

        //List<Section> list = query.getResultList();
        //return list;
    }

    //UPDATE
    //DELETE

}
