package bstorm.akimts.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @Column(name = "course_id")
    private String id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_ects", columnDefinition = "DECIMAL(3, 1)")
    private double ects;

    @Column(name = "professor_id")
    private int profId;

    @ManyToMany(mappedBy = "courses")
    private List<Section> section;


}
