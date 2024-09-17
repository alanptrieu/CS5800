public class Course{
    private String courseName;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;

    public Course(String courseName, Instructor instructor1, Instructor instructor2, Textbook textbook1, Textbook textbook2){
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.instructor2 = instructor2;
        this.textbook1 = textbook1;
        this.textbook2 = textbook2;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public Instructor getInstructor1(){
        return instructor1;
    }
    public Instructor getInstructor2(){
        return instructor2;
    }
    public void setInstructor1(Instructor instructor1){
        this.instructor1 = instructor1;
    }
    public void setInstructor2(Instructor instructor2){
        this.instructor2 = instructor2;
    }
    public Textbook getTextbook1(){
        return textbook1;
    }
    public Textbook getTextbook2(){
        return textbook2;
    }
    public void setTextbook1(Textbook textbook1){
        this.textbook1 = textbook1;
    }
    public void setTextbook2(Textbook textbook2){
        this.textbook1 = textbook2;
    }
    public void print(){
        System.out.println("Course Name: " + courseName + "\nInstructor: " + instructor1.getFirstName() + " " + instructor1.getLastName()
                + ", " + instructor2.getFirstName() + " " + instructor2.getLastName() + " TextBook 1: " + textbook1.getTitle() + " " + textbook1.getAuthor()
                + " TextBook 2: " + textbook2.getTitle() + " " + textbook2.getAuthor());
    }
}
