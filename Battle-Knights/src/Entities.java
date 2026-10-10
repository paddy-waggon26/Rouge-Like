public abstract class Entities {
    private final String name;
    private int maxHealth;
    private int currentHealth;
    private int block;

    public Entities(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.block = 0;
    }
    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getBlock() {
        return block;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            return;
        }
        int absorbed = Math.min(block, damage);
        block -= absorbed;
        int remaining = damage - absorbed;
        currentHealth = Math.max(0, currentHealth - remaining);
    }

    public void heal(int heal) {
        if (heal < 0) {
            return;
        }
        currentHealth = Math.min(heal + currentHealth, maxHealth);
    }

    public void blocked(int block) {
        if (block > 0) {
            this.block = block;
        }

    }

    public boolean isDead(){
        return currentHealth <= 0;
    }

}