/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i16064
 */
public class Calculator {

    public Calculator() {
    }
    
    public float plus (float a, float b){
        return a + b;
        
    }
    
    public float minus (float a, float b){
        return a-b;
        
    }
    
    public float multiply (float a, float b){
        return a * b;
        
    }
    
    public float division (float a, float b){
        return a / b;
        
    }
	
	public float max (float a, float b){
		if (a>b) return a;
		else return b;
	}

    public float min(float a, float b) {
      return (a < b) ? a : b;
    }
}
