import pengguna.*;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Ini_Username", "Ini_Password", "Irfanhuda Arkananta .S", "G.111.19.0032", 8);
        System.out.println("Nama Mhs : " + mhs.getNama());
        System.out.println("Nim Mhs : " + mhs.getNim());
        System.out.println("Smt Mhs : " + mhs.getSmt());
        System.out.println("Username : " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());

    }
}