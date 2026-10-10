public class Card {
private final String name;
private final int cost;
private final String description;

    public Card(String name, int cost, String description) {
    this.name = name;
    this.cost = cost;
    this.description = description;
}

public String getName() {
    return name;
}
public int getCost() {
    return cost;
}
public String getDescription() {
    return description;
}
}
