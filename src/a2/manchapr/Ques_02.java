package a2.manchapr;

public class Ques_02 {          //class Ques_02
    
    //main method with an clone exception
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //creating two object of class Point p1 and p2
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3.4, 1.4);
        
        //checking if object p1 is equals to p2
        System.out.println(p1.equals(p2));
        
        //checking if object p1 is equals to p1
        System.out.println(p1.equals(p1));
        
        //comparing two object p1 and  p2
        System.out.println(p1.compareTo(p2));
        
        //comparing two object p1 and  p2
        System.out.println(p2.compareTo(p1));
        
        //cloning p1 object to p3
        Point p3 = (Point)(p1.clone());
        
        //checking if object p3 is equals to p1
        System.out.println(p3.equals(p1));
        
        //printing the value of p3 using to string
        System.out.println(p3);
    }
}
