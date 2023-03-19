public class Student {
    private int id;
    private String name;
    private String address;
    private String mobileNo;

//    public Student(String s){
//
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String toString() {
        return "[id=" + id + " name=" + name + " address=" + address + " mobileNo=" + mobileNo + "]";
    }

//    public Object clone(){
////        Student ss = new Student();
////        ss.id = this.id;
////        ss.name = this.name;
////        ss.mobileNo = this.mobileNo;
////        ss.address = this.address;
////        return ss;
//        return this.clone();
//    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}