/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
    void simpanUang(int s){
        saldo = saldo + s;
        System.out.println("Saldo saat ini : Rp." + saldo);
    }
    void ambilUang(int s){
    saldo = saldo - s;
    if (saldo <= saldo){
    System.out.println("Saldo Tidak Mencukupi");
    } else {
    System.out.println("Saldo saat ini : Rp." + saldo);
    }
    }
    void getSaldo(){
        System.out.println("Saldo saat ini : Rp."+ saldo);
    }
    
    
    
    } 

