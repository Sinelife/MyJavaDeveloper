package _2_java_essential.homework06._1_anonymous_classes.ex3;

class TesterEx2 {
    public static void main(String[] args) {
        Student yaroslav = new Student("Yaroslav", "Serzhan", 22);
        yaroslav.getInitializedMarks();
        System.out.println(counter1.getAverageMark(yaroslav));
        System.out.println(counter2.getAverageMark(yaroslav));
        System.out.println(counter3.getAverageMark(yaroslav));
        System.out.println(counter4.getAverageMark(yaroslav));
    }


    private static MarkCounter counter1 = new MarkCounter() {
        @Override
        public String getAverageMark(Student student) {
            return String.valueOf((double) student.getSummaryMark() / student.getMarks().size());
        }
    };


    private static MarkCounter counter2 = new MarkCounter() {
        @Override
        public String getAverageMark(Student student) {
            return String.valueOf((double) student.getSummaryMarkIncludeCredits() / student.getSummaryCreditsNum());
        }
    };


    private static MarkCounter counter3 = new MarkCounter() {
        @Override
        public String getAverageMark(Student student) {
            return String.valueOf(student.getSummaryMarkIncludeCredits() / student.getSummaryCreditsNum());
        }
    };

    private static MarkCounter counter4 = new MarkCounter() {
        @Override
        public String getAverageMark(Student student) {
            double res = (double) student.getSummaryMarkIncludeCredits() / student.getSummaryCreditsNum();
            if(res < 60) {
                return "F";
            } else if (res >= 60 && res < 65) {
                return "E";
            } else if (res >= 65 && res < 71) {
                return "D";
            } else if (res >= 71 && res < 81) {
                return "C";
            } else if (res >= 81 && res < 91) {
                return "B";
            } else if (res >= 91 && res <= 100) {
                return "A";
            }
            throw new IllegalMonitorStateException("Такой оценки не существует");
        }
    };
}
