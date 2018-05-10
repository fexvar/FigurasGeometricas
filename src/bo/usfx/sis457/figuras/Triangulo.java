/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Toshiba
 */
public class Triangulo {
    
    private double Lado1, Lado2, Lado3,base1;
    
    

    public Triangulo(double Lado1, double Lado2, double Lado3 double Base1){
        
    this.Lado1=Lado1;
    this.Lado2=Lado2;
    this.Lado3=Lado3;
    this.Base1=Base1;
    }
    
    public double getLado1(){
        return Lado1;
    }
    
    public void setLado1(double lado1){
    this.Lado1=Lado1;
    }
    public double getLado2(){
        return Lado2;
    }
    
    public void setLado2(double lado2){
    this.Lado2=Lado2;
    }
    
    public double getLado3(){
        return Lado3;
    }
    
    public void setLado3(double lado3){
    this.Lado3=Lado3;
    }
    
    public double getBase1(){
        return Base1;
    }
    
    public void setBase1(double Base1){
    this.Base1=Base1;
    }
    
}
