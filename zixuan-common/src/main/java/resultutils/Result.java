package resultutils;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
public class Result<T>{
    @ApiModelProperty(name = "状态码",notes = "成功为200，失败为-1")
   public int code;
    @ApiModelProperty(name = "描述",notes = "错误描述")
   public String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @ApiModelProperty(name = "返回内容")
   public T data;


}
