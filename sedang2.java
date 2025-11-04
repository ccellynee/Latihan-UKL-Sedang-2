import java.util.Scanner;

public class sedang2 {

        static double hitungvol (double r, double t) {
            double phi = 3.14;
            double volume = phi*r*r*t;
            return volume;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            
            System.out.println("Masukkan jari - jari tabung (cm): ");
            double r = input.nextDouble();
            System.out.println("Masukkan tinggi tabung (cm): ");
            double t = input.nextDouble();


            double hasil = hitungvol(r, t);
            
            System.out.println("Volume tabung = "+ hasil +" cm3");
        }

        
        
}
