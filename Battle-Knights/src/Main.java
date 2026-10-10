public class Main {
    public static void main(String[] args) {
// TEMPORARY: just checking constructor and getter is working
        Card card = new Card("sword",1,"a sword swing");
        System.out.println("your using a " + card.getName());
        System.out.println("the cost is " + card.getCost());
        System.out.println("what is the description: " + card.getDescription());
    }
}