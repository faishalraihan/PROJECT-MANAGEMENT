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
    private String clientNama;

    public Client(String clientNama) {
        this.clientNama = clientNama;
    }
    public String getClientNama() {
        return clientNama;
    }
    public void createProyek(Date deadline){
        proyek = new Proyek(deadline);
    }
    
    
    
}
