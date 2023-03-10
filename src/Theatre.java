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


    static Scanner scan = new Scanner(System.in);  //Create a new object name "scan" to get user input
    public static void main(String[] args){     //Create the Main method



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
                    case 1:
                        buy_ticket();
                        break;
                    case 2:
                        print_seating_area();
                        break;
                    case 3:
                        cancel_ticket();
                        break;
                    case 4:
                        show_available();
                        break;
                    case 5:
                        save();
                        break;
                    case 6:
                        load();
                        break;
                    case 7:
                        show_tickets_info();
                        break;
                    case 8:
                        sort_tickets();
                        break;
                    default:
                        System.out.println("Invalued Inpur, Please Enter Valiued input");
                }

            }while(option == 0);
        }
    }

//Task (3)
  private static void buy_ticket() {

      System.out.println("You need to countinue ? YES/NO : ");
      String input_countinue= scan.next();

        System.out.println("Enter Row number and Seat number which you need\n");
        System.out.print("Row number : ");

        int row_number = scan.nextInt();
        System.out.print("\nSeat number : ");
        int seat_number = scan.nextInt();


      switch (row_number) {
          case 1:
              if (seat_number >= 1 && seat_number <= 12) {
                  if (Row1[seat_number - 1] == 0) {
                      System.out.println("You can book this seat");
                      System.out.println("If you need book this sheet ? Enter 1/0");
                      int get = scan.nextInt();
                      try {
                          if (get == 1) {
                              Row1[seat_number - 1] = 1;

                              System.out.println("Your seat is booked");
                          } else if (get == 0) {
                              Row1[seat_number - 1] = 0;
                          }
                      } catch (Exception e) {
                          System.out.println("Invalid number ");
                      }
                  } else {
                      System.out.println("Seat was booked");
                  }
              } else {
                  System.out.println("Invalid Seat Number");
              }

          case 2 :
              if (seat_number >= 1 && seat_number <= 16) {
                  if (Row2[seat_number - 1] == 0) {
                      System.out.println("You can book this seat");
                      System.out.println("If you need book this sheet (YES/No)");
                      String get = scan.next().toLowerCase();
                      try {
                          if (get.equals("yes")) {
                              Row2[seat_number - 1] = 1;

                              System.out.println("Your seat is booked");
                          } else if (get.equals("no")) {
                              Row2[seat_number - 1] = 0;
                          }
                      } catch (Exception e) {
                          System.out.println("Invalid number ");
                      }
                  } else {
                      System.out.println("Seat was booked");
                  }
              } else {
                  System.out.println("Invalid Seat Number");
              }

          case 3 :
              if (seat_number >= 1 && seat_number <= 20) {
                  if (Row3[seat_number - 1] == 0) {
                      System.out.println("You can book this seat");
                      System.out.println("If you need book this sheet ? Enter 1/0");
                      int get = scan.nextInt();
                      try {
                          if (get == 1) {
                              Row3[seat_number - 1] = 1;

                              System.out.println("Your seat is booked");
                          } else if (get == 0) {
                              Row3[seat_number - 1] = 0;
                          }
                      } catch (Exception e) {
                          System.out.println("Invalid number ");
                      }
                  } else {
                      System.out.println("Seat was booked");
                  }
              } else {
                  System.out.println("Invalid Seat Number"); 
              }
              break;
          default :
              System.out.println("Invalid Row");
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
//-----------------------------------------------------------------------------

        /*System.out.println("\nIf you need go back, Please enter \"0\" and to quite enter \"1\"");
        System.out.print("--> ");
        int back = scan.nextInt();
        switch (back){
            case 0:
                //
            case 1:
               //;
            default:
                System.out.println("Invalid input, Pleas Enter \"0\" or \"1\" ");*/
        }





//Task (5)
    private static void cancel_ticket(){

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
