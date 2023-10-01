package Part_2;


import java.util.Scanner;

public class Collection_of_hobby_objects {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        garage garage = new garage();
        while (true){
            System.out.println("What do you want to do?");
            System.out.println("1 - Add a car \n 2 - Print one car details \n 3 - Print full info \n 4 - Find car by Model \n " +
                    "5 - Find car by a year \n 6 - Find car by a Mark \n 7 - Sort by Year");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    car NewObj = new car();
                    scan.nextLine();
                    System.out.println("Enter mark: ");
                    NewObj.mark = scan.nextLine();
                    System.out.println("Enter model: ");
                    NewObj.model = scan.nextLine();
                    System.out.println("Enter year: ");
                    NewObj.year = scan.nextInt();
                    System.out.println("Enter price: ");
                    NewObj.price = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter VIN: ");
                    NewObj.setVIN(scan.nextLine());
                    garage.add(NewObj);
                    break;
                case 2:
                    System.out.println("Enter number of car: ");
                    int num = scan.nextInt();
                    while (true){
                        if(num > garage.getCount() - 1){
                            System.out.println("Out of bounds, try again");
                            num = scan.nextInt();
                        }
                        else {
                            break;
                        }
                    }
                    garage.printOne(num);
                    break;
                case 3:
                    garage.print();
                    break;
                case 4:
                    garage.findModel();
                    break;
                case 5:
                    garage.findYear();
                    break;
                case 6:
                    garage.findMark();
                    break;
                case 7:
                    garage.sort();
                    break;
                default:
                    System.out.println("Wrong num");
                    break;
            }
        }
    }
}
