import java.util.Scanner;

public class sadna20ex4 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter price of basik packedge");
                int priceOfBasik= input.nextInt();
                System.out.println("Enter your number and tip of packedge that you wont:basik-o, big-1 large-2");
                int userNum= input.nextInt();
                int tip= input.nextInt();
                int Tip0wonts=0, Tipe1wonts=0,Tip2wonts=0;

                while((Tip0wonts<500)&&(Tipe1wonts<500)&&(Tip2wonts<500))
                {
                    System.out.println("Enter your number and tip of packedge that you wont:basik-o, big-1 large-2");
                    userNum= input.nextInt();
                    tip= input.nextInt();
                    if (tip==0)
                        System.out.println("use "+userNum+" - " + tip);
                    System.out.println("User have to pay "+priceOfBasik);
                    Tip0wonts++;

                    if (tip==1)
                        System.out.println("use "+userNum+" - " + tip);
                    System.out.println("user have to pay: "+ (priceOfBasik+100));
                    Tipe1wonts++;

                    if(tip==2)
                        System.out.println("use "+userNum+" - " + tip);
                    System.out.println("user have to pay: "+ (priceOfBasik+200));
                    Tip2wonts++;
                }
                System.out.println("end");
            }
        }