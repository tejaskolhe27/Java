package ASSIGNMENT.DAY5;

interface printable{
    public void printDetails();
}

class CktPlayer implements printable{
    private String name;
    private int runs;
    public CktPlayer(){
        name="abc";
        runs=0;
    }
    public CktPlayer(String n,int r){
        name = n;
        runs = r;
    }
    public void printDetails(){
        System.out.println("Name of player: "+name);
        System.out.println("Runs of the player: "+runs);
    }
}

class FtPlayer implements printable{
    private String name;
    private int goals;
    public FtPlayer(){
        name="abc";
        goals=0;
    }
    public FtPlayer(String n,int r){
        name = n;
        goals = r;
    }
    public void printDetails(){
        System.out.println("Name of player: "+name);
        System.out.println("goals of the player: "+goals);
    }
}
public class ques1 {
    public static void main(String[] args) {
        printable c = new CktPlayer("Sachin", 100);
        c.printDetails();

        printable f = new FtPlayer("Ronaldo", 3);
        f.printDetails();
    }
}
