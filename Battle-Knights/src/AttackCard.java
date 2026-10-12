class AttackCard extends Card {
    private final int damage;

    public AttackCard(String name, int cost, String description, int damage) {
        super(name, cost, description);
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

    @Override
    public void play(Player player, Enemy target) {
        target.takeDamage(damage);
    }
}