
//program --> it takes some input and produces some output
//the output --> may be successful, failed, partial success, not allowed
//admin -> add user remove user , update permission of user
//user can perform some operation
//web application
//statusCode

class A {
    int data;
    String name;
    String address;
    String abc;
    long value;

    String mobileNo;

     final void method(){
         System.out.println("Inside class A method");
     }
}
class B extends A {
    B() {
        super.method();
    }
}


enum ErrorCode{
    OK(200, "ok"),
    NOT_ALLOWED(203,"Not exists or not allowed"),

    FORBIDDEN(403, "You don't have permissions to access"),

    RATE_LIMIT(415, "You have crossed the limit to access the resource");
    private int code;
    private String message;
    ErrorCode(int i, String message){
        this.code = i;
        this.message = message;
    }

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}
enum Season {
    WINTER(40),
    SUMMER(50),
    FALL(10),
    SPRING(70);
    private int value;
    Season(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}

public class FinalAndEnumBasic {
    void testSwitch(Season season) {
        switch (season) {
            case FALL:
                System.out.println("fall season going on:" + season.getValue());
                break;
            case WINTER:
                System.out.println("winter season going on:" + season.getValue());
                break;
            case SUMMER:
                System.out.println("summer season going on:" + season.getValue());
                break;
            case SPRING:
                System.out.println("spring season going on:" + season.getValue());
                break;
            default:
                System.out.println("Please specify the proper season");
        }
    }

    String name; //hard coding 100 object
    FinalAndEnumBasic(String name){
        this.name = name;
    }
    public static void main(String ...args){
//        Season season = Season.SUMMER;
//        new FinalAndEnumBasic().testSwitch(season);
//
//        ErrorCode er = ErrorCode.FORBIDDEN;
//        System.out.println(er.getCode() + " " + er.getMessage());
        //name = "Ganesh";

//        FinalAndEnumBasic a1 = new FinalAndEnumBasic("Ganesh");
//        System.out.println(a1.name);
//
//        FinalAndEnumBasic a2 = new FinalAndEnumBasic("Sakshi");
//        System.out.println(a2.name);

        B b = new B();
    }
}
