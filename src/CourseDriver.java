public class CourseDriver{
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert Martin", "Prentice Hall");
        Instructor instructor2 = new Instructor("Joe", "Smith", "3-2636");
        Textbook textbook2 = new Textbook("Clean Code 2", "Robert Martin", "Prentice Hall");
        Course course = new Course("CS 5800 - Advanced Software Engineering", instructor1, instructor2, textbook1, textbook2);
        course.print();
    }
}
