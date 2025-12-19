public abstract class Weapon {

    private String name;
    private int damage;
    private double projectileSpeed;
    private double cooldownMs;
    private long lastShotTime = 0;

    public Weapon(String name, int damage, double projectileSpeed, double cooldownMs) {
        this.name = name;
        this.damage = damage;
        this.projectileSpeed = projectileSpeed;
        this.cooldownMs = cooldownMs;
    }

    public boolean canShoot(long nowMs) {
        return nowMs - lastShotTime >= cooldownMs;
    }

    public void recordShot(long nowMs) {
        lastShotTime = nowMs;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public double getProjectileSpeed() {
        return projectileSpeed;
    }

    public abstract double getProjectileWidth();
    public abstract double getProjectileHeight();
}
public class Pistol extends Weapon {

    public Pistol() {
        super("Pistol", 15, 8.5, 500);
    }

    @Override
    public double getProjectileWidth() {
        return 4;
    }

    @Override
    public double getProjectileHeight() {
        return 3;
    }
}
public class Cannon extends Weapon {

    public Cannon() {
        super("Cannon", 23, 8.0, 1000);
    }

    @Override
    public double getProjectileWidth() {
        return 7;
    }

    @Override
    public double getProjectileHeight() {
        return 5;
    }
}
public class Sniper extends Weapon {

    public Sniper() {
        super("Sniper", 51, 10.0, 1500);
    }

    @Override
    public double getProjectileWidth() {
        return 10;
    }

    @Override
    public double getProjectileHeight() {
        return 8;
    }
