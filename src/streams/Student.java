package streams;

public class Student {
    private Long id;
    private String name;
    private String mobileNumber;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, String mobileNumber, Integer age) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
