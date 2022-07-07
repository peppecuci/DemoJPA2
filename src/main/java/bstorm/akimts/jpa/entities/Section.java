package bstorm.akimts.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "section")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Section {

    @Id
    @Column(name = "section_id")
    private int id;
    @Column(name = "section_name")
    private String name;


    @OneToMany(mappedBy = "section")
    private List<Student> studentList;

    @ManyToMany
    @JoinTable(
            name = "course_section",
            joinColumns = @JoinColumn(name = "section_id"), //ref à la table de Section
            inverseJoinColumns = @JoinColumn(name = "course_id")) //ref à la table de Course
    private List<Course> courses;

    @OneToOne
    @JoinColumn(name = "delegate_id")
    private Student delegue;


     public Section(int i, String my_new_section, int i1) {
     }

    @Override
    public String toString() {
        return "Section: " +
                "id= " + id +
                ", name= " + name +
                ", studentList= " + studentList +
                ", courses=" + courses;
    }
}
