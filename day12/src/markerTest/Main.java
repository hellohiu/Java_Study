package markerTest;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.checkA(new Eagle());
        m.checkA(new Tiger());
        m.checkA(new Horse());

        Animal[] animals = {new Eagle(), new Tiger(), new Horse()};
        Animal[] animals2 = {
                new Tiger(),
                new Horse(),
                new Eagle(),
                new Eagle(),
                new Tiger()
        };

        m.checkB(animals);
        m.checkB(animals2);
    }

    void checkA(Animal animal){
        if(animal instanceof Carnivore){
            System.out.println("육식 동물!");
        } else if(animal instanceof Herbivore){
            System.out.println("초식 동물!");
        }
    }
    
    void checkB(Animal[] animals){
        for(int i=0; i<animals.length; i++){
            if(animals[i] instanceof Sky){
                System.out.println("날아다닌다!");
            }else if(animals[i] instanceof Land){
                System.out.println("뛰어다닌다!");
            }
        }
    }
}
