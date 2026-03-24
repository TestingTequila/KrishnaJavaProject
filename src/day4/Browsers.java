package day4;

public class Browsers
{
    public static void main(String[] args) {
        // Chrome  ---> Launch Chrome Browser
        // Firefox --->Launch Firefox Browser
        // Edge    --->Launch Edge Browser
        // Safari  --->Launch Safari Browser
        // Not a Valid browser Name

        String browser = "Ashish";
        if(browser.equals("Edge"))
        {
            System.out.println("Launch Edge browser...");
        }
        else if(browser.equals("Firefox"))
        {
            System.out.println("Launch Firefox browser...");
        }
        else if(browser.equals("Chrome"))
        {
            System.out.println("Launch Chrome browser...");
        }
        else if(browser.equals("Safari"))
        {
            System.out.println("Launch Safari browser...");
        }
        else
        {
            System.out.println("Please enter a valid browser name");
        }
    }
}
