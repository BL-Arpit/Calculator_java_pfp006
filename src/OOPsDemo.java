import javax.xml.namespace.QName;

class Student{
    String name;
    String rollNo;

    Student(String n1, String n2){
        this.name = n1;
        this.rollNo=n2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}

class Cars{
    String licencePlate;
    String brand;
    String color;

    Cars(String l ,String b , String c){
        this.licencePlate = l;
        this.brand = b;
        this.color = c;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "licencePlate='" + licencePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


public class OOPsDemo {
    static {
        System.out.println("Static block is printed");
    }
    public static void main(String[] args) {
        //Constructor for creating a new student
        Cars c1 = new Cars("ABC123","Toyota","Red");
        Cars c2 = new Cars("ABC121","Tata","Blue");
        Cars c3 = new Cars("ABC122","Hyundai","White");
        Cars c4 = new Cars("ABC124","Audi","Black");
        Cars c5 = new Cars("ABC125","BMW","Blue");
        Cars c6 = new Cars("ABC126","Toyota","Blue");
        Cars c7 = new Cars("ABC127","Tata","Black");
        Cars c8 = new Cars("ABC128","Audi","White");

        //manually assigning the variable in an array
        Cars[] carlist = new Cars[8];
        carlist[0]=c1;
        carlist[1]=c2;
        carlist[2]=c3;
        carlist[3]=c4;
        carlist[4]=c5;
        carlist[5]=c6;
        carlist[6]=c7;
        carlist[7]=c8;



        for(int i= 0; i<carlist.length;i++){
            if(carlist[i].brand.equals("Toyota")){
                System.out.println(carlist[i]);
            }
        }
    }
}
