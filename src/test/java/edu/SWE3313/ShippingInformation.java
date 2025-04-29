package org.example;

public class ShippingInformation
{
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String phoneNumber;

    public ShippingInformation(String firstName, String lastName, String street, String city,
                        String state, String postalCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getters for ShippingInformation attributes
     */
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getStreet()
    {
        return street;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public String getPostalCode()
    {
        return postalCode;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Setters for ShippingInformation attributes
     */
    public void setFirstName(String firstName)
    {
        firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        lastName = lastName;
    }
    public void setStreet(String street)
    {
        street = street;
    }
    public void setCity(String city)
    {
        city = city;
    }
    public void setState(String state)
    {
        state = state;
    }
    public void setPostalCode(String postalCode)
    {
        postalCode = postalCode;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + "\n" + street + "\n" + city + ", " + state + " " + postalCode + "\n" + phoneNumber;
    }
}