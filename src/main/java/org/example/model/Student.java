package org.example.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 04/11/2022
 */
public class Student {

    private String registrationNumber;
    private String firstName;
    private String lastName;
    private Integer academicYear;
    private Integer semester;

    private BigDecimal moneyIn;
    private Boolean hasDoneFinanceRegistration = false;
    private Boolean hasDoneAccommodationRegistration = false;
    private Boolean hasDoneUnitRegistration = false;

    public Student(String registrationNumber,
                   String firstName,
                   String lastName,
                   Integer academicYear,
                   Integer semester,
                   BigDecimal moneyIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicYear = academicYear;
        this.semester = semester;
        this.registrationNumber = registrationNumber;
        this.moneyIn = moneyIn;
    }

    public BigDecimal getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(BigDecimal moneyIn) {
        this.moneyIn = moneyIn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(Integer academicYear) {
        this.academicYear = academicYear;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Boolean getHasDoneFinanceRegistration() {
        return hasDoneFinanceRegistration;
    }

    public void setHasDoneFinanceRegistration(Boolean hasDoneFinanceRegistration) {
        this.hasDoneFinanceRegistration = hasDoneFinanceRegistration;
    }

    public Boolean getHasDoneAccommodationRegistration() {
        return hasDoneAccommodationRegistration;
    }

    public void setHasDoneAccommodationRegistration(Boolean hasDoneAccommodationRegistration) {
        this.hasDoneAccommodationRegistration = hasDoneAccommodationRegistration;
    }

    public Boolean getHasDoneUnitRegistration() {
        return hasDoneUnitRegistration;
    }

    public void setHasDoneUnitRegistration(Boolean hasDoneUnitRegistration) {
        this.hasDoneUnitRegistration = hasDoneUnitRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getRegistrationNumber(), student.getRegistrationNumber()) || (Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getAcademicYear(), student.getAcademicYear()) && Objects.equals(getSemester(), student.getSemester()) && Objects.equals(getHasDoneFinanceRegistration(), student.getHasDoneFinanceRegistration()) && Objects.equals(getHasDoneAccommodationRegistration(), student.getHasDoneAccommodationRegistration()) && Objects.equals(getHasDoneUnitRegistration(), student.getHasDoneUnitRegistration()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAcademicYear(), getSemester(), getHasDoneFinanceRegistration(), getHasDoneAccommodationRegistration(), getHasDoneUnitRegistration());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                ", academicYear=" + academicYear +
                ", semester=" + semester +
                ", hasDoneFinanceRegistration=" + hasDoneFinanceRegistration +
                ", hasDoneAccommodationRegistration=" + hasDoneAccommodationRegistration +
                ", hasDoneUnitRegistration=" + hasDoneUnitRegistration +
                ", moneyIn=" + moneyIn +
                '}';
    }
}
