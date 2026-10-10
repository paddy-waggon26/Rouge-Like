class HealCard extends Card {
    private final int heal;

    HealCard(String name, int cost, String description, int heal) {
        super(name, cost, description);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
}
