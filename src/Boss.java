public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Information:");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon Type: " + weapon.getType());
        System.out.println("Weapon Name: " + weapon.getName());
    }
}
