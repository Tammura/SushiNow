package exception;

import lombok.Getter;

@Getter
public class ConstrainsViolationException extends RuntimeException{
    private final String message;

    public ConstrainsViolationException(String className) {
        this.message = String.format("ConstrainsViolationException for class %s", className);
    }

}
