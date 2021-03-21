/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluationaverage;

/**
 *
 * @author JorUge
 */
public class EvaluationAverage {
   
    public static void main(String[] args) {

        double firstEvaluation=0, secondEvaluation=0, thirdEvaluation=0, average=0;    

        if(firstEvaluation < 5) firstEvaluation=0;
        if(secondEvaluation < 5) secondEvaluation=0;
        if(thirdEvaluation < 5) thirdEvaluation=0;

        average = ( firstEvaluation + secondEvaluation + thirdEvaluation - Math.min(firstEvaluation, Math.min(secondEvaluation, thirdEvaluation))) / 2;
        System.out.printf("%.2f\n", average);
    }
        
       
}






//public class JavaApplication1 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        double a1=4, a2=4.5, a3=7, media=0;
//if(a1<5) a1=0;
//if(a2<5) a2=0;
//if(a3<5) a3=0;
//
//media = (a1 + a2 + a3 - Math.min(a1, Math.min(a2, a3))) / 2;
//
//System.out.printf("%.2f\n", media);
//                     
//    }
//    
//}