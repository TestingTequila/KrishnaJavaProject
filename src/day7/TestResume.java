package day7;

public class TestResume {
    public static void main(String[] args) {


        System.out.println("======================JASON==============================");

        ResumeTemplate jasonResume = new ResumeTemplate();
        jasonResume.firstName = "Jason";
        jasonResume.lastName = "Bill";
        jasonResume.totalExperience = 5;
        jasonResume.gender = 'M';
        jasonResume.hasITExperience = false;

        System.out.println("First Name: " + jasonResume.firstName);
        System.out.println("Last Name: " + jasonResume.lastName);
        System.out.println("Total Experience: " + jasonResume.totalExperience);
        System.out.println("Gender: " + jasonResume.gender);
        System.out.println("Has I.T Experience: " + jasonResume.hasITExperience);

        System.out.println("=====================KERRIE===============================");

        ResumeTemplate kerrieResume = new ResumeTemplate();
        kerrieResume.firstName = "Kerrie";
        kerrieResume.lastName = "Wright";
        kerrieResume.totalExperience = 10;
        kerrieResume.gender = 'F';
        kerrieResume.hasITExperience = true;

        System.out.println("First Name: " + kerrieResume.firstName);
        System.out.println("Last Name: " + kerrieResume.lastName);
        System.out.println("Total Experience: " + kerrieResume.totalExperience);
        System.out.println("Gender: " + kerrieResume.gender);
        System.out.println("Has I.T Experience: " + kerrieResume.hasITExperience);

        System.out.println("=======================RON=============================");
        ResumeTemplate ronResume = new ResumeTemplate();
        ronResume.firstName = "Ron";
        ronResume.lastName = "Fedrer";
        ronResume.totalExperience = 2;
        ronResume.gender = 'M';
        ronResume.hasITExperience = true;

        System.out.println("First Name: " + ronResume.firstName);
        System.out.println("Last Name: " + ronResume.lastName);
        System.out.println("Total Experience: " + ronResume.totalExperience);
        System.out.println("Gender: " + ronResume.gender);
        System.out.println("Has I.T Experience: " + ronResume.hasITExperience);

    }
}
