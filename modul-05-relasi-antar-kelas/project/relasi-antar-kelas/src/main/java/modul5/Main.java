package modul5;

import modul5.guided.agregasi.Jurusan;
import modul5.guided.agregasi.Mahasiswa;

public class Main {

    public static void main(String[] args) {
        Agregasi();
    }

    public static void Agregasi() {
        Mahasiswa mhs1 = new Mahasiswa("2311110017", "Arif");
        Mahasiswa mhs2 = new Mahasiswa("2311110016", "Dido");

        Jurusan prodi1 = new Jurusan("SD", "Sains Data");
        Jurusan prodi2 = new Jurusan("IF", "Informatika");

        prodi1.AddMahasiswa(mhs1);
        prodi2.AddMahasiswa(mhs2);

        prodi1.DisplayMahasiswa();
        prodi2.DisplayMahasiswa();
    }
}