package _2_java_essential.homework08.generics.ex7;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class Creature extends AbstractEntity<Creature> {
    protected String name;
    protected Integer age;
    protected Integer might;

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
        this.might = getCountedMight();
    }

    public Creature() { }

    protected int getCountedMight() {
        return 0;
    }

    @Override
    public int compareTo(Creature o) {
        return age.compareTo(o.age);
    }

    @Override
    public Creature getGeneratedElem()  {
        Class[] classes = {ElysiumCreature.class, InfernalCreature.class, Human.class, Dragon.class};
        Class clazz = classes[random.nextInt(classes.length)];
        Creature creature = null;
        try {
            creature = (Creature) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return creature.getGeneratedElem();
    }
}
