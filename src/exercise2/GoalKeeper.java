package exercise2;
/*
Child class
*/
public class GoalKeeper extends Player {

    public GoalKeeper(int numberOnTshirt, String lastnameOnTshirt) {
        super(numberOnTshirt, lastnameOnTshirt);
    }

    //Methods
    @Override
    public void printPlayerPosition(){
        System.out.println("Goal keeper");
    }

    @Override
    public String toString() {
        return "GoalKeeper → " + super.toString();
    }
}
