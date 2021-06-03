package _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_4;

class Person {
    private String name;
    private String surname;
    private int age;
    private Job job;


    Person(String name, String surname, int age, String jobName, int salary, double bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = new Job(jobName, salary, bonus);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobName() {
        return job.getJobName();
    }

    public void setJobName(String jobName) {
        this.job.setJobName(jobName);
    }

    public int getSalary() {
        return job.getSalary();
    }

    public void setSalary(int salary) {
        this.job.setSalary(salary);
    }

    public double getBonus() {
        return job.getBonus();
    }

    public void setBonus(double bonus) {
        this.job.setBonus(bonus);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job=" + job +
                '}';
    }


    class Job {
        private String jobName;
        private int salary;
        private double bonus;

        Job(String jobName, int salary, double bonus) {
            this.jobName = jobName;
            this.salary = salary;
            this.bonus = bonus;
        }

        String getJobName() {
            return jobName;
        }

        void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        double getBonus() {
            return bonus;
        }

        void setBonus(double bonus) {
            this.bonus = bonus;
        }


        @Override
        public String toString() {
            return "Job{" +
                    "jobName='" + jobName + '\'' +
                    ", salary=" + salary +
                    ", bonus=" + bonus +
                    '}';
        }
    }
}
