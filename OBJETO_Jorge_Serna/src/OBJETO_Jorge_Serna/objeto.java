package OBJETO_Jorge_Serna;

import java.util.ArrayList;

public class objeto {
	static ArrayList list =new ArrayList();
	
	public static void main(String[] args) {

        Gen<String> strOb=new Gen<String>("");
        strOb.mostrarTipo();
        
        Gen<Integer> iOb=new Gen<Integer>(28);
        iOb.mostrarTipo();
        
        Gen<Double> dOb=new Gen<Double>(28.8);
        dOb.mostrarTipo();
        
        Gen<Float> fOb=new Gen<Float>(15.8f);
        fOb.mostrarTipo();
        
        Gen<ArrayList> aOb=new Gen<ArrayList>(list);
        aOb.mostrarTipo();
        
        Gen<Boolean> bOb=new Gen<Boolean>(true);
        bOb.mostrarTipo();
	}
	
}

class Gen<T>{

    T ob;

    Gen(T o){
        ob=o;
    }

    T getOb(){
        return ob;
    }

    void mostrarTipo(){
    	 if(ob instanceof String)
    	 {
    		 System.out.println("Eres una palabra");
    	 }
    	 else
    	 if(ob instanceof Integer)
    	 {
    		 System.out.println("Eres un numero");
    	 }
    	 else
    	 if(ob instanceof Double)
    	 {
    		 System.out.println("Eres un numero");
    	 }
    	 else
    	 if(ob instanceof Long)
    	 {
    		 System.out.println("Eres un numero");
    	 }
    	 else
    	 if(ob instanceof Float)
    	 {
    		 System.out.println("Eres un numero");
    	 }
    	 else
    	 if(ob instanceof ArrayList)
    	 {
    		 System.out.println("Eres una Lista");
    	 }
    	 else
    	 {
    		 System.out.println("Eres de otro tipo");
    	 }
    }
}