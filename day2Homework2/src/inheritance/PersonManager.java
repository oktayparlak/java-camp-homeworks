package inheritance;

public class PersonManager extends Person {

    public void list(){
        System.out.println("Müşteri listelendi.");
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
    }

    public void update(){
        System.out.println("Müşteri güncellendi.");
    }
}
