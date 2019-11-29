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
public class ManagerProyek extends Orang {

    private String idManager;
    public ManagerProyek(String name, double income, String divisi,String idManager){
       super(name,income,divisi); 
       this.idManager = idManager;
       
    }
    public double getSalary(){
        return super.getSalary();
    }
    public String getNama(){
        return super.getName();
    }
    public String getDivisi(){
        return super.getDivisi();
    }
    public String getIdManager() {
        return idManager;
    }

    public void setIdManager(String idManager) {
        this.idManager = idManager;
    }
   public void calculateIncome(){
         if(super.getDivisi() == "Web development"){
            super.setSalary(getSalary() +(2000000 * 12));
        }else if(super.getDivisi() == "Software development"){
            super.setSalary(getSalary() +(3000000 * 12));
        }else if(super.getDivisi() == "Data Scientist"){
            super.setSalary(getSalary() +(4000000 * 12));
        }
    }
    
    
    
    
    
}
