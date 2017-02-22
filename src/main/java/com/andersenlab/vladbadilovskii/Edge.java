package com.andersenlab.vladbadilovskii;


public class Edge{
    private final int startVertex;
    private final int finishVertex;
    private final int weight;

    public Edge(int startVertex, int finishVertex, int weight){
        this.startVertex = startVertex;
        this.finishVertex = finishVertex;
        this.weight = weight;
    }

    public int getStartVertex() {
        return startVertex;
    }

    public int getFinishVertex() {
        return finishVertex;
    }

    public int getWeight() {
        return weight;
    }
}