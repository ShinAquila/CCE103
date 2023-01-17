package OOP;

public class OOPMain02 {
    public static void main(String[] args) {
        OOP02 student = new OOP02();

        student.dataStudent("Vincent Ace","Rivera","18","BSIT");
        System.out.println();

        student.introduce();
        System.out.println();

        student.grades(85, 86, 83, 84);
        System.out.println();
    }
}
