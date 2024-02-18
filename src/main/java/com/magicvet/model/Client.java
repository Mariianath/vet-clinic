package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    private String firstname;
   private
   String lastname;
    private String email;

    private List<Pet> pets =new ArrayList<>();

    private final LocalDateTime registrationDate = LocalDateTime.now();

    @Override
    public String toString (){
        return "Client {"
                +"\n\tFirstname = " + firstname
                +", Lastname = " + lastname
                +", email = " + email
                +", registrtion date = " + registrationDate.format(FORMATTER)
                +"\n\tpets: " + pets
                +"\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstname, client.firstname)
                && Objects.equals(lastname, client.lastname)
                && Objects.equals(email, client.email)
                && Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, pets);
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Pet> getPet() {
        return pets;
    }

    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet (Pet pet){
        pets.add(pet);
    }
}
