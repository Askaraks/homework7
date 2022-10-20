public class Main {
    public static void main(String[] args) {
        for (Hero heroes: createHeroes()){
            System.out.println(heroes);
        }
    }

    private static Hero[] createHeroes(){
        Warrior warrior = new Warrior(1222, 232, "Big boy");
        Medic medic = new Medic(1222, 232, "HealTower");
        Magic magic = new Magic(1222, 232, "Switch");
        warrior.applySuperAbility("Warrior применил суперспобность Critical Damage");
        medic.applySuperAbility("Medic применил суперспобность Critical Damage");
        magic.applySuperAbility("Magic применил суперспобность Critical Damage");
        Hero[] heroes = {magic, medic, warrior};
        return heroes;
    }
}