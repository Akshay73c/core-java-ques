package JavaQue5;

public class Pet {
    private int petId;
    private String name;
    private Category category;
    private int unitPrice;
    private int stock;

    public int getPetId() {
        return petId;
    }

    public Pet(int petId, String name, Category category, int unitPrice, int stock) {
        this.petId = petId;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
