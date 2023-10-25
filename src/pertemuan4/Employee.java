package pertemuan4;

public class Employee extends Person{
    private String id_employee, dept, title;
    public Employee(String n, String a, String id_emp, String dept, String title) {
        super(n, a);
        id_employee = id_emp;
        this.dept = dept;
        this.title = title;
    }
    public String getIdEmp() {
        return id_employee;
    }
    public String getDept() {
        return dept;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
