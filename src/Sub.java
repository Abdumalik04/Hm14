public class Sub extends Person {
    private String firstName;
private int age;

    public Sub(String name, String firstName, int age) {
     super(name);
        this.firstName=firstName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void privet() {
        super.privet();
    }
    public void tur(){
        System.out.println("tur uktai berbei");
    }

    @Override
    public String toString() {
        return
                "name:"+name+"\n"+
                "firstName: " + firstName + "\n" +
                "age: " + age ;
    }
}
