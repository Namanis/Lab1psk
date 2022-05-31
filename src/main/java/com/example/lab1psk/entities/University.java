package com.example.lab1psk.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({

        @NamedQuery(name = "University.findAll", query = "select u from University u")
})
@Table
@Getter
@Setter
@NoArgsConstructor
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private int version;


    @OneToMany(mappedBy="university")
    private List<Student> studentSet;

    @OneToMany(mappedBy="university")
    private List<Course> courseSet;


    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof University o)) {
            return false;
        }
        return o.id == this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
