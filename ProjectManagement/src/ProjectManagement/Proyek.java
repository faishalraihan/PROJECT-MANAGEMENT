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
import java.util.ArrayList;
import java.util.Date;
public class Proyek {
    private ManajerProyek manajer;
    private ArrayList<Programmer> tim = new ArrayList<Programmer>();
    private ArrayList<Tugas> tugas = new ArrayList<Tugas>();
    private Date deadline; 

    public ManajerProyek getManajer() {
        return manajer;
    }

    public void setManajer(ManajerProyek manajer) {
        this.manajer = manajer;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Proyek(Date deadline) {
        this.deadline = deadline;
    }
    
    public void createTugas(String Taskname, int maxPelaksana, String status){
        tugas.add(new Tugas(Taskname,maxPelaksana,status));
    }
    public void addManajer(ManajerProyek m){
        manajer = m;
    }
    public void addProgrammer (Programmer p){
        tim.add(p);
    }
    
    
    
    
}
