package org.example;

public class PaymentInformation
{
    private String cardNumber;
    private String expirationDate; // month/year
    private String cvv;

    public PaymentInformation(String cardNumber, String expirationDate, String cvv)
    {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    @Override
    public String toString()
    {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4); // Last 4 digits
    }
}