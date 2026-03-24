package day4;

public class Temperature
{
    public static void main(String[] args) {
        //temp >40 ---> Extreme Heat
        //temp >30 ---> Hot
        //temp >20 ---> Pleasant
        // cold

        int temp =16;
        if(temp>40)
        {
            System.out.println("Extreme Hot");
        }
        else if (temp>30)
        {
            System.out.println("Hot");
        }
        else if (temp>20)
        {
            System.out.println("Pleasant");
        }
        else
        {
            System.out.println("Cold");
        }
    }
}
