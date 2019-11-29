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
public class Client {
    private ArrayList<Proyek> daftarProyek = new ArrayList<Proyek>();
    private Proyek proyek;
    private String clientName;
    private int clientAge;
    private String clientId;

    public Client(String clientName,int clientAge,String clientId) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.clientId=clientId;
    }
    
    public String getClientNama() {
        return clientName;
    }
    public void createProyek(String deadline, String clientId, String namaProyek  ){
        proyek = new Proyek(deadline, clientId,namaProyek);
        daftarProyek.add(proyek);
    }
    public String getClientId(){
        return clientId;
    }
    
    public int getClientAge(){
        return clientAge;
    }

    public void setDaftarProyek(ArrayList<Proyek> daftarProyek) {
        this.daftarProyek = daftarProyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    public int getDaftarProyekSize(){
        return daftarProyek.size();
    }
    
    public Proyek getProyek(int x){
        return daftarProyek.get(x);
    }
    
    
}
