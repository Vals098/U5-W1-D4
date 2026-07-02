package valeriafarinosi.U5_W1_D4.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //solo per i serial, no UUID
    @Setter(AccessLevel.NONE) //Toglie il setter dell'Id
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "profile_img")
    private String profileimg;

    public User(String email, long id, String name, String password, String profileimg, String surname) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.profileimg = "https;//picsum.photos/200/300";
        this.surname = surname;
    }
}
