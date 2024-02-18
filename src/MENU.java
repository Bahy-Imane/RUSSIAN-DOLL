import java.util.Scanner;

class MENU {
    public void menu() {
        Scanner s = new Scanner(System.in);
        int tail1, tail2 , tail3;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~Tail's MENU~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~      Enter the tail of the first doll:          ~~~");
        tail1 = s.nextInt();
        System.out.println("~~~      Enter the tail of the second doll:         ~~~");
        tail2 = s.nextInt();
        System.out.println("~~~      Enter the tail of the Third doll:          ~~~");
        tail3 = s.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        RUSSIAN_DOLL russianDoll1 = new RUSSIAN_DOLL(tail1);
        RUSSIAN_DOLL russianDoll2 = new RUSSIAN_DOLL(tail2);
        RUSSIAN_DOLL russianDoll3 = new RUSSIAN_DOLL(tail3);

        int choice;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~                                                 ~~~");
            System.out.println("~~~          Press [1] to open doll                 ~~~");
            System.out.println("~~~                                                 ~~~");
            System.out.println("~~~          Press [2] to close doll                ~~~");
            System.out.println("~~~                                                 ~~~");
            System.out.println("~~~          Press [3] to place a doll in           ~~~");
            System.out.println("~~~                                                 ~~~");
            System.out.println("~~~          Press [4] to get out a doll of         ~~~");
            System.out.println("~~~                                                 ~~~");
            System.out.println("~~~          Press [0] to quit                      ~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Your choice:");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~Open Menu~~~~~~~~~~~~~~~");
                    System.out.println("~~~                                  ~~~");
                    System.out.println("~~~    Enter 1 to open first Doll    ~~~");
                    System.out.println("~~~                                  ~~~");
                    System.out.println("~~~    Enter 2 to open second Doll   ~~~");
                    System.out.println("~~~                                  ~~~");
                    System.out.println("~~~    Enter 3 to open third Doll    ~~~");
                    System.out.println("~~~                                  ~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int choice1 = s.nextInt();

                    switch (choice1) {
                        case 1 :
                                russianDoll1.Open();
                                break;
                        case 2 :
                                russianDoll2.Open();
                                break;
                        case 3 :
                                 russianDoll3.Open();
                                 break;
                        default:

                                System.out.println("Your choice is invalid.");

                    }
                    break;
                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~Close Menu~~~~~~~~~~~~~~");
                    System.out.println("~~~                                   ~~~");
                    System.out.println("~~~    Enter 1 to close first Doll    ~~~");
                    System.out.println("~~~                                   ~~~");
                    System.out.println("~~~    Enter 2 to close second Doll   ~~~");
                    System.out.println("~~~                                   ~~~");
                    System.out.println("~~~    Enter 3 to close third Doll    ~~~");
                    System.out.println("~~~                                   ~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int choice2 = s.nextInt();

                    switch (choice2) {
                        case 1 :
                            russianDoll1.Close();
                            break;
                        case 2 :
                            russianDoll2.Close();
                            break;
                        case 3 :
                            russianDoll3.Close();
                            break;
                        default:

                            System.out.println("Your choice is invalid.");

                    }
                    break;


                case 3:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~Place in Menu~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 1 to place the first Doll in the second   ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 2 to place the first Doll in the third    ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 3 to place the second Doll in the first   ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 4 to place the second Doll in the third   ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 5 to place the third Doll in the first    ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~    Enter 6 to place the third Doll in the second   ~~~");
                    System.out.println("~~~                                                    ~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int choice3 = s.nextInt();

                    switch (choice3){
                        case 1 :
                            russianDoll1.PlaceIn(russianDoll2);
                            break;

                        case 2 :
                            russianDoll1.PlaceIn(russianDoll3);
                            break;

                        case 3 :
                            russianDoll2.PlaceIn(russianDoll1);
                            break;
                        case 4 :
                            russianDoll2.PlaceIn(russianDoll3);
                            break;
                        case 5 :
                            russianDoll3.PlaceIn(russianDoll1);
                            break;
                        case 6 :
                            russianDoll3.PlaceIn(russianDoll2);
                            break;
                        default:
                            System.out.println("Your choice is invalid.");
                    }
                    break;

                case 4:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~Get out of Menu~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 1 to get out the first Doll of the second   ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 2 to get out the first Doll of the third    ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 3 to get out the second Doll of the first   ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 4 to get out the second Doll of the third   ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 5 to get out the third Doll of the first    ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~     Enter 6 to get out the third Doll of the second   ~~~");
                    System.out.println("~~~                                                       ~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    int choice4 = s.nextInt();
                    switch (choice4){
                        case 1 :
                            russianDoll1.GetOutOf(russianDoll2);
                            break;

                        case 2 :
                            russianDoll1.GetOutOf(russianDoll3);
                            break;

                        case 3 :
                            russianDoll2.GetOutOf(russianDoll1);
                            break;
                        case 4 :
                            russianDoll2.GetOutOf(russianDoll3);
                            break;
                        case 5 :
                            russianDoll3.GetOutOf(russianDoll1);
                            break;
                        case 6 :
                            russianDoll3.GetOutOf(russianDoll2);
                            break;
                        default:
                            System.out.println("Your choice is invalid.");

                    }
                    break;
                case 0:
                    System.out.println("   Have a good day.    ");
                    break;
                default:

                    System.out.println("Your choice is invalid.");
            }
        } while (choice != 0);
    }
}