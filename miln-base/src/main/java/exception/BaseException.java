package exception;

/**
 * token异常
 */
public class BaseException extends RuntimeException {

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    int code = -1;

    String message;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

}
