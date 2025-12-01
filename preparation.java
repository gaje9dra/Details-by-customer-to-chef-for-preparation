import java.util.Scanner;
public class preparation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String latte= "latte";
        String withIce= "withIce";
        String withMatcha= "withMatcha";
        int itemsOrdered =1;
        int vanillaPumps=2;

        System.out.println("What you want : ");
        String ans=scanner.nextLine();
        System.out.println("How much : ");
        int items=scanner.nextInt();
        System.out.println("How much pumps of vanilla : ");
        int pumps= scanner.nextInt();
 // using .equals() to check exact same input that user gave.
        if(ans.equals(withIce)){
            System.out.println("espresso, milk, ice, syrup");
        } else if(ans.equals(withMatcha)){
            System.out.println("matcha, oat milk, ice, vanilla");
        } else if(ans.equals(latte)){
            System.out.println("espresso, steamed milk");
        } else {
            System.out.println("Select a drink...");
        }
        if(items>itemsOrdered){
            System.out.println("provide cup holder");
        }
        if(pumps>=vanillaPumps){
            System.out.println("charge $1 extra");
        }
    }

}
