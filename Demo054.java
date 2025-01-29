
 class Students{


     void method1(){
        System.out.println("sathwika is a student of MRUH");

     }
     void method2(String std){
        System.out.println(std+" is a student of MRUH");
     }

}

public class Demo054 {
    public static void main(String[] args) {
        Students  s1=new Students();
        s1.method1();
        s1.method2("Tanushka");
        
    }


    
}
