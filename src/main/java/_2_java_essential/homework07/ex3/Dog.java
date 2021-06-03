package _2_java_essential.homework07.ex3;

class Dog extends Animal {

    private String dogBreedName;
    private double weight;

    Dog(String name, int age, String dogBreedName, double weight) {
        super(name, age);
        this.dogBreedName = dogBreedName;
        this.weight = weight;
    }

    public String getDogBreedName() {
        return dogBreedName;
    }

    public void setDogBreedName(String dogBreedName) {
        this.dogBreedName = dogBreedName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreedName='" + dogBreedName + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;
        if(!getName().equals(dog.getName())) {
            return false;
        }
        if(getAge() != dog.getAge()) {
            return false;
        }
        return getDogBreedName() != null ? getDogBreedName().equals(dog.getDogBreedName()) : dog.getDogBreedName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge() * 13;
        result = 31 * result + getDogBreedName().hashCode();
        return result;
    }
}
