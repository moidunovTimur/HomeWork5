public class Main {
    public static void main(String[] args) {
    Boss skelet=new Boss();
    skelet.setBossHealth(500);
    skelet.setBossDamage(30);
    skelet.setBossDefence("faier");
        System.out.println(skelet.getBossHealth());
        System.out.println(skelet.getBossDamage());
        System.out.println(skelet.getBossDefence());
    }
}