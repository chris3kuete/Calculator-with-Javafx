/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

/**
 *
 * @author sa
 */
class Addition {
    
    private double numb1;
    private double numb2;
    
    
    public Addition(double numb1,double numb2){
        this.numb1=numb1;
        this.numb2=numb2;
        
        
    }
    public double getNumb1(){
        return numb1;
    }
    public void setNumb1(double numb1){
        this.numb1= numb1;
    }
    public double getNumb2(){
        return numb2;
    }
    public void setNumb2(double numb2){
        this.numb2= numb2;
    }
    public double getRe(){
        return numb1 + numb2;
    }
    
    
}
