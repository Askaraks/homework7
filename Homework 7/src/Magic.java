public class Magic extends Hero {
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String SuperAbilityType) {
        System.out.println("Magic применил суперспобность Critical Damage");

    }
}
