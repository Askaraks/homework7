abstract class Hero implements HavingSuperAbility {
    int health, damage;
    String SuperAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        SuperAbilityType = superAbilityType;
    }
}
