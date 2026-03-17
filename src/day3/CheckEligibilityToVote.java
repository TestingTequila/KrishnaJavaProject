package day3;

public class CheckEligibilityToVote {
    public static void main(String[] args) {
        //WAP to print if a person is eligible to vote or not

        int age1 = 16;
        int age2 = 44;

        if (age2 >= 18) {
            System.out.println("Person can Vote...");
        } else {
            System.out.println("Person cannot Vote....");
        }


        // WAP to print the total marks scored is more than 70 or not

        int historyMarks = 22;
        int mathsMarks = 27;
        int scienceMarks = 20;

        int totalMarks =historyMarks+mathsMarks+scienceMarks;
        System.out.println("total Marks: " + totalMarks);

        if(totalMarks>=70)
        {
            System.out.println("Student has cleared the exam...Congratulations..");
        }
        else
        {
            System.out.println("Student has not cleared the exam...Better Luck Next Time...");
        }

    }
}
