package _2_java_essential.homework03.ex1;

final class Dog extends Animal {
    private String dogBreed;
    private boolean canUnderstandCommands;

    Dog(String name, int age, String dogBreed, boolean canUnderstandCommands) {
        super(name, age);
        this.dogBreed = dogBreed;
        this.canUnderstandCommands = canUnderstandCommands;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isCanUnderstandCommands() {
        return canUnderstandCommands;
    }

    public void setCanUnderstandCommands(boolean canUnderstandCommands) {
        this.canUnderstandCommands = canUnderstandCommands;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                ", canUnderstandCommands=" + canUnderstandCommands +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void sayHello() {
        System.out.println("GAV! GAV!");
    }

    @Override
    int getLegsNum() {
        return 4;
    }
}
