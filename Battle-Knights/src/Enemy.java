public class Enemy extends Entities {
    private int choice;
    private int amount;

    public Enemy(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public void chooseMove() {
        choice = (int) (Math.random() * 3);
        amount = (int) (Math.random() * 10) + 1; // 1 to 10

        switch (choice) {
            case 0:
                System.out.println(getName() + " will attack for " + amount);
                break;
            case 1:
                System.out.println(getName() + " will heal for " + amount);
                break;
            case 2:
                System.out.println(getName() + " will block for " + amount);
                break;
        }
    }

    public void takeTurn(Player player) {

            switch (choice) {
                case 0:
                    System.out.println(getName() + " attacks for " + amount);
                    player.takeDamage(amount);
                    break;
                case 1:
                    System.out.println(getName() + " heals for " + amount);
                    heal(amount);
                    break;
                case 2:
                    System.out.println(getName() + " blocks for " + amount);
                    blocked(amount);
                    break;
            }
    }
}