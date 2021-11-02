package exercise2;
/*
Child class
*/
public class Defender extends Player{
    public Defender(int numberOnTshirt, String lastnameOnTshirt) {
        super(numberOnTshirt, lastnameOnTshirt);
    }

    //Methods
    @Override
    public void printPlayerPosition(){
        System.out.println("Defender");
    }

    @Override
    public String toString() {
        return "Defender → " + super.toString();
    }
}
