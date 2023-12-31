package main.java.com.magicvet.component;

import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

public class ApplicationRunner {

    private ClientService clientService= new ClientService();
    private PetService petService = new PetService();
   public void run(){
        if (Authenticator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null){
                System.out.println("Adding a new pet.");
                Pet pet = petService.registerNewPet();
                client.setPet(pet);
                pet.setOwnerName(client.getFirstname()+" "+client.getLastname());
                System.out.println("Pet has been added.");
            }
        }

    }
}
