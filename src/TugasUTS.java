import java.util.Random;
import java.util.Scanner;

public class TugasUTS {
    int jumProdi = 3; // Informatika,Dkv,Komputer
    static int totalJumlahMahasiswaBaru = 1050;
    public static String[] Informatika = new String[500];
    public static String[] Dkv = new String[300];
    public static String[] Komputer = new String[250];

    public static void PrintInfoMahasiswaBaru(){
        int jumlahInformatika=0;
        int jumlahSisa = 0;
        for(int index=0;index<Informatika.length;index++){
            if(Informatika[index]  !=null){
                jumlahInformatika++;
            }
        }
        int jumlahDkv=0;
        for(int index=0;index< Dkv.length;index++){
            if(Dkv[index]  !=null){
                jumlahDkv++;
            }
        }
        int jumlahKomputer=0;
        for(int index=0;index< Dkv.length;index++){
            if(Dkv[index]  !=null){
                jumlahDkv++;
            }
        }
        jumlahSisa= totalJumlahMahasiswaBaru - jumlahInformatika - jumlahDkv - jumlahKomputer;
        System.out.println("jumlah maba Informatika" + jumlahInformatika + " | jumlah Maba Dkv: " + jumlahDkv + " | jumlah Maba Komputer: INFORT" + jumlahKomputer);
        System.out.println("jumlah prodi : "+ totalJumlahMahasiswaBaru + " | jumlah sisa: " + jumlahSisa);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String mahasiswabaru){
        int indexNow = 0;
        for (int index=0; index<myArray.length;index++){
            if(myArray[index]  !=null){
                indexNow = index+1;
            }
        }

        if(indexNow < myArray.length){
            myArray[indexNow] = mahasiswabaru;
        }
    }
    public static void simpanMahasiswa(int angkaRandom, String maba) {
        Random rd = new Random();
        int rdNum;
        String m[] = new String[10];
        for(int i=0;i<10;i++) {
            rdNum = rd.nextInt(10);

            m[i] = Integer.toString(rdNum);
        }
        switch(angkaRandom) {
            case 1:
            CheckIndexArray(Informatika,maba);
            System.out.println("Nik Mahasiswa : TI22"+m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8]);
            PrintInfoMahasiswaBaru();
            case 2:
            CheckIndexArray(Dkv,maba);
            System.out.println("Nik Mahasiswa : TI22"+m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8]);
            PrintInfoMahasiswaBaru();
            case 3:
            CheckIndexArray(Komputer,maba);
            System.out.println("Nik Mahasiswa : TI22"+m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8]);
            PrintInfoMahasiswaBaru();
            }
        }
    public static void main(String[] args) {
        jawaban3.inputMahasiswabaru();
        //
    }
}