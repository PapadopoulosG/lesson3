package inheritanceExample;

public class StudentEmployee extends Student{
    private double rateOfPayPerHour;
    private String employeeId;

    public StudentEmployee(String firstName, String lastName, String studentId, Double rateofPayPerHour, String employeeId){
        super(firstName,lastName,studentId);
        this.rateOfPayPerHour = rateofPayPerHour;
        this.employeeId = employeeId;

    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setRateOfPayPerHour(Double rateOfPayPerHour){
        this.rateOfPayPerHour = rateOfPayPerHour;

    }

    public String getEmployeeId(){
        return employeeId;
    }
    public Double getRateOfPayPerHour(){
        return rateOfPayPerHour;

    }

    @Override
    public String toString(){
        return super.toString()+" pay is "+rateOfPayPerHour+" and employee ID is: "+employeeId;

    }

}
