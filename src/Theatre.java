/*  Author: Anthonige Bhathiya Sahan Gunarathna
    UOW ID: w1954056
    IIT ID: 20221216

    Start: 2/16/2023    | End:
    Program: Manage and control the seats on "New Theatre" theatre company
 */


//Task (1)


import java.util.*;
public class Theatre {       //Create a new class named by "Theatre"

    public static int[] Row1 = new int[12];     //Assign Row1 length to 12
    public static int[] Row2 = new int[16];     //Assign Row1 length to 16
    public static int[] Row3 = new int[20];     //Assign Row1 length to 20
    public static int[] ticket = new int[0];

    //private static int scan;



    public static void main(String[] args){     //Create the Main method
        Scanner scan = new Scanner(System.in);  //Create a new object name "scan" to get user input


        System.out.println("\n\t\t*********************************");
        System.out.println("\t\t*   Welcome to the New Theatre  *");       //Display welcome massage, "Welcome to the New Theatre" on the program
        System.out.println("\t\t*********************************");

//Task (2)

        while (true){
            System.out.println("\n-------------------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");                                  // Creat the menu
            System.out.println("5) Save to file");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort tickets by price");
            System.out.println("0) Quit");
            System.out.println("-------------------------------------------------\n");

            System.out.print("Enter option: ");       //Display to user to "Enter option: "
            int option = scan.nextInt();                //Get user input to variable name "option"

            do {
                switch (option) {
                    case 1 -> buy_ticket(scan);
                    case 2 -> print_seating_area();
                    case 3 -> cancel_ticket(scan);
                    case 4 -> show_available();
                    case 5 -> save();
                    case 6 -> load();
                    case 7 -> show_tickets_info();
                    case 8 -> sort_tickets();
                    default -> System.out.println("Invalid Input, Please Enter Valid input");
                }

            }while(option == 0);
        }
    }

//Task (3)
  private static void buy_ticket(Scanner scan) {
   //---------------------Show_Sheet------------------------------------------------------------
      System.out.println("\n\uD83E\uDD37\uD83C\uDFFB\u200D = Unavailable");
      System.out.println("\uD83E\uDE91 = available");

      System.out.println("\n\t\t\t\t\t      *********");
      System.out.println("\t\t\t\t\t      * STAGE *");
      System.out.println("\t\t\t\t\t      *********\n");

//-----------------------------------------------------------------------------
      System.out.print("Row1\t         ");

      for(int x=0; x<Row1.length/2  ; x++){
          if(Row1[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }
      System.out.print(" ");

      for(int x=Row1.length/2; x<Row1.length ; x++){
          if(Row1[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }

//----------------------   2   -------------------------------------------------------

      System.out.print("\nRow2\t    ");

      for(int x=0; x<Row2.length/2  ; x++){
          if(Row2[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }
      System.out.print(" ");

      for(int x=Row2.length/2; x<Row2.length ; x++){
          if(Row2[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }

//------------------------  3   -----------------------------------------------------
      System.out.print("\nRow3\t");

      for(int x=0; x<Row3.length/2  ; x++){
          if(Row3[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }
      System.out.print(" ");

      for(int x=Row3.length/2; x<Row3.length ; x++){
          if(Row3[x] == 1){
              System.out.print("\uD83E\uDD37\uD83C\uDFFB\u200D");}
          else{System.out.print("\uD83E\uDE91");}
      }

  //-------------------------_start_buy_ticket_--------------------------------------------------------
    while (true){

            System.out.print("\nYou need to continue ? YES/NO : ");
            String input_continue = scan.next().toLowerCase();

            if(input_continue.equals("yes")) {
                System.out.println("\nEnter Row number and Seat number which you need\n");

                System.out.print("Row number : ");
                int row_number = scan.nextInt();

                System.out.print("\nSeat number : ");
                int seat_number = scan.nextInt();


                switch (row_number) {
                    case 1 -> {
                        if (seat_number >= 1 && seat_number <= 12) {
                            if (Row1[seat_number - 1] == 0) {
                                System.out.println("\nYou can book this seat ✍️(◔◡◔)\n");

                                while (true) {
                                    System.out.print("If you need book this seat ?  YES/NO : ");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row1[seat_number - 1] = 1;
                                        System.out.println("\n   Your seat is booked\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        Row1[seat_number - 1] = 0;
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }
                            } else {
                                System.out.println("\n    Seat was booked\n");
                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                            continue;
                        }
                    }
                    case 2 -> {
                        if (seat_number >= 1 && seat_number <= 16) {
                            if (Row2[seat_number - 1] == 0) {
                                System.out.println("\nYou can book this seat ✍️(◔◡◔)\n");

                                while (true) {
                                    System.out.print("If you need book this seat ?  YES/NO : ");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row2[seat_number - 1] = 1;
                                        System.out.println("\n   Your seat is booked\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        Row2[seat_number - 1] = 0;
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }
                            } else {
                                System.out.println("\n    Seat was booked\n");
                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                            continue;
                        }
                    }
                    case 3 -> {
                        if (seat_number >= 1 && seat_number <= 20) {
                            if (Row3[seat_number - 1] == 0) {
                                System.out.println("\nYou can book this seat ✍️(◔◡◔)\n");

                                while (true) {
                                    System.out.print("If you need book this seat ?  YES/NO : ");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row3[seat_number - 1] = 1;
                                        System.out.println("\n   Your seat is booked\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        Row3[seat_number - 1] = 0;
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }
                            } else {
                                System.out.println("\n    Seat was booked\n");
                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                            continue;
                        }
                    }
                    default -> System.out.println("Invalid Row");
                }
            }
            else if(input_continue.equals("no")){
                break;
            }
            else {System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");}
    }
  }

//Task (4)
    private static void print_seating_area(){

        System.out.println("\n\t     *********");
        System.out.println("\t     * STAGE *");
        System.out.println("\t     *********\n");

//-----------------------------------------------------------------------------
        System.out.print("\t    ");

        for(int x=0; x<Row1.length/2  ; x++){
            if(Row1[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }
        System.out.print(" ");

        for(int x=Row1.length/2; x<Row1.length ; x++){
            if(Row1[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }

//-----------------------------------------------------------------------------

        System.out.print("\n\t  ");

        for(int x=0; x<Row2.length/2  ; x++){
            if(Row2[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }
        System.out.print(" ");

        for(int x=Row2.length/2; x<Row2.length ; x++){
            if(Row2[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }

//-----------------------------------------------------------------------------
        System.out.print("\n\t");

        for(int x=0; x<Row3.length/2  ; x++){
            if(Row3[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }
        System.out.print(" ");

        for(int x=Row3.length/2; x<Row3.length ; x++){
            if(Row3[x] == 1){
                System.out.print("X");}
            else{System.out.print("O");}
        }
        System.out.println();
    }

//Task (5)
    private static void cancel_ticket(Scanner scan){
        while (true){

            System.out.print("\nYou need to continue ? YES/NO : ");
            String input_continue = scan.next().toLowerCase();

            if(input_continue.equals("yes")) {
                System.out.println("\nEnter Row number and Seat number which you need\n");

                System.out.print("Row number : ");
                int row_number = scan.nextInt();

                System.out.print("\nSeat number : ");
                int seat_number = scan.nextInt();

                switch (row_number) {
                    case 1 -> {
                        if (seat_number >= 1 && seat_number <= 12) {
                            if (Row1[seat_number - 1] == 0) {
                                System.out.println("\n    This seat not book yet");
                            } else {
                                System.out.println("\n   you can cancel this seat\n");
                                while (true) {
                                    System.out.print("Are you need cancel this seat ? YES/NO :");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row1[seat_number - 1] = 0;
                                        System.out.println("\n   Your seat is canceled\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }

                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                        }
                    }
                    case 2 -> {
                        if (seat_number >= 1 && seat_number <= 16) {
                            if (Row2[seat_number - 1] == 0) {
                                System.out.println("\n    This seat not book yet");
                            } else {
                                System.out.println("\n   you can cancel this seat\n");
                                while (true) {
                                    System.out.print("Are you need cancel this seat ? YES/NO :");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row2[seat_number - 1] = 0;
                                        System.out.println("\n   Your seat is canceled\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }

                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                        }
                    }
                    case 3 -> {
                        if (seat_number >= 1 && seat_number <= 20) {
                            if (Row3[seat_number - 1] == 0) {
                                System.out.println("\n    This seat not book yet");
                            } else {
                                System.out.println("\n   you can cancel this seat\n");
                                while (true) {
                                    System.out.print("Are you need cancel this seat ? YES/NO :");
                                    String get = scan.next().toLowerCase();

                                    if (get.equals("yes")) {
                                        Row3[seat_number - 1] = 0;
                                        System.out.println("\n   Your seat is canceled\n");
                                        break;
                                    } else if (get.equals("no")) {
                                        break;
                                    } else {
                                        System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");
                                    }
                                }

                            }
                        } else {
                            System.out.println("Invalid Seat Number");
                        }
                    }
                }
            }

            else if(input_continue.equals("no")){
                break;
            }
            else {System.out.println("Invalid enter, Please Enter \"YES\" or \"NO\" ");}
        }
    }

/*-------------------------------------------------------------------------------------------------------------*/
//Task (6)
    private static void show_available(){

        System.out.print("\nSeats available in row 1: ");
            for(int i=0;i < Row1.length;i++){
                if(Row1[i] == 0){
                    System.out.print((i+1)+", ");
                }
            }

        System.out.print("\nSeats available in row 2: ");
        for(int i=0;i < Row2.length;i++){
            if(Row2[i] == 0){
                System.out.print((i+1)+", ");
            }
        }

        System.out.print("\nSeats available in row 3: ");
        for(int i=0;i < Row3.length;i++){
            if(Row3[i] == 0){
                System.out.print((i+1)+", ");
            }
        }
    }


/*-------------------------------------------------------------------------------------------------------------*/
//Task (7)
    private static void save(){

    }


/*-------------------------------------------------------------------------------------------------------------*/
//Task (8)
    private static void load(){

    }


/*-------------------------------------------------------------------------------------------------------------*/
//Task (13)
    private static void show_tickets_info(){

    }

//Task (14)

    private static void sort_tickets(){

    }

    public static void setScan(int scan) {
        //Theatre.scan = scan;
    }
}



    //Task (9)
class Person{
    //get name ,surname and email
}

//Task (10)
class Ticket{
    public static void main(String[] args) {
        //constructor row,sear,price and Person
    }
    private static void print(){
        //prints all the information from a ticket: Person name, Person surname, Person email, row, seat, and price.
    }
}
