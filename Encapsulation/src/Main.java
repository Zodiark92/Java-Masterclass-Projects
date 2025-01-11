public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Player's health remaining: " + player.healthRemaining());
//        player.health = 200; // bypass checks in the increaseHealth method, out of control of the Player class
//        player.loseHealth(11);
//        System.out.println("Player's health remaining: " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health: " + tim.healthRemaining());

    }
}
