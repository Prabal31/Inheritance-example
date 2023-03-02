package a2.manchapr;

public abstract class Animal implements Cloneable {
    double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract String sound();

    @Override
    public Object clone() {
        
        try {
            
            return (Animal)super.clone();
        }
        
        catch(CloneNotSupportedException e) {
            
           return("CloneNotSupportedException");
        }
    }
}
class Tiger extends Animal {
    
    @Override
    
    public String sound() {

        return "Roar";
    }
}