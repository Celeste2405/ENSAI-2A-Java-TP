package fr.ensai.library;

import java.util.Date;

public class Loan {

    private String student;
    private String item;
    private Date startDate;
    private Date returnDate;

    public Loan(String student, String item, Date startDate) {
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null;

    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        if (returnDate == null) {
            return "Item " + item + " borrowed by " + student + " (Not yet returned).";
        } else {
            return "Item " + item + " borrowed by " + student + ". Returned on: " + returnDate.toString();
        }
    }
}
