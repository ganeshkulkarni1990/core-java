public class ClonableDemo {
    public static void main(String... args) {
        Student s2 = new Student();
        s2.setId(100);
        s2.setName("Test Student");
        s2.setAddress("Nashik");
        s2.setMobileNo("844949849849");
        System.out.println(s2);
        Student ss = null;
        try {
            ss = (Student) s2.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ss);
    }
}
