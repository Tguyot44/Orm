package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Message",
uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String message;
    @ManyToOne
    private Channel channel;
    @OneToMany
    private List<Note> notes;
}
