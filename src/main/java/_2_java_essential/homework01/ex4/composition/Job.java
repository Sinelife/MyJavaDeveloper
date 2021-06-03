package _2_java_essential.homework01.ex4.composition;

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
