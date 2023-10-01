package Part_1;

class Building{
    public int floors;
    public String name;
    public int founded_year;
}

public class Arguments {
    public static void main(String[] args){
        Building Burj_Khalifa = new Building();
        change(Burj_Khalifa);
        //Check the object property outside the method and ensure that change influence original variable.
        System.out.println(Burj_Khalifa.name);
        System.out.println(Burj_Khalifa.floors);
        System.out.println(Burj_Khalifa.founded_year);
    }
    //Pass the object into a method as an argument.
    public static void change(Building build){
        //Change object property inside the method.
        build.floors = 156;
        build.name = "Burj Khalifa";
        build.founded_year = 2005;
    }
}
