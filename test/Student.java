package test;


import org.junit.*;


enum Gender {
    Male, Female
}

public class Student {
    private String id;
    private String name;
    private Gender gender;
    private int age;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Student setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public Student(String id, String name, Gender gender, int age) {
        this.setId(id);
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "我是一个学生\n名字是: " + getName() + "\n学号是: " + getId() + "\n性别是: "
                + (getGender().equals(Gender.Male) ? "男" : "女") + "\n年龄是: " + getAge();
    }

    public static void main(String[] args) {
        new Student().test();
    }

    @Test
    public void test() {
        Student quanwei = new Student("20203206222", "唐权威", Gender.Male, 19);
        System.out.println(quanwei);
        System.out.println("-----修改后-------");
        quanwei.setName("TangQuanwei").setAge(100).setId("14176138").setGender(Gender.Female);
        System.out.println(quanwei);
    }
}
