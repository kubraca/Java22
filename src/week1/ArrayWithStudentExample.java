package week1;

public class ArrayWithStudentExample {
    public static void main(String[] args){
        String[] students=new String[4];
        students[0]="Kübra";
        students[1]="Yasemin";
        students[2]="Elif";
        students[3]="Aysenur";
        for (int i=0; i< students.length;i++){
            System.out.println(students[i]);
        }
        for(String listOfStudent:students){
            System.out.println(listOfStudent);
        }
    }
}
