/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15fcs5343.pkg002_homework05_kruskal_txz141530_tianzheng;

/**
 *
 * @author txz141530
 */
public class Vertex {
    public String getName(){
        return name;
    }
    /**
     * Is it a good practice that I make this setter method return type "void"?
     * Maybe I should use return type "int" instead to indicate the setting 
     * successful or not.
     * T.B.D
     * @param n the character the user would like to use as the name of the vertex
     */
    public void setName(String n){
        name = n;
    }
    private String name;
}
