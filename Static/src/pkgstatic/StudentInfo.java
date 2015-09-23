/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author Chayan_pc
 */
public class StudentInfo {
    String name;
    int id;
    Double cgpa;
    
    public StudentInfo(String name,int id,Double cgpa)
    {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    
    }
    void print()
    {
        System.out.println(this.name+"  "+this.id+"  "+this.cgpa);
    }
    
}
