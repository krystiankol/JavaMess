package lol.pin.package1;
public class Main {
    public static void main(String[] args) {
        try {
            System.out.format("One for %s and one for me", args[0]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("One for you and one for me");
        }
    }
}