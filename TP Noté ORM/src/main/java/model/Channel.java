package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Channel",
uniqueConstraints = {@UniqueConstraint(columnNames = "id" )})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    private Boolean privacyEnabled;

    @OneToMany(mappedBy = "Channel", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "Channel", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Message> messages;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPrivacyEnabled() {
        return privacyEnabled;
    }

    public void setPrivacyEnabled(Boolean privacyEnabled) {
        this.privacyEnabled = privacyEnabled;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
