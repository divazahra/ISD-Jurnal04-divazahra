import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        LinkedList<Data> linkedList = new LinkedList<Data>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Memilih Inputan : \n 1. Input Tugas\n 2. Delet Tugas\n 3. Lihat List Tugas\n 4. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();input.nextLine();

            if (pilihan == 1) {
                System.out.print("Mata Kuliah : ");
                String mataKuliah = input.nextLine();
                System.out.print("Nama Tugas : ");
                String namaTugas = input.nextLine();
                System.out.print("Deadline : ");
                String deadline = input.nextLine();

                linkedList.add(new Data(mataKuliah, namaTugas, deadline));
            } else if (pilihan == 2) {

                ListIterator<Data> iterator = linkedList.listIterator();
                System.out.print("Hapus Matkul : ");

                String masukan = input.nextLine();
                while (iterator.hasNext()) {
                    Data t = iterator.next();
                    if (t.getMataKuliah().equals(masukan)) {
                        iterator.remove();
                    }
                }

            } else if (pilihan == 3) {
                ListIterator <Data> iterator= linkedList.listIterator();
                System.out.println("1. Print depan\n 2. Print belakang");
                System.out.print("Pilihan : ");
                int pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                    case 2:
                    iterator = linkedList.listIterator(linkedList.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                }
                    
            } else if (pilihan == 4) {
                break;
            }
        }
        input.close();
    }
}