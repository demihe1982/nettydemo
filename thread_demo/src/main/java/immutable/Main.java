package immutable;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Alice","Alaska");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
