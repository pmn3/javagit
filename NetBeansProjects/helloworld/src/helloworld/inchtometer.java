/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author pmn
 */
public class inchtometer {
    public static void main(String[] array){
    double inch, meter, foot, foottoinch;
    foot = 12;
    foottoinch = foot * 12;
    int counter = 0;
    for (inch = 1; inch <= foottoinch; inch++){
    meter = inch * 0.0254;
    System.out.println(inch+" дюйм содержит "+meter+" метров ");
    counter++;
    if (counter == 12) { 
        System.out.println();
        counter = 0;
    }
    }
    }
}
