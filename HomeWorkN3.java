import java.util.Scanner;

public class HomeWorkN3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
        names and if they expecting boy or girl?
         Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY*/
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL
        Scanner scan=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String nam= new String("Mary");
        System.out.println("Dad's first name?");
        String name2=new String("Daniel");
        System.out.println(nam+" " +name2);
        System.out.println("What do you expecting boy or girl?");
        String expect=scan.next();
        if(expect.equals("boy")){
        System.out.println("Suggested baby name: Danry");}
else if(expect.equals("girl")){
            System.out.println("Maiel");
        }
    }
}
