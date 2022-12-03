package Dz_OOP.Iterator_comparator.Task_3.Iterator;

public class Main {
    public static void main(String[] args) {
        CatsFlock flock = new CatsFlock();
        Repository repository = new Repository(flock);

        repository.addCats("Simba");
        repository.addCats("Tom");
        repository.addCats("Gav");
        Cats cot = repository.getCat(2);

        for (Cats cat : flock) {
            System.out.println(cat);
        }
        System.out.println();
        System.out.println(cot);
    }
}
