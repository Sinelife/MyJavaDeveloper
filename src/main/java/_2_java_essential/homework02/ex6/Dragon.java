package _2_java_essential.homework02.ex6;

class Dragon {
    protected String name;
    protected int age;

    Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hashcode=" + hashCode() +
                '}' + '\n';
    }


    @Override
    public int hashCode() {
        int i = 0;
        for (char c : name.toCharArray()) {
            i += c;
        }
        return i * age;
    }

    protected int hash;


    public int getHash() {
        return hash;
    }
}
