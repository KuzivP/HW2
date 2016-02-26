import java.io.*;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println("Start");
            MyScan m = new MyScan ("D:\\Q.txt");

            System.out.println("1: "+m.next());
            System.out.println("2: "+m.next());
            System.out.println("3: "+m.next());
            System.out.println("4: "+m.next());
            System.out.println("5: "+m.next());
            System.out.println("6: "+m.next());
            System.out.println("7: "+m.nextLine());
            System.out.println("8: "+m.nextLine());
            System.out.println("9: "+m.next());
            System.out.println("10: "+m.nextInt());
            System.out.println("11: "+m.next());
            System.out.println("12: "+m.next());
            System.out.println("13: "+m.next());
            System.out.println("14: "+m.next());
            System.out.println("15: "+m.next());
            System.out.println("16: "+m.next());
            System.out.println("17: "+m.next());
            System.out.println("18: "+m.next());
            System.out.println("19: "+m.next());
            System.out.println("20: "+m.next());
            System.out.println("21: "+m.nextLine());

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }



}
