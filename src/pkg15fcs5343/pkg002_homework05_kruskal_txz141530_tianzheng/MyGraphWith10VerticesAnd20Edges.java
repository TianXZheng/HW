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
public class MyGraphWith10VerticesAnd20Edges {
    public MyGraphWith10VerticesAnd20Edges(){
        vertices = new FlagedVertex[NUMBEROFVERTICES];
        edges = new WeightedUndirectedEdge[NUMBEROFEDGES];
    }
    final int NUMBEROFEDGES = 20;
    final int NUMBEROFVERTICES = 10;
    private final FlagedVertex[] vertices = {new FlagedVertex('A'),};
    private final WeightedUndirectedEdge[] edges;
}