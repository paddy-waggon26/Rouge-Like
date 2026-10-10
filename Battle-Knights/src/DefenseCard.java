class DefenseCard extends Card {
    private final int defense;

    DefenseCard(String name, int cost, String description, int defense) {
        super(name, cost, description);
        this.defense = defense;
    }

    public int getDefence(){
        return defense;
    }
}
