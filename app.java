import java.util.Scanner;

class app {
 
    static Scanner scanner = new Scanner(System.in);
    public static void main ( String [] args ) {
         
        

        while(true) {
            System.out.println("Welcome.\n Please choose the emergency you are reporting down on the options below. ");
            System.out.println("1. Fire");
            System.out.println("2. Car Or Workplace Accident");
            System.out.println("3. Floods");
            System.out.println("4. Missing Persons");
            System.out.println("5. Death of a person");

            System.out.print("\n \n  If emergency type is not in options ( 1 to 5 ), type the emergency type below: ");

            String option_1_to_5_ans = scanner.nextLine();

            /** 
            while (option_1_to_5_ans.equals("1") || option_1_to_5_ans.equals("2") || option_1_to_5_ans.equals("3") || option_1_to_5_ans.equals("4") || option_1_to_5_ans.equals("5")) { */
                
                switch (option_1_to_5_ans) {
                    case "1":
                        System.out.println("You hava chosen Fire");
                        break;
                
                    case "2":
                        System.out.println("You hava chosen Car Or Workplace Accident");
                        break;
                
                    case "3":
                        System.out.println("You hava chosen Floods");
                        break;
                
                    case "4":
                        System.out.println("You hava chosen Missing Persons");
                        break;
                
                    case "5":
                        System.out.println("You hava chosen Death of a person");
                        break;
                
                    default:
                        System.out.println("You hava typed " + option_1_to_5_ans + ". We will call relevant emergency respondents");
                        break;
                }
               
            

                /**
            while (option_1_to_5_ans != "1" || option_1_to_5_ans != "2" || option_1_to_5_ans != "3" || option_1_to_5_ans != "4" || option_1_to_5_ans != "5") {
                System.out.println("If not in options, then type it down below: ");
            } */

           

            
        }
        
        
    }

    //Scanner.close();
}