package com.Anna.UnknownPattern_12;

import java.time.LocalDate;

public final class Reciept implements Cloneable{

    private final String patientName;
    private final LocalDate receiptDuration;
    private final String doctorName;
    private final String medicine;

    public Reciept( String patientName, String doctorName, String medicine, LocalDate receiptDuration) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.medicine = medicine;
        this.receiptDuration =receiptDuration;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getMedicine() {
        return medicine;
    }

    public LocalDate getReceiptDuration() {
        return LocalDate.from(receiptDuration);
    }

    public Reciept clone(LocalDate newDate) {
        return new Reciept(getPatientName(), getDoctorName(), getMedicine(), LocalDate.from(newDate));
    }

    @Override
    public String toString() {
        return "patientName='" + patientName + '\'' +
                ", receiptDuration=" + receiptDuration +
                ", doctorName='" + doctorName + '\'' +
                ", medicine='" + medicine;
    }
}
