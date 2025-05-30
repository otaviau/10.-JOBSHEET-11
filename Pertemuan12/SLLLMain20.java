import java.util.Scanner;
public class SLLLMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkList20 sll = new SingleLinkList20();

        int pilihan;
        do {
            System.out.println("\n=== MENU LINKED LIST MAHASISWA ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan setelah nama tertentu");
            System.out.println("4. Sisipkan di indeks tertentu");
            System.out.println("5. Tampilkan semua data");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa20 mhsAwal = inputMahasiswa(sc);
                    sll.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa20 mhsAkhir = inputMahasiswa(sc);
                    sll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String namaKunci = sc.nextLine();
                    Mahasiswa20 mhsAfter = inputMahasiswa(sc);
                    sll.insertAfter(namaKunci, mhsAfter);
                    break;
                case 4:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa20 mhsIndex = inputMahasiswa(sc);
                    sll.insertAt(index, mhsIndex);
                    break;
                case 5:
                    sll.print();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }

    public static Mahasiswa20 inputMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        
        return new Mahasiswa20(nim, nama, kelas, ipk);
    }
}

