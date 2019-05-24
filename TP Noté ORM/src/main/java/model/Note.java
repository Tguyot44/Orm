package model;

import javax.persistence.*;

@Entity
@Table(name = "Note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Message message;
    @ManyToOne
    private User user;
    private  boolean positive;

}
