package a2.manchapr;

public class Point implements Comparable<Point>, Cloneable{
    
    private double w,z;

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
    Point() {
        this.w=0;
        this.z=0;
    }
    
    Point(double w, double z) {  
        this.w=w;
        this.z=z;
    }
    
    @Override
    public int compareTo(Point obj) {
        if(this==obj) {
            return 1;
        }
        else {
            return 0;
        } 
    }
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
   
    @Override
    public Object clone() throws CloneNotSupportedException {  
        
        return super.clone();
        
    }
    @Override
    public String toString() {
        return "[" + this.w + ", " + this.z + "]";
    }
}
