public class EventPlanner {
    private int guests;
    private int price;
    public EventPlanner(int guests) {
        this.guests = guests;
        this.price = 0;
        this.price += this.guests;

    }
    public int getGuests() {
        return this.guests;
    }
    public int getPrice() {
        return 0;
    }
}
