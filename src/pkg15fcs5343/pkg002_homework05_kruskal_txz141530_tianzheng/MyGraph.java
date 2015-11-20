package pkg15fcs5343.pkg002_homework05_kruskal_txz141530_tianzheng;

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
    final int NUMBEROFVERTICES;
    final int NUMBEROFEDGES;
    public MyGraph(){
        NUMBEROFVERTICES = 10;
        NUMBEROFEDGES = 20;
        vertices = new Vertex[NUMBEROFVERTICES];
        edges = new WeightedUndirectedEdge[NUMBEROFEDGES];
    }
    public int getNumberOfVertices(){
        return vertices.length;
    }
    public int getNumberOfEdges(){
        return edges.length;
    }
    public void setNameOfVertices(){
        
    }
    
    private final Vertex[] vertices;
    private final WeightedUndirectedEdge[] edges;
}