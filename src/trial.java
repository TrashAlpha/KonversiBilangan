import java.util.Scanner;
public class trial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka biner: ");
                    String bilanganBiner = input.next();
                    int konverDecimal = 0;
                    int panjangBiner = bilanganBiner.length();

                    for (int i = 0; i < panjangBiner; i++) {
                        char digitBiner = bilanganBiner.charAt(i);

                        // Angka diluar 1 dan 0 akan dianggap salah input dan bukan merupakan bilangan biner
                        if (digitBiner == '1') {
                            int pangkat = panjangBiner - 1 - i;
                            konverDecimal += Math.pow(2, pangkat);
                        } else if (digitBiner != '0') {
                            System.out.println("Input bukan bilangan biner.");
                            input.close();
                            return;
                        }
                    } 
                    System.out.println("Hasil konversi ke desimal adalah: " + konverDecimal);

    }
    
}