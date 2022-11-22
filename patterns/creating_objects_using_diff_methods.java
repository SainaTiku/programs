public class creating_objects_using_diff_methods {
    void display()
    {
        System.out.println("Invoking Method");
    }

    public static void main(String[] args) {
        creating_objects_using_diff_methods obj=new creating_objects_using_diff_methods();
        obj.display();
    }
}
class Simple{
    void message(){System.out.println("Hello Java");}
}

class Test{
    public static void main(String args[]){
        try{
            Class c=Class.forName("Simple");
            Simple s=(Simple)c.newInstance();
            s.message();

        }catch(Exception e){System.out.println(e);}

    }
}
 class Employee
{

    private int empId;
    private String empName;
    private int empSalary;
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
