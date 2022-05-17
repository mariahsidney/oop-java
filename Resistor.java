/*  Group No: 1
    Members: Bellaflor, Mariah Sidney B.
	         Legaspi, John Raymond T.
             Mindo, Joey Nicole F.
             Serrano, Calvin Kristoffer G.
	CYS: BSIT 2-3
    Case Study 1: Resistor
*/

import java.util.Scanner;

public class Resistor {
    public static void main(String[] args) {
        String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet","gray", "white"};
        String bands[] = new String[3];
        String inv ="" ;
        double ans = 0;
        int sub = 0;
        int flag = 0, flag2 = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Band "+ (i+1) + "=> ");
            bands[i] = sc.next();
        }
       
        for(int i = 0;i < 3; i++ ){
            for(int j = 0; j < 9; j++){
                if(bands[i].equals(colors[j])){
                    // System.out.println("Found");
                    flag = 1;
                    sub = j;
                }
            }
            if(flag == 1){
                // System.out.println("Found!");
                if(i == 0){
                    ans = sub * 10;
                }
                else if(i == 1){
                    ans = ans + sub;
                }
                else{
                    ans = (ans * Math.pow(10,sub))/1000;
                    flag2 = 0;
                }
                flag = 0;
            }
            else{
                System.out.println("Invalid Input");
                inv = bands[i];
                flag2 = 1;      
            }
        }
        System.out.println(flag2);
        if(flag2 == 0){
            System.out.println("Resistor Value: "+ans+ " kilo-ohms");
            flag2 = 0;
        }
        else if(flag2 == 1){
            System.out.println("Invalid input: "+ inv);
            flag2 = 0;
        }
    }
}