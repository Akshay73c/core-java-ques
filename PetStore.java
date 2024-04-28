package JavaQue5;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    private List<Pet> pets;
    private List<Order> orders;
    public User currentUser;


    public PetStore() {
        pets = new ArrayList<>();
        orders = new ArrayList<>();
        currentUser = null;
    }

    public User login(String loginId, String password) {
        if (loginId.equals("admin") && password.equals("admin")) {
            currentUser = new Admin(loginId, password);
        } else if (loginId.equals("c1") && password.equals("c1")) {
            currentUser = new Customer(loginId, password);
        } else {
            System.out.println("Wrong inputs");
        }
        return currentUser;
    }

    public void displayMenu(){
        System.out.println("1.LogIn\n2.Add a new pet\n3.Update pet\n4.Display pets\n5.order pet\n6.Check orderStatus\n7.Update order\n8.Logout\n.9.Exit");
    }

    public String addNewPet(int petid, String name, Category category, int unitPrice, int stock) {
        if (currentUser != null && currentUser.isAdmin()) {
            pets.add(new Pet(petid, name, category, unitPrice, stock));
            return "Pet added";
        } else {
            return "Not a Admin";
        }

    }

    public List<Pet> displayPets() {
        return this.pets;
    }

    public Order orderPet(int orderId, int petId, int quantiy) {
        if (currentUser != null){
            Pet petToOrder = findPetById(petId);
            if (petToOrder != null && petToOrder.getStock() >= quantiy) {
                Order order = new Order(orderId, petId, quantiy, Status.PLACED);
                orders.add(order);
                petToOrder.setStock(petToOrder.getStock() - quantiy);
                System.out.println("Order Placed");
                return order;
            }
            System.out.println("No pet found!!");

        }
        System.out.println("Couldn't place order");
        return null;
    }

    public Status checkOrderStatus (int orderID) {
         for (Order order : orders) {
             if (order.orderId == orderID) {
                 return order.Status;
             }
         }
        System.out.println("No order found");
         return null;
    }

    public String updateOrder(int orderId, Status status) {
        if (currentUser.isAdmin()) {
            Order order = findOrderById(orderId);
            order.setStatus(status);
            return "Updated!";
        } else return "Not a Admin";

    }

    private Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                return order;
            }
        }
        System.out.println("No order found");
        return null;
    }

    private Pet findPetById(int petId) {
        for (Pet pet : pets) {
            if (pet.getPetId() == petId) {
                return pet;
            }
        }
        return null;
    }

}
