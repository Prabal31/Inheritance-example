package manchapr;


//Class name point which implements comparable and cloneable interfaces
public class Point implements Comparable<Point>, Cloneable{
    
    //two private data members of double w and z
    private double w,z;

    
    
    //get and set method of w and z
    public void setW(int w) {
        
        this.w = w;
    }

    public void setZ(int z) {
        
        this.z = z;
    }

    public double getW() {
        
        return w;
    }

    public double getZ() {
        
        return z;
    }
    
    //default constructor to se the value of w and z to zero
    Point() {
        
        w=0;
        z=0;
    }
    
    //parameter constructor to initialize the value of w and z
    Point(double w, double z) { 
        
        this.w=w;
        this.z=z;
    }
    
    //override compare to method which compare the two objects
    @Override
    public int compareTo(Point obj) {
        
        if(this.w>obj.getW()) {
            
            return 1;
        } 
        
        else if(this.z>obj.getZ()) {
            
            return -1;
        }
        
        else {
            
            return 0;
        }
        
    }
    
    //override equals method which chech if the two objects are equal or not deeply

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.w) != Double.doubleToLongBits(other.w)) {
            return false;
        }
        return Double.doubleToLongBits(this.z) == Double.doubleToLongBits(other.z);
    }

    //override clone method to clone the object
    @Override
    public Object clone() throws CloneNotSupportedException {  
        
        return super.clone();  
    }
    
    //to string metthod to print the value 
    @Override
    public String toString() {
        
        return "[" + this.w + ", " + this.z + "]";
    }
    
}     //class point ends
