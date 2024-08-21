public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SWORD);
        bossWeapon.setName("Excalibur");
        boss.setWeapon(bossWeapon);

        boss.printInfo();


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(20);

        Weapon skeleton1Weapon = new Weapon();
        skeleton1Weapon.setType(WeaponType.BOW);
        skeleton1Weapon.setName("Bone Bow");
        skeleton1.setWeapon(skeleton1Weapon);
        skeleton1.setArrowCount(10);

        skeleton1.printInfo();


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(25);

        Weapon skeleton2Weapon = new Weapon();
        skeleton2Weapon.setType(WeaponType.BOW);
        skeleton2Weapon.setName("Dark Bow");
        skeleton2.setWeapon(skeleton2Weapon);
        skeleton2.setArrowCount(15);

        skeleton2.printInfo();
    }
}