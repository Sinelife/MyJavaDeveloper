package _2_java_essential.homework02.ex1;

final class Cat extends Animal {
    private String catBreed;
    private boolean isGentle;

    Cat(String name, int age, String catBreed, boolean isGentle) {
        super(name, age);
        this.catBreed = catBreed;
        this.isGentle = isGentle;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public boolean isGentle() {
        return isGentle;
    }

    public void setGentle(boolean gentle) {
        isGentle = gentle;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", isGentle=" + isGentle +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void sayHello() {
        System.out.println("Miauuuuu!");
    }
}
