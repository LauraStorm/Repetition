package exercise2;
import java.util.ArrayList;

public class MainTeam {

    public static void main(String[] args) {
        //Creating objects
        Player player1 = new GoalKeeper(1,"Jensen");
        Player player2 = new GoalKeeper(2,"Hansen");
        Player player3 = new Defender(3, "Christensen");
        Player player4 = new Defender(4,"Madsen");

        //add objects to arrayList
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);


        //show each player from arrayList
        for (Player player : players) {
            System.out.println(player);
        }

        //Using a method from parent class - but is overrided
        player1.printPlayerPosition();
        player4.printPlayerPosition();

    }

}
