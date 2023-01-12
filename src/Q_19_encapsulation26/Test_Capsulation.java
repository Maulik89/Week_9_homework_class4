package Q_19_encapsulation26;

public class Test_Capsulation {
    public static void main(String[] args){
        Encapsulate obj = new Encapsulate();
        obj.setName("montu");
        obj.setAge(20);
        obj.setRollNo(13);
        System.out.println("CodeBusters name: " +obj.getName());

                System.out.println("CodeBuster age: " +obj.getAge());

                        System.out.println("CodeBuster rollNo: " +obj.getRollNo());

    }
}
