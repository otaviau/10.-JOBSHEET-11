public class SLLLMain20 {
    public static void main(String[] args) {
        SingleLinkList20 sll = new SingleLinkList20();

        Mahasiswa20 mhs1 = new Mahasiswa20("123", "Ana", "1D", 4.0);
        Mahasiswa20 mhs2 = new Mahasiswa20("124", "Ari", "3H", 4.0);
        Mahasiswa20 mhs3 = new Mahasiswa20("125", "Dirga", "1G", 4.0);
        Mahasiswa20 mhs4 = new Mahasiswa20("126", "Aris", "2A", 4.0);
    
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
