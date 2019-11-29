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
    private ManagerProyek manajer;
    private ArrayList<Programmer> tim = new ArrayList<Programmer>();
    private ArrayList<Tugas> tugas = new ArrayList<Tugas>();
    private String deadline; 
    private String idProyek;
    private String namaProyek;

    public Proyek(String deadline, String idProyek,String namaProyek) {
        this.deadline = deadline;
        this.idProyek = idProyek;
        this.namaProyek= namaProyek;
    }
    
    public String getNamaProyek(){
        return namaProyek;
    }

    public void setManajer(ManagerProyek manajer) {
        this.manajer = manajer;
    }

    public void setTim(ArrayList<Programmer> tim) {
        this.tim = tim;
    }

    public void setTugas(ArrayList<Tugas> tugas) {
        this.tugas = tugas;
    }

    public void setIdProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }
    
    public String getIdProyek() {
        return idProyek;
    }

    public ManagerProyek getManajer() {
        return manajer;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void createTugas(String idTugas,String Taskname, String status){
        Tugas t1 = new Tugas(idTugas,Taskname, status);
        tugas.add(t1);
    }
    public void addManajer(ManagerProyek m){
        manajer = m;
    }
    public void addProgrammer (Programmer p){
        tim.add(p);
    }
    
    public int getTimProgrammerSize(){
        return tim.size();
    }
    
    public Programmer getProgrammer(int x){
        return tim.get(x);
    }
    public Tugas searchidTugas(String idTugas){
        int i = 0;
        while(i < tugas.size()){
            if(tugas.get(i).getIdTugas() != idTugas){
                i++;
            }else{
                return tugas.get(i);
            }
        }
        return null;
    }
     public Programmer searchidProgrammer(String idProgrammer){
        int i = 0;
        while(i < tim.size()){
            if(tim.get(i).getIdProgrammer() != idProgrammer){
                i++;
            }else{
                return tim.get(i);
            }
        }
        return null;
    }
     public void removeProgrammer(Programmer p){
         tim.remove(p);
     }
    
}
