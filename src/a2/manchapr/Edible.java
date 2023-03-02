package a2.manchapr;

public interface Edible {
    
    public void howToEat();
}

class Fruit implements Edible {
    
    @Override
    public void howToEat() {
        
        System.out.println("Eat the fruit");
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        
        return "cookcook";
    }

    @Override
    public void howToEat() {
        
        System.out.println("Cook and eat");
    }
}

class Apple extends Fruit {
    
    @Override
    
    public void howToEat() {
        
        System.out.println("take a bite");
    }
}

class Orange extends Fruit {
    
    @Override
    
    public void howToEat() {
        
        System.out.println("Peel the orange");
    }
}