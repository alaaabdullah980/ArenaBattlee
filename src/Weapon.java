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
