package second;

public class TestPhone {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(112233);
        Phone secondPhone = new Phone(445566);
        Phone thirdPhone = new Phone(778899);

        firstPhone.recieveCall("Bob");
        System.out.println(firstPhone.getNumber());

        secondPhone.recieveCall("Din");
        System.out.println(secondPhone.getNumber());

        thirdPhone.recieveCall("Mom");
        System.out.println(thirdPhone.getNumber());

    }
}
