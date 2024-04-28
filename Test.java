package JavaQue5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        petStore.displayMenu();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("LoginId and Password?");
                    petStore.currentUser = petStore.login(sc.next(), sc.next());
                    if (petStore.currentUser != null) {
                        System.out.println("Login successful!");
                    }
                    petStore.displayMenu();
                break;

                case 2:
                    //add new pet
                    if (petStore.currentUser != null) {
                        System.out.println("Name of pet?");
                        String nameOfPet = sc.next();
                        System.out.println(petStore.addNewPet(1, nameOfPet, Category.CAT, 100, 4));
                    } else {
                        System.out.println("Please login to add a new pet.");
                    }
                    petStore.displayMenu();
                break;
            }
        } while (choice!=9);

    }
}
