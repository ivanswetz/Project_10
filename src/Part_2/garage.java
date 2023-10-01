package Part_2;

import java.util.Scanner;

public class garage {
    static Scanner scan = new Scanner(System.in);
    private int count = 1;
    private car[] garage_collection = new car[count];
    //METHODS
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void add(car newObj){
        garage_collection[getCount() - 1] = newObj;
        setCount(count++);
    }
    public void printOne(int i){
        System.out.println(garage_collection[i].mark);
        System.out.println(garage_collection[i].model);
        System.out.println(garage_collection[i].year);
        System.out.println(garage_collection[i].price);
        System.out.println(garage_collection[i].getVIN());
    }
    public void print(){
        for (int i = 0; i< garage_collection.length; i++){
            System.out.println("#" + i);
            printOne(i);
            System.out.println("----------------------");
        }
    }
    public void findModel(){
        String s;
        System.out.println("Enter model: ");
        s = scan.nextLine();
        System.out.println("Here's what we found: ");
        for (int i = 0; i < garage_collection.length; i++){
            if(garage_collection[i].model.contains(s)){
                printOne(i);
            }
        }
    }
    public void findYear(){
        int s;
        System.out.println("Enter year: ");
        s = scan.nextInt();
        System.out.println("Here's what we found: ");
        for (int i = 0; i < garage_collection.length; i++){
            if(s == garage_collection[i].year){
                printOne(i);
            }
        }
    }
    public void findMark(){
        String s;
        System.out.println("Enter Mark: ");
        s = scan.nextLine();
        System.out.println("Here's what we found: ");
        for (int i = 0; i < garage_collection.length; i++){
            if(garage_collection[i].mark.contains(s)){
                printOne(i);
            }
        }
    }
    public void sort(){
        int temp;
        for (int i = 0; i < garage_collection.length; i++){
            for (int j = 0; j < garage_collection.length - 1; j++){
                if(garage_collection[i].year > garage_collection[i+1].year){
                    temp = garage_collection[i+1].year;
                    garage_collection[i+1].year = garage_collection[i].year;
                    garage_collection[i].year = temp;
                }
            }
        }
    }

}
