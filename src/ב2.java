    import java.util.Scanner;
    public class ב2
    {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("will you want to proceed?");
            boolean answer = s.nextBoolean();
            while (answer) {
                System.out.println("i love you");
                System.out.println("will you want to proceed?");
                answer = s.nextBoolean();
            }
        }
    }
