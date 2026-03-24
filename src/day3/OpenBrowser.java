package day3;

public class OpenBrowser
{
    public static void main(String[] args) {

        //Firefox

       String browserName = "Firefox";

        if(browserName.equals("Firefox"))
        {
            System.out.println("Open Firefox Browser...");
        }
        else
        {
            System.out.println("Can't Open the browser, Not a Valid browser Name...");
        }
    }
}
