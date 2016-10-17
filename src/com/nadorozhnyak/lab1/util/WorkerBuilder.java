package com.nadorozhnyak.lab1.util;

import com.nadorozhnyak.lab1.model.Worker;

import java.util.Random;

public class WorkerBuilder {
    private String surname;
    private String names = "Names";
    private int yearOfEmployment = 0;
    private int yearOfBirth = 2000;
    private String work = "Nothing";

    public WorkerBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public WorkerBuilder names(String names) {
        this.names = names;
        return this;
    }

    public WorkerBuilder yearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
        return this;
    }

    public WorkerBuilder yearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public WorkerBuilder work(String work) {
        this.work = work;
        return this;
    }

    public Worker build() {
        return new Worker(surname, names, yearOfEmployment, yearOfBirth, work);
    }

    public static Worker[] generateWorkers() {
        Random r = new Random();

        String[] surnames = {"Nadorozhnyak", "Smaly", "Grubel", "Kiyko", "Kuzemko", "Valchishin", "Fenovka","Mashtalir"};
        String[] names = {"Nazar", "Igor", "Vitaliy", "Uriy", "Stepan", "Volodya", "Zenya", "Dima", "Vitya"};
        String[] works = {"programmer", "cleaner", "driver", "slayer", "web developer", "QA", "system administrator", "shit coder", "junior forever"};

        Worker[] workers = new Worker[100];

        for (int i = 0; i < workers.length; i++)
            workers[i] = new WorkerBuilder().
                    surname(surnames[r.nextInt(surnames.length)]).
                    names(names[r.nextInt(names.length)]).
                    work(works[r.nextInt(works.length)]).
                    yearOfBirth(1980 + r.nextInt(30)).
                    yearOfEmployment(2010 + r.nextInt(6)).
                    build();

        return workers;
    }
}