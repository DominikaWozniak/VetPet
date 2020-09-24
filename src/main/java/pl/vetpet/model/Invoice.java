package pl.vetpet.model;

import java.util.Date;

public class Invoice {

    private Long id;
    private LegalPerson legalPerson;
    private Visit visit;
    private Date dateOfIssue;
    private Date paymentDeadline;
    private Accountant accountant;
    private String treatmentName;
    private Float totalGross;
    private boolean isCash;
    private boolean isMoneyTransfer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LegalPerson getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(LegalPerson legalPerson) {
        this.legalPerson = legalPerson;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public Float getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(Float totalGross) {
        this.totalGross = totalGross;
    }

    public Date getPaymentDeadline() {
        return paymentDeadline;
    }

    public void setPaymentDeadline(Date paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }

    public boolean isMoneyTransfer() {
        return isMoneyTransfer;
    }

    public void setMoneyTransfer(boolean moneyTransfer) {
        isMoneyTransfer = moneyTransfer;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }
}
