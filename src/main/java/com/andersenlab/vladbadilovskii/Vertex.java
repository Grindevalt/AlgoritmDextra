package com.andersenlab.vladbadilovskii;

/**
 * Created by Vlad Badilovskii on 22.02.2017.
 */
public class Vertex {
    final private String id;
    final private String name;


    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
