package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Organism extends AbstractEntity<Organism> {
    protected String name;
    protected Integer age;

    public Organism(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Organism() {}

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
        return "Organism{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Organism o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public Organism getGeneratedElem() {
        Class[] classes = {Organism.class, Animal.class, Cat.class, Dog.class, Human.class, Student.class, SchoolChild.class, Shark.class, Plant.class, Baobab.class};
        Class clazz = classes[random.nextInt(classes.length)];
        if (clazz.equals(Organism.class)) {
            return getGeneratedElem(null);
        }
        Organism organism = null;
        try {
            organism = (Organism) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return organism.getGeneratedElem();
    }

    private Organism getGeneratedElem(Object o) {
        return new Organism(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 1_000)
        );
    }
}
