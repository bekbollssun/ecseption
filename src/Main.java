import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      try  {
          System.out.println("name");
          String name = sc.next();
          System.out.println("age");
          int age= sc.nextInt();

      }catch (Exception nses) {
          System.out.println("wrog");
      }
            }
        }
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("what's your full name?: ");
//        String ins = in.nextLine() ;

        // Bekbolsun Nasipbekov
        //you're name is: Bekbolsun
        //you're surname is: Nasibekov
//        System.out.print("what's you're full name: ");
//        String fullName = sc.nextLine();
//        int idx = fullName.lastIndexOf(' ');
//        if (idx == -1)
//            throw new IllegalArgumentException("Only a single name: " + fullName);
//        String firstName = fullName.substring(0, idx);
//        String lastName  = fullName.substring(idx + 1);
//        System.out.println("you're name is: "+firstName);
//        System.out.println("you're surname is: "+lastName);
//    }
//}