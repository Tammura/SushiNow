package exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{
    private final String message;

    public ResourceNotFoundException(String className, String id) {
        this.message = String.format("Not found resource %s with id %s.", className, id);
    }
}
