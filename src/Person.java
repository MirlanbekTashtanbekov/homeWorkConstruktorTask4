public class Person {
    String name;
    int age;
    String work;
    int salary;
    int priceOfPhone;


    public Person (){

    }

    public Person(String name, int age, String work, int salary,int priceOfPhone){
        this.name=name;
        this.age=age;
        this.work=work;
        this.salary=salary;
        this.priceOfPhone=priceOfPhone;
    }

    public static void getSalaryMax(Person[] people) {
        Person counter = people[0];
        for (int i = 0; i < people.length; i++) {
            if (counter.salary < people[i].salary) {
                counter = people[i];
            }
        }
        System.out.println("Max salary: "+counter.name+" "+ counter.salary);
    }

    public static void getSalaryMin(Person[] people){
        Person counter = people[0];
        for (int i = 0; i >people.length; i++) {
            if(counter.salary>people[i].salary){
                counter=people[i];
            }
        }
        System.out.println("Min salary: "+counter.name+" "+counter.salary);
    }

    public static void getPhone(Person[] people){
        Person counter = people[0];
        for (int i = 0; i <people.length; i++) {
            if(counter.priceOfPhone<people[i].priceOfPhone){
                counter=people[i];
            }
        }
        System.out.println("Expensive phone: "+counter.name+" Price of Phone: "+counter.priceOfPhone);
    }


    @Override
    public String toString() {
        return "\n" +
                "Person: " +"\n"+
                "Name: " + name + "\n" +
                "Age: " + age +"\n"+
                "Work: " + work + "\n" +
                "Salary: " + salary +"\n"+
                "Price of phone: " + priceOfPhone+"\n";
    }
}
