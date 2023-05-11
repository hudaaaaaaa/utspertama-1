import pengguna.*;
class Main {
    public static void main(String[] args) {
        Mhs mhs = new Mhs("ini_username", "ini_password", "Mochhamad Idris", "A123", 3);
System.out.println(mhs.getNama()); 
System.out.println(mhs.getNim()); 
System.out.println(mhs.getSmt());
 
}
}