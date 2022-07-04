package inheritanceExample;

public class Person
{  private String firstName;
    private String lastName;

    public Person(String firstName,String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return "Name:"+firstName+" "+lastName;
    }


}
