package w18comp1008s1feb6;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author JWright
 */
public class Employee
{
    //define instance variables
    private String firstName, lastName, socialInsuranceNumber;
    private LocalDate dateOfBirth;

    /**
     * This is the constructor for the Employee
     */
    public Employee(String firstName, String lastName, String socialInsuranceNumber, LocalDate dateOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNumber(socialInsuranceNumber);
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if (lastName.isEmpty())
            throw new IllegalArgumentException("Last name cannot be empty unless first name is Madonna");
        else
            this.lastName = lastName;
    }

    public String getSocialInsuranceNumber()
    {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber)
    {
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * This method will validate that the Employee is 15-90
     * years old
     * @param dateOfBirth 
     */
    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        int age = Period.between
                        (dateOfBirth, LocalDate.now()).getYears();
        
        if (age >= 15 && age <= 90)
            this.dateOfBirth = dateOfBirth;
        else
            throw new IllegalArgumentException("Age must be 15-90");
    }
    
    /**
     * This method returns the employee's first and last name
     * as a single String
     */
    @Override
    public String toString()
    {
        return String.format("%s %s",firstName,lastName);
    }
    
   
    
}
