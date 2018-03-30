/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

public class Tanah {
   double PanjangTanah;
   double LebarTanah;
   
  void cetakInfo(){
       System.out.println("=============================");
       System.out.println("Panjang Tanah :"+PanjangTanah);
       System.out.println("Lebar Tanah :"+LebarTanah);
       System.out.println("=============================");
   }
  
  double HitungLuasTanah(){
      double luas;
      luas = PanjangTanah*LebarTanah;
      return luas;
  }
}
