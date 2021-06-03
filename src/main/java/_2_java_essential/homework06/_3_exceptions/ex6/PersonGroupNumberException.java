package _2_java_essential.homework06._3_exceptions.ex6;

class PersonGroupNumberException extends IllegalMonitorStateException {

    PersonGroupNumberException() {
        super();
    }

    PersonGroupNumberException(String s) {
        super(s);
    }
}
