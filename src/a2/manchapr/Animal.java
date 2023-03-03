package a2.manchapr;

public abstract class Animal implements Comparable<Animal>, Cloneable {
   //Animal class wwhich implements comparable and cloneable classes
    
    private double weight;   //private double data member 'weight'
    
    
    //get and set method for variable 'weight'
    public double getWeight() {
        
        return weight;
    }
    
    public void setWeight(double weight) {
        
        this.weight = weight;
    }
    
    public abstract String sound(); //an abstract method sound
    
    @Override
    public int compareTo(Animal o) {
        
       //override compare to method to compare the weights
        
        if (this.weight < o.weight) {
            
            return -1;   //return the value -1
            
        } 
        
        else if (this.weight > o.weight) {
            
            return 1;     //return the value 1 
            
        } 
        else {
            
            return 0;      //return the value 0
            
        }
    }
    
    
   //override clone method to clone the object
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
}    //Animal class ends

//class tiger which is a sub class of Animal
class Tiger extends Animal {
    
    @Override
    
    //override Sound method
    public String sound() {

        return "Roar";
    }
}  //tiger class ends