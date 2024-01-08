package javaapplication12;

public class JavaApplication12 {

    public static void main(String[] args) {
        int a=51;
        switch (a%10) {
            case 0:
            System.out.println ("Even");
                    break;
            case 1:
                System.out.println ("Odd");
                break;
            default:
                System.out.println("Invalid");
        }
    }
    
}
