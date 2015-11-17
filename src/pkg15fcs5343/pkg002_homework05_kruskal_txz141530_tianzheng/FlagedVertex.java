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
public class FlagedVertex {
    public FlagedVertex(char c, boolean ic){
        name = c;
        isConnected = ic;
    }
    private final char name;
    private boolean isConnected = false;    
}
