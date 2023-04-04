/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoonlen;

/**
 *
 * @author ASUS
 */
public class InfoMember extends Member{
    @Override
    public void PrintMember(int id){
        System.out.println("Nama Member\t: "+super.getNama(id));   
        System.out.println("Saldo\t\t: "+super.getSaldo(id));
        System.out.println("Nomor Telepon\t: "+super.getTelepon(id));
        System.out.println("Alamat\t\t: "+super.getAlamat(id));
    }
    @Override
    public void DaftarMember(String nama, String NoTelp, String Alamat, int saldomu){
        System.out.println("ID\t:"+super.getJmlMember());
        super.setNama(nama);
        System.out.println("Nama Member\t: "+nama);   
        super.setSaldo(saldomu);
        System.out.println("Saldo\t\t: "+saldomu);
        super.setTelepon(NoTelp);
        System.out.println("Nomor Telepon\t: "+NoTelp);
        super.setAlamat(Alamat);
        System.out.println("Alamat\t\t: "+Alamat);
        
    }
}
