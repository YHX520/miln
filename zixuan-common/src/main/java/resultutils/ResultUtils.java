package resultutils;

public class ResultUtils {

    /**
     * 成功返回
     *
     * @return
     */
    public static Result Success(Object object) {
        Result result = new Result();
        result.code = 200;
        result.msg = "";
        result.data = object;
        return result;
    }

    public static Result Fail(int code, String msg) {
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        return result;
    }
}
