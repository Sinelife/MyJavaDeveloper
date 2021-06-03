package _2_java_essential.homework07.ex2;

class MainInfo {

    private String name;
    private String surname;
    private String secondName;

    MainInfo(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MainInfo)) {
            return false;
        }

        MainInfo mainInfo = (MainInfo) o;

        if (getName().equals(mainInfo.getName())) {
            return false;
        }
        if (getSurname().equals(mainInfo.getSurname())) {
            return false;
        }
        if (getSecondName().equals(mainInfo.getSecondName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "MainInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
