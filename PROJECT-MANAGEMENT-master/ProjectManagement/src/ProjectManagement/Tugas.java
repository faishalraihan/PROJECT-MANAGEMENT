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
    private String idTugas; 

    public String getIdTugas() {
        return idTugas;
    }
    
   
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
    public void setPelaksana(Programmer p){
         pelaksana = p;
    }
    public Tugas(String idTugas,String Taskname,String status) {
        this.idTugas = idTugas;
        this.Taskname = Taskname;
        this.status = status;
    }
    public void view(){
        System.out.println("Nama: "+pelaksana.getName());
        System.out.println("ID Tugas: "+getIdTugas()+"\n"+"NamaTugas: "+getTaskname()+"\n"+"Status: "+getStatus());
    }
     public void changeStatus(){
        setStatus("Done");
    }
    public Programmer searchidProgrammer(String id){
        if(pelaksana.getIdProgrammer() != id){
            return pelaksana;
        }else{
        return null;
        }
     }    
}
