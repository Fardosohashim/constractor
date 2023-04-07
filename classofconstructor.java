package constractor;

public class classofconstructor {
    int x;//class of attributes
    String buldings;
    public classofconstructor(int y){

x=y;


    }
    public classofconstructor(String house){
        buldings=house;
    }

    public static void main(String[] args) {
        classofconstructor myobj=new classofconstructor(10);
        classofconstructor myob=new classofconstructor( "house");
        System.out.println(myobj.x);
        System.out.println(myob.buldings);
    }
}

