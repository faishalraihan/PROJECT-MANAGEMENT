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

public class Application {
    ArrayList<ManagerProyek> daftarManajerProyek = new ArrayList<ManagerProyek>();
    ArrayList<Programmer> daftarProgrammerUtama = new ArrayList<Programmer>();
    ArrayList<Client> daftarClientUtama = new ArrayList<Client>();
    ArrayList<Proyek> daftarProyekUtama= new ArrayList<Proyek>();
    ArrayList<Tugas> daftarTugas=new ArrayList<Tugas>();
    
/////////SEARCH
    public Programmer searchProgrammer (String id){
        int i=0;
        while (i< daftarProgrammerUtama.size()){
            if (id != daftarProgrammerUtama.get(i).getIdProgrammer()){
                i++;
            }else{
                return daftarProgrammerUtama.get(i);
            }
        }
        return null;
    }
    
    
    public Client SearchClient (String id){
        int i=0;
        while (i< daftarClientUtama.size()){
            if (id != daftarClientUtama.get(i).getClientId()){
                i++;
            }else{
                return daftarClientUtama.get(i);
            }
        }
        return null;
    }
    
    public Proyek SearchProyek (String id ){
        int i=0;
        while (i< daftarProyekUtama.size()){
            if (id!= daftarProyekUtama.get(i).getIdProyek()){
                i++;
            }else{
                return daftarProyekUtama.get(i);
            }
        }
        return null;
    }
    public ManagerProyek SearchManajerProyek (String id ){
        int i=0;
        while (i< daftarManajerProyek.size()){
            if (id!= daftarManajerProyek.get(i).getIdManager()){
                i++;
            }else{
                return daftarManajerProyek.get(i);
            }
        }
        return null;
    }
     public Tugas searchidTugas(String idTugas){
        int i =0;
        while(i< daftarTugas.size()){
            if(daftarTugas.get(i).getIdTugas()!= idTugas){
                i++;
            }else{
                return daftarTugas.get(i);
            }
        }
        return null;
    }
    
//////CREATE
    public void createProgrammer(String name, double salary, String divisi,String idProgrammer){
        Programmer p = new Programmer(name, salary, divisi, idProgrammer);
        daftarProgrammerUtama.add(p);
    }
    public void createClient(String clientName,int clientAge,String clientId){
        Client c1 = new Client(clientName, clientAge, clientId);
        daftarClientUtama.add(c1);
    }
    public void createProyek(String deadline,String idProyek,String namaProyek){
        Proyek p = new Proyek(deadline, idProyek, namaProyek);
        daftarProyekUtama.add(p);
    }
    public void createManager(String name, double income, String divisi,String idManager){
        ManagerProyek m = new ManagerProyek(name, income, divisi, idManager);
        daftarManajerProyek.add(m);
    }
    
    //Method memberi penugasan kepada Programmer
    public void inputProgrammerToTugas(Tugas tugas, Programmer pelaksana){
        tugas.setPelaksana(pelaksana);
    }
    
    //Membuat Tugas dari suatu Proyek
    public void InputTugastoProyek(String taskname, String idTugas,String status,Proyek p){
        if(p.searchidTugas(idTugas) == null){
            p.createTugas( idTugas,taskname, status);
        }else{
            System.out.println("Tugas sudah ada");
        }
    }
    
    //Method menambahkan Programmer dari suatu Proyek
    public void InputProgrammertoProyek(Programmer p, Proyek pyk){
        Programmer p1 = pyk.searchidProgrammer(p.getIdProgrammer());
        if(p1 == null){
            pyk.addProgrammer(p);
        }else{
            System.out.println("Programmer sudah ada");
        }
        
    }
    
    //Method Melihat Penugasan terhadap dirinya(Programmer)
    public void viewTask(Tugas tugas){
       tugas.view();
    }
    
    //Method mengurangi Programmer dari suatu Proyek
    public void RemoveProgrammertoProyek(Programmer p, Proyek pyk){
        Programmer p1 = pyk.searchidProgrammer(p.getIdProgrammer());
        if(p1 == null){
            pyk.removeProgrammer(p);
        }else{
            System.out.println("Programmer sudah ada");
        }
        
    }
    
    //Method Mengubah status Tugas menjadi sudah dikerjakan
    public void changeStatus(String idTugas,Tugas t){
        t.setStatus("Done");
            
    }
    
    ////INPUT_INPUTAN
    public void inputClient(String clientName,int clientAge,String clientId){
        Client c1 = new Client(clientName, clientAge, clientId);
        daftarClientUtama.add(c1);
    }
    public void inputProyekToClient(Client client, String deadline, String idProyek,String namaProyek){
        client.createProyek(deadline, idProyek,namaProyek);
        Proyek p1 = new Proyek(deadline, idProyek,namaProyek);
        daftarProyekUtama.add(p1);
    }
    public void inputManagerToProyek(ManagerProyek manager, Proyek proyek){
        proyek.addManajer(manager);
    }
  
    
    public String readClient(String cliendId){
       Client c1 = SearchClient(cliendId);
       if (c1!=null){
           return "Nama Client : "+ c1.getClientNama()+"\n Umur Client : "+c1.getClientAge()+"\n Id Client : "+c1.getClientId();
       }
       return "Client Tidak Ditemukan";
    }
    
    public String readProyek(String idProyek ){
        Proyek p1 = SearchProyek(idProyek);
        if(p1 != null)
        {
            return "Id Proyek : "+p1.getIdProyek()+"\n Dateline : "+p1.getDeadline()+"\n Nama Proyek : "+p1.getNamaProyek();
        }
        return "Proyek tidak ditemukan";
    }
    
    public String readManajerProyek(String idManager){
        ManagerProyek m1= SearchManajerProyek(idManager);
        if (m1!=null){
            return "Nama Manager : "+m1.getNama()+"\n Id Manager : "+m1.getIdManager();
        }
        return "Manager Proyek tidak ditemukan";
    }
    
    public String readProgrammer(String idProgrammer){
        Programmer p1 = searchProgrammer(idProgrammer);
        if(p1!=null){
            return "Nama Programmer : "+p1.getNama()+"\n Id Programmer : "+p1.getIdProgrammer()+"\n Gaji : "+p1.getSalary();
        }
        return "Programmer tidak ditemukan";
    }
    public void updateClient(String clientName,int clientAge,String clientId){
        Client c1 = SearchClient(clientId);
        if(c1!=null){
            c1.setClientAge(clientAge);
            c1.setClientName(clientName);
        }else{
            System.out.println("Client ID tidak ditemukan");
        }
    }
    public void updateProyek(String idProyek,String deadline,String namaProyek){
        Proyek p1 = SearchProyek(idProyek);
        if (p1!=null){
            p1.setNamaProyek(namaProyek);
            p1.setDeadline(deadline);
        }else{
            System.out.println("Proyek ID tidak ditemukan");
        }
    }
    public void updateManajerProyek(String name, double income, String divisi,String idManager){
        ManagerProyek m1= SearchManajerProyek(idManager);
        if(m1!=null){
            m1.setName(name);
            m1.setDivisi(divisi);
            m1.setSalary(income);
        }else{
            System.out.println("Manajer ID tidak ditemukan");
        }
    }
    public void updateProgrammer(String name, double salary, String divisi,String idProgrammer){
        Programmer p1 = searchProgrammer(idProgrammer);
        if (p1!=null){
            p1.setName(name);
            p1.setDivisi(divisi);
            p1.setSalary(salary);
        }else{
            System.out.println("Programmer ID tidak ditemukan");
        }
    }
    
    public void deleteClient(String clientId){
        Client c1 = SearchClient(clientId);
        if (c1!=null){
            daftarClientUtama.remove(c1);
            c1=null;
        }
    }
    public void deleteProyek(String idProyek){
        Proyek p1= SearchProyek(idProyek);
        if(p1!=null){
            daftarProyekUtama.remove(p1);
            for (int i = 0; i < daftarClientUtama.size(); i++) {
                for (int j = 0; j < daftarClientUtama.get(i).getDaftarProyekSize(); j++) {
                    if(daftarClientUtama.get(i).getProyek(j).getIdProyek().equals(idProyek)){
                        Proyek p2 = daftarClientUtama.get(i).getProyek(j);
                        p2 = null;
                    }
                }
            }
        }else{
            System.out.println("Proyek ID tidak ditemukan");
        }
    }
    
    public void deleteManajerProyek(String idManager){
        ManagerProyek m1 = SearchManajerProyek(idManager);
        if(m1 != null){
            daftarManajerProyek.remove(m1);
            for (int i = 0; i < daftarProyekUtama.size(); i++) {
                if(daftarProyekUtama.get(i).getManajer() == m1){
                    ManagerProyek m2 = new ManagerProyek("Kosong",0,"Kosong","Kosong");
                    daftarProyekUtama.get(i).addManajer(m2);
                }
            }
            System.out.println("Manajer Proyek berhasil di delete");
        }else{
            System.out.println("ManajerProyek tidak ditemukan");
        }
    }
    public void deleteProgrammer(String idProgrammer){
        Programmer p1= searchProgrammer(idProgrammer);
        if (p1!=null){
            daftarProgrammerUtama.remove(p1);
            for (int i = 0; i < daftarProyekUtama.size(); i++) {
                for (int j = 0; j < daftarProyekUtama.get(i).getTimProgrammerSize(); j++) {
                    if(daftarProyekUtama.get(i).getProgrammer(j).getIdProgrammer().equals(idProgrammer)){
                        Programmer p2= daftarProyekUtama.get(i).getProgrammer(j);
                        p2=null;
                    }
                }
            }
            Programmer p3 = new Programmer("Kosong", 0, "Kosong", "Kosong");
            
        }
    }
    
}
    

