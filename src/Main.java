public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWeapon(WeaponType.BANKAI);
        boss.setDamage(555);
        boss.setHealth(445);

        System.out.println("Boss Weapon: " + boss.getWeapon() + "; " + "Boss damage:" + " " + boss.getDamage() + "; " + "Boss health: " + boss.health + ".");
    }
}


