class Player extends Entities {
    private int currentEnergy;
    private int maxEnergy;

    public Player(String name, int maxHealth, int maxEnergy) {
        super(name, maxHealth);
        this.maxEnergy = maxEnergy;
        this.currentEnergy = maxEnergy;
    }
    public int getCurrentEnergy() {
        return currentEnergy;
    }
    public int  getMaxEnergy(){
        return maxEnergy;
    }

    public void startTurn(){
        currentEnergy = maxEnergy;
    }

    public boolean canAfford(int cost){
        return currentEnergy >= cost;
    }

    public void useEnergy(int cost){
        if(cost > 0 && canAfford(cost)){
            currentEnergy -= cost;
        }
    }

    public boolean playCard(Card card, Enemy target){
        if(!canAfford(card.getCost())){
            return false;
        }
       useEnergy(card.getCost());
        card.play(this, target);
        return true;
    }
}