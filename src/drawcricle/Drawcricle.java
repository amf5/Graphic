/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawcricle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

public class Drawcricle {

    /**
     * @param args the command line arguments
     */
    public static double[] Half_Quarter(double[] P, double []X_axis, double []Y_axis,double x,double r,double pk, int i){
       while(x>=r){
        if(x==0&&pk==0){
    pk=1-r;
   }else{
    if(pk<0){
    x=x+1;
    pk=pk+(2*x)+1;
    
    }
    else{
    x=x+1;
    r=r-1;
   pk=pk-(2*r)+(2*x)+1;
   }}
    
   i++;
       }
    
        for (int j = i+1; j < (X_axis.length*2)-1; j++) {
    X_axis[i]=x;
    Y_axis[i]=r;          
        }
       
    
    
    
    } }
    
    /*public static ArrayList<double> completequarter(ArrayList<double> Quarter){
    
    
    }*/
    
    
    
    
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
Scanner enter_point=new Scanner(System.in);
        System.out.println("Enter The Raduis:");
        double Raduis=enter_point.nextDouble();
        ArrayList<Double> a=new ArrayList();
 ArrayList<Double> b=new ArrayList<Double>();
        
     
                
        System.out.println(Half_Quarter(a, 0, Raduis, 0).size());
              for (double f:Half_Quarter(a, 0, Raduis, 0)) {
                  System.out.println(f);
        }
              System.out.println(Half_Quarter(b, 0, Raduis, 0).get(Half_Quarter(b,0, Raduis, 0).size()));
 
    }
    
}
