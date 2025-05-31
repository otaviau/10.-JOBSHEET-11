public class QueueLinkedList {
    NodeQueue front, rear;
    int size;

    public QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; // Karena linked list, tidak terbatas (selama memori cukup)
    }

    public void enqueue(Mahasiswa data) {
        NodeQueue baru = new NodeQueue(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang dipanggil.");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi antrian:");
            NodeQueue temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
