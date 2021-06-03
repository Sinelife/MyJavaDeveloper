package _2_java_essential.homework07.ex3;

class Cat extends Animal {

    private String catBreedName;

    Cat(String name, int age, String catBreedName) {
        super(name, age);
        this.catBreedName = catBreedName;
    }

    public String getCatBreedName() {
        return catBreedName;
    }

    public void setCatBreedName(String catBreedName) {
        this.catBreedName = catBreedName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreedName='" + catBreedName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;
        if(!getName().equals(cat.getName())) {
            return false;
        }
        if(getAge() != cat.getAge()) {
            return false;
        }
        return getCatBreedName() != null ? getCatBreedName().equals(cat.getCatBreedName()) : cat.getCatBreedName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge() * 13;
        result = 31 * result + getCatBreedName().hashCode();
        return result;
    }
}
