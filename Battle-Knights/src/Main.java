public class Main {
    public static void main(String[] args) {
    AttackCard attack1 = new AttackCard("a sword", 1, "a sword swing", 5);
    DefenseCard defence1 = new DefenseCard("shield", 2, "a shield to block attacks", 3);
    HealCard heal1 = new HealCard("a potion", 1, "a potion to heal health", 5);
    System.out.println("you can attack with " + attack1.getName() + " this will cost you " + attack1.getCost() + " energy, this card is " + attack1.getDescription() + " it will do " + attack1.getDamage() + " damage");
    System.out.println("you can defend with " + defence1.getName() + " this will cost you " + defence1.getCost() + " energy, this card is " + defence1.getDescription() + " it will block " + defence1.getDefence() + " damage");
    System.out.println("you can heal with " + heal1.getName() + " this will cost you " + heal1.getCost() + " energy, this card is " + heal1.getDescription() + " it will heal " + heal1.getHeal() + " health");

    Player player = new Player("Knight", 50, 10);
    System.out.println("you are a " + player.getName() + ", you have " + player.getCurrentHealth() + " health, you have " + player.getCurrentEnergy() + " energy");

    Enemy enemy = new Enemy("troll", 20);
    System.out.println("the enemy is a " + enemy.getName() + " they have " + enemy.getCurrentHealth() + " health");

    player.playCard(attack1, enemy);
    System.out.println("the " + enemy.getName() + " has " + enemy.getCurrentHealth() + " health");

    player.playCard(defence1, enemy);
        System.out.println("the " + player.getName() + " has " + player.getBlock() + " block");

    enemy.chooseMove();
    enemy.takeTurn(player);
    System.out.println("the " + player.getName() + " has " + player.getCurrentHealth() + " health");

    player.playCard(heal1, enemy);
    System.out.println("the " + player.getName() + " has " + player.getCurrentHealth() + " health");
    }
}