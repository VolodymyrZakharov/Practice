package project.entity;

import javax.persistence.*;

@Entity
@Table(name = "apartment")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    @Column(name = "id")
    private Long id;

    @Column(name = "id")
    String name;
}
