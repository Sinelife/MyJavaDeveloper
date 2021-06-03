package _2_java_essential.zzz_fourth_extra_homework.objects._6_dragon;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class Dragon extends AbstractEntity<Dragon> {
    protected String name;
    protected int age;

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
        this.hash = hashCode();
    }

    public Dragon() {}

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

    protected Integer hash;

    public int getHash() {
        return hash;
    }


    @Override
    public int compareTo(Dragon dragon) {
        return this.hash.compareTo(dragon.hash);
    }

    @Override
    public Dragon getGeneratedElem() {
        Class[] classes = {DeathDragon.class, WaterDragon.class, Hydra.class};
        Class clazz = classes[random.nextInt(classes.length)];
        Dragon dragon = null;
        try {
            dragon = (Dragon) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return dragon.getGeneratedElem();
    }
}
