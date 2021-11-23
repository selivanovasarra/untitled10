import java.util.Scanner;

public class sadna20ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b;
        int counter=0;
        a = s.nextDouble();
        b=s.nextDouble();
        while (a>b)
        {
            counter=counter+1;
            a = s.nextDouble();
            b=s.nextDouble();
        }
        System.out.println(counter);
    }
}
