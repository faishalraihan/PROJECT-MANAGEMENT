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
public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Faishal",10000," Web developer","1");
        Tugas t1 = new Tugas("121","OP","Not done");
        /*Programmer p2 = new Programmer("Adhit",20000," Web developer","2");
        ManagerProyek m1 = new ManagerProyek("Ucok",300000,"pokew","02");
        ManagerProyek m2 = new ManagerProyek("Amir",400000,"dokew","03");
        Tugas t1 = new Tugas("OP","Not done");
        Tugas t2 = new Tugas("OP","done");
        
        t1.setPelaksana(p1);
        System.out.println(p1.getTugas());
        System.out.println("Masukkan id programmer yang ingin dikatahui tugasnya : ");
        
        System.out.println(p1.getTugas().getTaskname());
        
        System.out.println(t1.pelaksana().getIdProgrammer());
        System.out.println(t1.pelaksana().getNama());
        System.out.println(t1.pelaksana().getDivisi());
        System.out.println(t1.pelaksana().getSalary());*/
        Application app = new Application();
        app.inputProgrammerToTugas(t1, p1);
        app.changeStatus("121", t1);
        app.viewTask(t1);
        
        
        //t1.viewTask();
        //t2.viewTask();
        
       
    }
}
