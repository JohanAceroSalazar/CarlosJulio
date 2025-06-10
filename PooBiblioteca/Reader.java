public class Reader {

    public int id;
    public String name;
    public int telephone;
    public int age;


    public Reader(int id, String name, int telephone, int age) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Reader [id=" +id + ", name=" + name + ", telephone=" + telephone + ", age=" + age + "]";
    }
}