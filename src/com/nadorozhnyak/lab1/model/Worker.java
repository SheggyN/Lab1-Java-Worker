package com.nadorozhnyak.lab1.model;

public class Worker {
    private String surname;
    private String names;
    private String work;
    private int yearOfEmployment;
    private int yearOfBirth;

    //Constructors
    public Worker(String surname, String names, int yearOfEmployment, int yearOfBirth, String work) {
        setSurname(surname);
        setNames(names);
        setYearOfEmployment(yearOfEmployment);
        setYearOfBirth(yearOfBirth);
        setWork(work);
    }

    public Worker(String surname, String names, int yearOfEmployment, int yearOfBirth) {
        this(surname, names, yearOfEmployment, yearOfBirth, "Nothing");
    }

    public Worker(String surname, String names, int yearOfEmployment) {
        this(surname, names, 0, yearOfEmployment, "Nothing");
    }

    public Worker(String surname, String names) {
        this(surname, names, 0, 2000, "Nothing");
    }

    public Worker(String surname) {
        this(surname, "Names", 0, 2000, "Nothing");
    }

    //Getter Setter
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    //toString
    @Override
    public String toString() {
        return String.format("%s %s, born in %d, work as %s since %d", names, surname, yearOfBirth, work, yearOfEmployment);
    }
}