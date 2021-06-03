package _2_java_essential.homework07.ex3;

class Fish extends Animal {

    private String fishType;

    Fish(String name, int age, String fishType) {
        super(name, age);
        this.fishType = fishType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fishType='" + fishType + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;

        Fish fish = (Fish) o;
        if(!getName().equals(fish.getName())) {
            return false;
        }
        if(getAge() != fish.getAge()) {
            return false;
        }
        return getFishType().equals(fish.getFishType());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge() * 13;
        result = 31 * result + getFishType().hashCode();
        return result;
    }
}
