import java.util.Random;
import java.util.ArrayList;

class Pensil {
    String warna;

    public Pensil(String warna) {
        this.warna = warna;
    }
}

public class UASNO3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Pensil> blue = new ArrayList<Pensil>();
        ArrayList<Pensil> red = new ArrayList<Pensil>();
        ArrayList<Pensil> green = new ArrayList<Pensil>();
        ArrayList<Pensil> orange = new ArrayList<Pensil>();
        ArrayList<Pensil> black = new ArrayList<Pensil>();
        ArrayList<Pensil> purple = new ArrayList<Pensil>();

        int[] totalProduksi = {0, 0, 0, 0, 0, 0};
        int[] maxProduksi = {0, 0, 0, 0, 0, 0};
        int[] minProduksi = {100000, 100000, 100000, 100000, 100000, 100000};

        for (int i = 0; i < 20000; i++) {
            int warna = random.nextInt(6);
            switch (warna) {
                case 0:
                    blue.add(new Pensil("biru"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
                case 1:
                    red.add(new Pensil("merah"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
                case 2:
                    green.add(new Pensil("hijau"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
                case 3:
                    orange.add(new Pensil("oranye"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
                case 4:
                    black.add(new Pensil("hitam"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
                case 5:
                    purple.add(new Pensil("ungu"));
                    totalProduksi[warna]++;
                    if (totalProduksi[warna] > maxProduksi[warna]) {
                        maxProduksi[warna] = totalProduksi[warna];
                    }
                    if (totalProduksi[warna] < minProduksi[warna]) {
                        minProduksi[warna] = totalProduksi[warna];
                    }
                    break;
            }
        }

        System.out.println("Total produksi pensil warna: ");
        System.out.println("Biru: " + totalProduksi[0]);
        System.out.println("Merah: " + totalProduksi[1]);
        System.out.println("Hijau: " + totalProduksi[2]);
        System.out.println("Oranye: " + totalProduksi[3]);
        System.out.println("Hitam: " + totalProduksi[4]);
        System.out.println("Ungu: " + totalProduksi[5]);

        System.out.println("\nProduksi maksimum dan minimum: ");
        System.out.println("Biru: max " + maxProduksi[0] + " min " + minProduksi[0]);
        System.out.println("Merah: max " + maxProduksi[1] + " min " + minProduksi[1]);
        System.out.println("Hijau: max " + maxProduksi[2] + " min " + minProduksi[2]);
        System.out.println("Oranye: max " + maxProduksi[3] + " min " + minProduksi[3]);
        System.out.println("Hitam: max " + maxProduksi[4] + " min " + minProduksi[4]);
        System.out.println("Ungu: max " + maxProduksi[5] + " min " + minProduksi[5]);
    }
}