/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyjava;

/**
 *
 * @author johan
 */
public class Penukaran {

    void inputUang(int rph) {
        int n[] = new int[7];
        int ttry[] = new int[7];
        int counter = 0;
        int lbr[] = {100000, 50000, 25000, 10000, 5000, 1000};
        String pecahan[] = {"Seratus Ribu", "Lima Puluh Ribu", "Dua Puluh Lima Ribu", "Sepuluh Ribu", "Lima Ribu", "Seribu"};
        for (int i = 0; i < lbr.length; i++) {

            n[i] = rph / lbr[i];
            if (n[i] == 0) {
                counter++;

            }
            // rph= n[i] *lbr[i]; 

            System.out.println("Pecahan" + "   " + pecahan[i] + "=" + n[i]);
            //     System.out.println("Ttry"+  n[i]  );

        }

//            for(int a=0;a<lbr.length;a++){
//                    
//                
//            }
    }
}
