package com.mycompany.tokoonlen;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String employee[]={"Staff","Member"};
        Scanner ingput = new Scanner (System.in);
        InfoKaryawan staffinfo = new InfoKaryawan();
        InfoMember member = new InfoMember();
        Transaksi bargain = new Transaksi();
        Laporan lapor = new Laporan();
        Barang barang = new Barang();
        int ID=0;
        int milih=0;
        int filih=0;
        int bilih=0;
        int pilih, saldo;
        String daftarnama,daftarNoTelp,daftarAlamat;
        int daftarJabatan;
        do{
        System.out.println("Selamat Datang Di Toko Online 9/11");
        System.out.println("Silahkan Login Terlebih Dahulu: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(i+1 + ". Login "+employee[i]);
        }
        System.out.println("3. Sign Up");
            System.out.println("4. Nuklir Toko");
        pilih=ingput.nextInt();
            if (pilih==1||pilih==2) {
                System.out.print("Masukkan ID: ");
                ID = ingput.nextInt();
            }
        System.out.println("===================");
       
        if (pilih==1) {        
                if (ID >= staffinfo.getJmlKaryawan()||ID < 0){
                    System.out.println("ID ERROR");
                }
                else{
                    do{
                        System.out.println("Berhasil Login Sebagai "+employee[1-1]+" "+staffinfo.getNama(ID));
                        System.out.println("1. Lihat Info Karyawan\n2. Lihat Laporan Transaksi\n3. Lihat Laporan Barang\n4. Lihat Laporan Member\n5. Log Out");
                        System.out.println("Inputmu: ");
                        milih=ingput.nextInt();
                        if (milih>5||milih<1) {
                            System.out.println("Pilihan Tidak Tersedia");
                            System.exit(0);
                        }
                        else{
                            switch(milih){          
                            case 1: 
                                staffinfo.PrintKaryawan(ID);
                                break;            
                            case 2:
                                lapor.laporan(bargain, barang);
                                break;
                            case 3:
                                lapor.laporan(barang);
                                break;
                            case 4:
                                lapor.laporan(member);
                                break;
                            case 5:
                                System.out.println("Log Out Berhasil, Kembali ke Halaman Utama");
                                break;
                            }
                        }                       
            }while(milih!=5);}
            
        }   
        if (pilih==2) {
              if (ID >= member.getJmlMember()||ID < 0){
                    System.out.println("ID ERROR");
                }
              else{
                  do{                
                    System.out.println("Berhasil Login Sebagai "+employee[2-1]+" "+member.getNama(ID));
                    System.out.println("1. Lihat Info Member\n2. Lihat List Barang\n3. Belanja\n4. Log Out");
                    System.out.println("Inputmu: ");
                    filih=ingput.nextInt();
                        if (filih>4||filih<1) {
                            System.out.println("Pilihan Tidak Tersedia");
                            System.exit(0);
                        }
                    switch(filih){          
                        case 1: 
                            member.PrintMember(ID);
                            break;            
                        case 2:
                            lapor.laporan(barang);
                            break;
                        case 3:
                            bargain.ProsesTransaksi(member, barang, bargain, ID);
                            break;
                        case 4:
                            System.out.println("Log Out Berhasil, Kembali ke Halaman Utama");
                            break;
                    }
            }while(filih!=4);}           
            }
        if (pilih==3) {

            System.out.println("Silahkah Sign Up");
            System.out.println("1. Apply Staff");
            System.out.println("2. Daftar Member");
            System.out.println("3. Back");
            System.out.print("Inputmu: ");
            bilih = ingput.nextInt(); 
            ingput.nextLine();
        
            switch(bilih){
                case 1:
                    System.out.println("Mendaftar Sebagai Staff Member");
                    System.out.print("Masukkan Nama Mu: \t");
                    daftarnama =ingput.nextLine();
                    System.out.print("Masukka Nomor Teleponmu: \t");
                    daftarNoTelp = ingput.nextLine();
                    System.out.print("Masukkan Alamatmu: \t");
                    daftarAlamat = ingput.nextLine();
                    System.out.println("Mendaftar Sebagai: \n1. Employee \n2. Intern");
                    daftarJabatan = ingput.nextInt();
                    staffinfo.DaftarKaryawan(daftarnama, daftarNoTelp, daftarAlamat, daftarJabatan);
                    break;
                case 2: 
                    System.out.println("Mendaftar Sebagai Member");
                    System.out.print("Masukkan Nama Mu: \t");
                    daftarnama =ingput.nextLine();
                    System.out.print("Masukkan Nomor Teleponmu: \t");
                    daftarNoTelp = ingput.nextLine();
                    System.out.print("Masukkan Alamatmu: \t");
                    daftarAlamat = ingput.nextLine();                   
                    System.out.print("Isi Saldomu: \t");
                    saldo = ingput.nextInt();
                    member.DaftarMember(daftarnama, daftarNoTelp, daftarAlamat, saldo);
                    break;                    
            }
        }
            if (pilih==4) {
                System.out.println("duar");
                System.exit(0);
            }
            if (pilih<1||pilih>4) {
                System.out.println("baca yg bner");
            }
        }
        while(milih==5||filih==4||bilih==3||pilih!=1||pilih!=2||pilih!=3||pilih!=4);
    }
}
    