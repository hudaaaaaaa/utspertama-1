package pengguna;
// catatan komentar14.19
public class Mhs extends User {
    String nama;
    String nim;
    int smt;

    public Mhs(String username, String password, String nama, String nim, int smt) {
        super(username, password);
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setSmt(int smt) {
        this.smt = smt;
    }

    public int getSmt() {
        return this.smt;
    }

    
}
