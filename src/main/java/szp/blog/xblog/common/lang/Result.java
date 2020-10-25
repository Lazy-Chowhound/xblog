package szp.blog.xblog.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private String code;
    private String message;
    private Object data;

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode("0");
        result.setMessage("操作成功");
        result.setData(data);
        return result;
    }

    public static Result success(String message, Object data) {
        Result result = new Result();
        result.setCode("0");
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static Result fail(String message) {
        Result m = new Result();
        m.setCode("-1");    
        m.setData(null);
        m.setMessage(message);
        return m;
    }

    public static Result fail(String message, Object data) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMessage(message);
        return m;
    }
}
