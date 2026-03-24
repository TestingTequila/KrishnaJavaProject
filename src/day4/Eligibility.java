package day4;

public class Eligibility
{
    public static void main(String[] args) {
        //age <13 ---> Child
        //age <18 ---> Teenager
        //age <60 ---> Adult
        // Senior Citizen

        int age = 20;

        if(age<13)
        {
            System.out.println("Child");
        }
        else if (age<18)
        {
            System.out.println("Teenager");
        }
        else if (age<60)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Senior Citizen");
        }
    }
}
