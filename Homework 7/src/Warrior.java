public class Warrior extends Hero{

    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String SuperAbilityType) {
        System.out.println("Warrior применил суперспобность Critical Damage");
    }
}
