package com.empleado.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="nombre")     
    private String firstName;

    @Column(name ="apellido")
    private String lastName;

    @Column(name ="email" )
    private String email;

    public Empleado() {

    }

    public Empleado(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName; 
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName; 
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
