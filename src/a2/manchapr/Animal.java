package a2.manchapr;

public abstract class Animal implements Comparable<Animal>, Cloneable {
    
    private double weight;
    
    public double getWeight() {
        
        return weight;
    }
    
    public void setWeight(double weight) {
        
        this.weight = weight;
    }
    
    public abstract String sound();
    
    @Override
    public int compareTo(Animal o) {
        
        if (this.weight < o.weight) {
            
            return -1;
            
        } 
        
        else if (this.weight > o.weight) {
            
            return 1;
            
        } 
        else {
            
            return 0;
            
        }
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
}
class Tiger extends Animal {
    
    @Override
    
    public String sound() {

        return "Roar";
    }
}