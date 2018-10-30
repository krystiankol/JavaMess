package lol.pin.package1;

public class Main {
    public static void main(String[] args) {
        String stringIn = "reverse me";
        char[] charArray;
        String stringOut;

        charArray = new char[stringIn.length()];
        for(int i = 0; i < stringIn.length();i++){
            charArray[i] = stringIn.charAt(stringIn.length()-1-i);
        }
        stringOut = new String(charArray);            
        System.out.format("Text in: %s",stringIn);
        System.out.format("Text out: %s",stringOut);
    }
}
