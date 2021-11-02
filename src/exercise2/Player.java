package exercise2;

/*
Parent class
*/
public class Player {
    //Attributes
    private int numberOnTshirt;
    private String lastnameOnTshirt;

    //Constructor
    public Player(int numberOnTshirt, String lastnameOnTshirt) {
        this.numberOnTshirt = numberOnTshirt;
        this.lastnameOnTshirt = lastnameOnTshirt;
    }

    //Method
    public void printPlayerPosition(){
        System.out.println("...");
    }

    //toString-so you can print/see the objects
    @Override
    public String toString() {
        return "\nPlayer: "  +
                "number on T-shirt = " + numberOnTshirt +
                ", lastname on T-shirt = " + lastnameOnTshirt + "\n";
    }
}
