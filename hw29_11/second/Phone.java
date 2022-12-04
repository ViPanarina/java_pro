package second;

public class Phone {

    public int number;
    public String model;
    public int weight;

    public void recieveCall(String name){
        System.out.println("Звонит " + name);
    }

    public int getNumber(){
        return this.number;
    }

    public Phone(int num){
        this.number = num;
    }
}
