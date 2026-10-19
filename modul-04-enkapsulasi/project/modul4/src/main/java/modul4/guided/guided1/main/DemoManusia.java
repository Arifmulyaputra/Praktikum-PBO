package modul4.guided.guided1.main;

import modul4.guided.guided1.manusia.Manusia;
public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMhs[] = new Manusia[3];

        //Constructor Pertama
        Manusia objMhs1 = new Manusia();

        //kedua
        Manusia objMhs2 = new Manusia("Arif");

        //ketiga
        Manusia objMhs3 = new Manusia("Dido", 21);

        arrMhs[0] = objMhs1;
        arrMhs[1] = objMhs2;
        arrMhs[2] = objMhs3;

        for(int i=0; i<3; i++){
            System.out.println("Nama : " + arrMhs[i].getNama());
            System.out.println("Umur : " + arrMhs[i].getUmur());
            System.out.println();
        }
    }
}