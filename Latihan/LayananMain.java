import java.util.Scanner;

public class LayananMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList antrian = new QueueLinkedList();

        int pilihan;
        do {
            System.out.println("\n=== MENU LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("9. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa mhs = inputMahasiswa(sc);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    antrian.printQueue();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang mengantri: " + antrian.getSize());
                    break;
                case 9:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 9);
    }

    public static Mahasiswa inputMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Keperluan: ");
        String keperluan = sc.nextLine();

        return new Mahasiswa(nim, nama, keperluan);
    }
}
