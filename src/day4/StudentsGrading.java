package day4;

public class StudentsGrading {

    // Depending upon the marks scored by the student, we have to assign the grade
    //marks >=90 ---> Grade A
    //marks >=75 ---> Grade B
    //marks >=60 ---> Grade C
    //marks < 60 ---> Grade F

    public static void main(String[] args)
    {
        int marks =78;

        if(marks>=90)
        {
            System.out.println("Student has scored Grade A");
        }
        else if (marks>=75)
        {
            System.out.println("Student has scored Grade B");
        }
        else if (marks>=60)
        {
            System.out.println("Student has scored Grade C");
        }
        else if (marks>=50)
        {
            System.out.println("Student has scored Grade D");
        }
        else
        {
            System.out.println("Student has scored Grade F");
        }
    }



}
