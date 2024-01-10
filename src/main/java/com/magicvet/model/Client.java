package main.java.com.magicvet.model;

import java.util.Objects;

public class Client {
    private String firstname;
   private
   String lastname;
    private String email;

    private Pet pet;

    @Override
    public String toString (){
        return "Client {"
                +"\n\tFirstname = " + firstname
                +", Lastname = " + lastname
                +", email = " + email
                +"\n\tpet: " + pet
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
                && Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, pet);
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
