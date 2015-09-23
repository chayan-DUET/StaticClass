/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author Chayan_pc
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static StudentInfo getinfo(String name,int id,Double cgpa)
    {
        name=name.concat("majumdar");
    
        return (new StudentInfo(name, id, cgpa));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        StudentInfo st=getinfo("Chayan", 40, 3.00);
        st.print();
    }
}
