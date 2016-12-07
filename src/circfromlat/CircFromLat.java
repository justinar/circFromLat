/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circfromlat;

/**
 *
 * @author jariv
 */
public class CircFromLat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double secsrd = 86164.090530833;
        double sNumber = 0;
        double avar2 = 6378.137;
        double bvar3 = 6356.752314;
        double tnum1 = Math.pow(avar2, 2);
        double cosv2 = Math.cos((sNumber / 180.0) * Math.PI);
        cosv2 = cosv2 * avar2;
        cosv2 = Math.pow(cosv2, 2);
        double sinv3 = Math.sin((sNumber / 180.0) * Math.PI);
        sinv3 = sinv3 * bvar3;
        sinv3 = Math.pow(sinv3, 2);
        double cNum3 = cosv2 + sinv3;
        cNum3 = Math.pow(cNum3, 1 / 2);
        cNum3 = tnum1 / cNum3;
        cNum3 = 2 * Math.PI * Math.cos((sNumber / 180.0) * Math.PI) * cNum3;
        double cNum2 = cNum3 / (5280 * 0.0003048);
        double cNum6 = cNum3 / 1.852;
        double cNum4 = cNum2 / secsrd;
        cNum4 = cNum4 * 3600;
        double cNum5 = cNum3 / secsrd;
        cNum5 = cNum5 * 3600;
        double cNum7 = (cNum5 / 1.852);
        /*
	cNum2 = forult(cNum2);
	cNum3 = forult(cNum3);
	cNum4 = gesult(cNum4);
	cNum5 = gesult(cNum5);
	cNum6 = forult(cNum6);
	cNum7 = gesult(cNum7);
         */
        System.out.println(cNum2);
        System.out.println(cNum3);
        System.out.println(cNum4);
        System.out.println(cNum5);
        System.out.println(cNum6);
        System.out.println(cNum7);
    }

}
