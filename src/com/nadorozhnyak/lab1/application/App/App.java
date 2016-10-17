package com.nadorozhnyak.lab1.application.App;

import com.nadorozhnyak.lab1.model.Worker;
import com.nadorozhnyak.lab1.util.WorkerBuilder;

/**
 * Created by nazar on 15-Sep-16.
 */
public class App {
    public static void main(String[] args) {
        Worker[] workers = new WorkerBuilder().generateWorkers();

        for(Worker w : workers)
            System.out.println(w);
    }
}