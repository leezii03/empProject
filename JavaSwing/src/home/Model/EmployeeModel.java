package home.Model;

public class EmployeeModel {
    private int id ;
    private String name ;
    private String gender ;
    private int age ;
    private String position ;
    private Double salary ;
    private String contact ;
    private String image ;
    private String date ;

    public EmployeeModel(int id, String name, String gender, int age, String position, Double salary, String contact, String image, String date) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.contact = contact;
        this.image = image;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public String getContact() {
        return contact;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }
    
    
}
