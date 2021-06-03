package _2_java_essential.homework06._3_exceptions.ex7;

class WordLengthException extends IllegalMonitorStateException {

    WordLengthException() {
        super();
    }

    WordLengthException(String s) {
        super(s);
    }

}
