package a2.manchapr;

public class Assignmnet2 {
      
    //main method with an exception of clone
    public static void main(String [] args) throws CloneNotSupportedException {
        
        
        //creating an array object name Animal
        Animal[] list = new Animal[5];
        
        //Assinging the the to object array
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        
        list[4] = (Animal)(list[1].clone());
        
        
        //Shorting of the array
        java.util.Arrays.sort(list);
        
        //printing the array using for loop
        for (int i = 0; i < list.length; i++) {
            
            System.out.println("weight: " + list[i].getWeight());
            
        }     //for loop ends 
        
    }      //main ends 
    
}         //class ends 
