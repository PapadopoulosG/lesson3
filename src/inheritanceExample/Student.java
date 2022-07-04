package inheritanceExample;

public class Student extends Person {
    private String studentId;

    public Student(String firstName,String lastName, String StudentId){
        super(firstName,lastName);
        this.studentId = StudentId;

    }
    public String getStudentId(){
        return studentId;

    }
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Student Id is: "+ studentId;
    }
}
