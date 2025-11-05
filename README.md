# Latihan-UKL-Sedang-2

Bagian 1:

        static double hitungvol (double r, double t) {
            double phi = 3.14;
            double volume = phi*r*r*t;
            return volume;
        }

Pada bagian 1, program static double hitungvol(double r, double t) digunakan untuk menghitung volume tabung dengan rumus volume = phi*r*r*t. Fungsi ini memiliki dua parameter, yaitu r (jari-jari) dan t (tinggi). Di dalam fungsi, nilai phi disimpan sebagai phi = 3.14. Nilai tersebut kemudian dikembalikan (return) agar bisa digunakan di program utama.

Bagian 2:

            Scanner input = new Scanner (System.in);

            System.out.println("----- Program Menghitung Volume Tabung -----");
            System.out.println("Masukkan jari - jari tabung (cm): ");
            double r = input.nextDouble();
            System.out.println("Masukkan tinggi tabung (cm): ");
            double t = input.nextDouble();

Di bagian 2, program meminta user menginput nilai jari - jari dan tinggi tabung. kemudian nilai disimpan pada variabel r dan t.

Bagian 3:

            double hasil = hitungvol(r, t);
            
            System.out.println("Volume tabung = "+ hasil +" cm3");

Pada bagian 3 program memanggil fungsi untuk menghitung volume tabung berdasarkan r dan t yang telah di input oleh user, kemudian disimpan pada variabel hasil. Setelah itu program menampilkan output berupa hasil dari volume tabung yang telah dihitung oleh prograrm.

Screenshot hasil program:

<img width="1487" height="313" alt="Cuplikan layar 2025-11-05 075520" src="https://github.com/user-attachments/assets/ea296777-fa37-49a2-a160-f24adbea9ee8" />

