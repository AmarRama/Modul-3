/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author WINDOWS 10
 */
class Person 
{
    private String nama;
    private int usia;
    
    //Konstruktor
    public Person (String nama, int usia)
    {
        this.nama = nama;
        this.usia = usia;
    }
    //Metode
    public void info ()
    {
        System.out.println("Nama:"+this.nama);
        System.out.println("Usia:"+this.usia);
    }
}