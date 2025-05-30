import java.util.Scanner;
public class SLLLMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkList20 sll = new SingleLinkList20();

        System.out.print("Berapa banyak data yang ingin dimasukkan? ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("=== Data Mahasiswa ===");
        sll.print();
    }
}
