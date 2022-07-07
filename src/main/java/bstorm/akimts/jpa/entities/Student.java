package bstorm.akimts.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

//@Table(name = "student")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    //Uni-directionelles - 1 variable dans 1 classe
    //Bi-directionelles - 1 variable dans chacune des classes

    //OneToOne - OneToOne
    //OneToMany - ManyToOne
    //ManyToOne - OneToMany
    //ManyToMany - ManyToMany

    //dans le cas bi-directionelles
    //entity forte / faible

    @Id
    @Column(name = "student_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private  Section section;

    @OneToOne(mappedBy = "delegue")
    private Section delegueDe;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", section=" + section +
//                '}';
//    }
}
