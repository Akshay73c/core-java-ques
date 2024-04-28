package JavaQue5;

public class Order {
    public int orderId;
    public int petId;
    public int quantity;
    public Status Status; //is Placed

    public Order(int orderId, int petId, int quantity, Status status) {
        this.orderId = orderId;
        this.petId = petId;
        this.quantity = quantity;
        Status = status;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus (Status status) {
        Status = status;
    }
}
