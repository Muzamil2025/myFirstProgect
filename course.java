/*Create a course class :

.instance variable :courseName,enrolledStudents.
.static variable:maxCapacity,the max number of stuidents for any course
.instance methods: enrollStudent(String studentName),
unenrollStudent(string studentName).
.static method: setMaxCapacity(int capacity),to set the max capacity for a course

*/
class course {

    static int maxCapacity=100;

    String courseName;
    int enrollments;

    String[] enrolledStudents;

    
    course(String courseName){

        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];


    }
    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity=maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;



    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }
    public static void main(String[] args) {
        
        course c1=new course("physics");

        c1.enrollStudent("muzamil");
    }



    
}