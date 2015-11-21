package pkg15fcs5343.pkg002_homework05_kruskal_txz141530_tianzheng;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author txz141530
 */
public class MyGraph {
    public MyGraph(int numberOfVertices, int numberOfEdges){
        vertices = new Vertex[numberOfVertices];
        edges = new WeightedUndirectedEdge[numberOfEdges];
    }
    public int getNumberOfVertices(){
        return vertices.length;
    }
    public int getNumberOfEdges(){
        return edges.length;
    }
    public void setVertices(){
        Scanner inVerticesNames = new Scanner(System.in);
        System.out.println("Please input 10 names for the 10 vertices\n");
        for(Vertex item : vertices){
            item.setName(inVerticesNames.next());
        }
    }
    public void setEdges(){
        Scanner inEdgesNames = new Scanner(System.in);
        System.out.println("Please input 20 edges by their two endpoints' indices and weight, intotal 3 integers\n");
        for(WeightedUndirectedEdge item : edges){
            item.setup(vertices[inEdgesNames.nextInt()], vertices[inEdgesNames.nextInt()], inEdgesNames.nextInt());
        }
    }
    
    private final Vertex[] vertices;
    private final WeightedUndirectedEdge[] edges;
}