//USING OF CLASS AND OBJECT
//PRINTING NAME AND AGE OF SCHOOL STUDENTS.
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

    public class SCHOOL{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.age = 16 ;

        s1.printInfo();

        System.out.println();

        Student s2 = new Student();
        s1.name = "yogesh";
        s1.age = 18;

        s1.printInfo();

    }

}

