import java.util.Scanner;

public class tugasAOK {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean repeat = true;

        do {
            System.out.println("1. Konversi Biner ke Desimal");
            System.out.println("2. Konversi Desimal ke Biner");
            System.out.println("3. Konversi Biner ke Heksadesimal");
            System.out.println("4. Konversi Heksadesimal ke Biner");
            System.out.println("5. Konversi Desimal ke Heksadesimal");
            System.out.println("6. Konversi Heksadesimal ke Desimal");
            System.out.println("0. Keluar dari program");

            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            System.out.println();

            switch(pilihan){
                case 1 :
                    System.out.print("Masukkan angka biner: ");
                    String bilanganBiner = input.next();

                    try {
                        int desimal = Integer.parseInt(bilanganBiner, 2);
                        System.out.println("Hasil konversi ke bilangan desimal adalah: " + desimal);
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Tolong masukkan bilangan biner yang benar.");
                        System.out.println();
                    }
                    break;

                case 2 :
                    System.out.print("Masukkan angka desimal: ");
                    int decimal = input.nextInt();

                    try {
                        bilanganBiner = Integer.toBinaryString(decimal);
                        System.out.println("Hasil konversi ke bilangan biner adalah: " + bilanganBiner);
                        System.out.println();
                    } catch (NumberFormatException e){
                        System.out.println("Input tidak valid. Tolong masukkan bilangan desimal yang benar.");
                        System.out.println();
                    }
                    break;

                case 3 :
                    System.out.print("Masukkan angka biner: ");
                    bilanganBiner = input.next();

                    try {
                        decimal = Integer.parseInt(bilanganBiner, 2);
                        String hexa = Integer.toHexString(decimal);
                        System.out.println("Hasil konversi ke bilangan heksadesimal adalah: " + hexa);
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Tolong masukkan bilangan biner yang benar.");
                        System.out.println();
                    }
                    break;

                case 4 :
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexa = input.next();

                    try {
                        decimal = Integer.parseInt(hexa, 16);
                        String biner = Integer.toBinaryString(decimal);
                        System.out.println("Hasil konversi ke bilangan biner adalah: " + biner);
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Tolong masukkan bilangan heksadesimal yang benar.");
                        System.out.println();
                    }
                    break;

                case 5 :
                    System.out.print("Masukkan angka desimal: ");
                    decimal = input.nextInt();

                    try{
                        hexa = Integer.toHexString(decimal);
                        System.out.println("Hasil konversi ke bilangan heksadesimal adalah: " + hexa.toUpperCase());
                        System.out.println();
                    }catch (NumberFormatException e){
                        System.out.println("Input tidak valid. Tolong masukkan bilangan desimal yang benar.");
                        System.out.println();
                    }
                    break;

                case 6 :
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    hexa = input.next();

                    try {
                        decimal = Integer.parseInt(hexa, 16);
                        System.out.println("Hasil konversi ke bilangan desimal adalah: " + decimal);
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Tolong masukkan bilangan heksadesimal yang benar.");
                        System.out.println();
                    }
                    break;

                case 0 : 
                System.out.println("Terimakasih sudah menggunakan program ini");
                repeat=false;
            }
        } while(repeat);
    
    input.close();
    }
}