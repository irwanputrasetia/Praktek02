/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

public class TanahAksi {
    public static void main(String[] args) {
      Tanah r1  = new Tanah ();
      r1.PanjangTanah = 12;
      r1.LebarTanah = 10;
      
      r1.cetakInfo();
      System.out.println("Luas Tanah = "+r1.HitungLuasTanah());
      r1.cetakLuas();
      
      Tanah r2 = new Tanah();
      r2.cetakInfo();
              
      Tanah r3 = new Tanah(50,30);
      r3.cetakInfo();
    }
}
