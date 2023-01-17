package OOP;

public class OOP02 {
    private String nameF; private String nameL; private String course; private String age;

    void dataStudent(String nameF, String nameL, String age, String course){
        this.nameF=nameF; this.nameL=nameL; this.age=age; this.course=course;

        System.out.println("First Name: "+nameF);
        System.out.println("Last Name: "+nameL);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
    
    void introduce(){
        System.out.printf("Hello %s %s! You are %s years old, from The %s course! %n"
        ,nameF,nameL,age,course);
    }

    void grades(int grade1, int grade2, int grade3, int grade4){
        System.out.println("Prelim Grade:       "+grade1);
        System.out.println("Midterm Grade:      "+grade2);
        System.out.println("Semi Finals Grade:  "+grade3);
        System.out.println("Finals Grade:       "+grade4);

        int result = (grade1+grade2+grade3+grade4)/4;
        System.out.print("\nOverall Grades: "+result + " | ");

        System.out.print(
            result < 0 ? "Negative" : 
            result == 0 ? "Zero" :
            result < 75 ? "Fail" :
            result > 75 ? "Passed" : "Invalid"
        );
    }

}