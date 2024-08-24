package Store;

public class Store <T, O> {
    private T showcase;
    private O warehouse;

    public Store() {
    }

    public Store(T showcase, O warehouse) {
        this.showcase = showcase;
        this.warehouse = warehouse;
    }

    public T getShowcase() {
        return showcase;
    }

    public void setShowcase(T showcase) {
        this.showcase = showcase;
    }

    public O getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(O warehouse) {
        this.warehouse = warehouse;
    }
}
