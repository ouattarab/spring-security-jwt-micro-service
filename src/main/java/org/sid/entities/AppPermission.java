package org.sid.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AppPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;

    @ManyToMany(mappedBy = "permissions")
    private Set<AppRole> roles;

}
