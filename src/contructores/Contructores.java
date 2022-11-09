/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contructores;


public class Contructores {

    public static void main(String[] args) {
       MaterialConstruccion mc = new MaterialConstruccion("cemento", 3, 30.400);
       MaterialConstruccion mc1 = new MaterialConstruccion("Taladro", 1, 450860.60);
        System.out.println(mc);
        System.out.println(mc1);
   
        mc.VerInformacion();
        mc1.VerInformacion();
    }
   
}
