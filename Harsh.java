public class Harsh {
    String name;
    int id;

    Harsh(String name , int id){
        this.name = name;
        this.id = id;
    }

}

class Vardhan{
    public static void main(String[] args){
        Harsh harsh1 = new Harsh("testUser",20);

        System.out.println("Name  " + harsh1.name + " and " + " id " + harsh1.id);
    }
}
