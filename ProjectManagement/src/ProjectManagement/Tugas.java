/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagement;

/**
 *
 * @author Faishal Raihan
 */
import java.util.*;
public class Tugas {
    private Programmer pelaksana;
    private String Taskname;
    private String status;
    
   
    public String getTaskname() {
        return Taskname;
    }

    public void setTaskname(String Taskname) {
        this.Taskname = Taskname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tugas(String Taskname,int maxPelaksana, String status) {
        this.Taskname = Taskname;
        
        this.status = status;
    }
    
    public void setPelaksana(Programmer p){
         pelaksana = p;
    }
    
}
