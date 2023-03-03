package manchapr;

public interface Edible {   //created class 'Edible"
    
    public void howToEat();          //An abstract method howToEat
    
}          //Edible class ends

class Fruit implements Edible {   //Fruit class which Implements Edible
    
    @Override
    
    public void howToEat() {      //how to eat method
        
        System.out.println("EatEatEatEat");
    }
}       //Fruit class ends

class Chicken extends Animal implements Edible {
  //Chiken class which is a sub class of Animal and implements Edible
    
    @Override
    
    public String sound() {   //override Sound method
        
        return "cookcocooooooc!";
    }

    @Override
    
    public void howToEat() {     //override howToEat method
        
        System.out.println("Chew and eat!!");
    }
    
}   //Chicken class ends     

class Apple extends Fruit {  //Class Apple which is the subclass of  Fruit
    
    @Override
    
    public void howToEat() {   //override howToEat method
        
        System.out.println("peel the apple scilce into peices and eat");
    }
    
}       //Apple class ends

class Orange extends Fruit {  //class Orange which is a subclass of  Fruit
    
    @Override
    
    public void howToEat() {      //override howToEat method
        
        System.out.println("Peel the orange seperate the peices and take a bite");
    }
    
}     //Orange class ends