/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoonlen;


/**
 *
 * @author ASUS
 */
public class InfoKaryawan extends Karyawan{
    public void infonya(){
        
    
    }
    public void DaftarKaryawan(String nama, String NoTelp, String Alamat, int posisi){
        System.out.println("ID\t:"+super.getJmlKaryawan());
        super.setNama(nama);
        System.out.println("Nama Karyawan\t: "+nama);   
        System.out.println("Jabatan\t\t: "+super.getJabatanList(posisi));
        super.setJabatan(posisi);
        super.setTelepon(NoTelp);
        System.out.println("Nomor Telepon\t: "+NoTelp);
        super.setAlamat(Alamat);
        System.out.println("Alamat\t\t: "+Alamat);        
    }
    public void PrintKaryawan(int id){        
        System.out.println("Nama Karyawan\t: "+super.getNama(id));   
        System.out.println("Jabatan\t\t: "+super.getJabatanList(super.getJabatan(id)));
        System.out.println("Nomor Telepon\t: "+super.getTelepon(id));
        System.out.println("Alamat\t\t: "+super.getAlamat(id));
    }
    
}
