/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author WINDOWS 10
 */
import java.io.*;

public class UjiMapel
{
    public static String bacainput ()
    {
        String baca="";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader (input);
        
        try //Jika Kondisi Benar
        {baca = buf.readLine();}
        catch (IOException e) //Jika Kondisi Salah
        {System.out.println("Salah !");
        }
        return baca; // nilai balik
        
    }
    public static void main (String[] args)
    {
        //Pembuatan Objek Baru
        Mapel s1 = new Mapel();
        Produktif s2 = new Produktif();
        Adaptif s3 = new Adaptif();
        Normatif s4 = new Normatif();
        int menu;//deklarasi variabel menu
        
        do//Perulangan
        {
            s1.Mapel();//Pemanggilan
            menu=Integer.parseInt (bacainput());//Mengambil Imputan
            switch (menu) 
            {
                case 1:
                    s2.Produktif();
                    break;
                case 2:
                    s3.Adaptif();
                    break;
                case 3:
                    s4.Normatif();
                    break;
                case 4 : System.exit(0);
                    
                default : System.out.println("Pilihan tidak tersedia");
            }
        }
        while (true);
    }
    
}