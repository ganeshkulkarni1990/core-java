import com.abc.exceptions.NotAValidNumberException;

class AAAA {
    private int i = 10;
    private int j;
    public int getI(){
        return this.i;
    }
    public void setI(int i){
        this.i = i;
    }

    public long doLongCalc(int salt) throws NotAValidNumberException {
        if(salt == 0){
            throw new NotAValidNumberException();
        }
        return (i * 100) + (100 * (salt) << 4);
    }

} //java bean
//EJB
//EE --> Java Enterprize --> ad
public class WrapperDemo {
    private static void testMethod(AAAA a){
        int i = a.getI();
        i+=10;
        a.setI(i);
    }

    public static void main(String ...args) throws Exception{
        Integer i = new Integer(100000);

        AAAA a = new AAAA();
//        System.out.println(a.getI());
//        testMethod(a);
//        System.out.println(a.getI());
        long j = 0;
        try {
            j = a.doLongCalc(0);
        }catch (NotAValidNumberException e){
//            System.out.println("Salt: " + e.getValue() + " Message:" + e.getMessage()) ;
            System.out.println(e.getCause());
        }
        System.out.println(j);
    }
}
