package _2_java_essential.homework06._3_exceptions.ex6;

class DigitSizeException extends IllegalMonitorStateException {

    DigitSizeException() {
        super();
    }

    DigitSizeException(String s) {
        super(s);
    }
}
