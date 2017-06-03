package pkginterface;


import pkginterface.Sepeda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deni Rinaldi
 */
public class Implem implements Sepeda{
    @Override
    public void jenis(){
        System.out.println("Jenis sepeda : Sepeda Balap");
    }
    @Override
	public void merk(){
        System.out.println("Merk Sepeda: BMX");
    }
    @Override
	public void gigi(){
        System.out.println("Gigi sepeda ini hanya 1");
    }
}
