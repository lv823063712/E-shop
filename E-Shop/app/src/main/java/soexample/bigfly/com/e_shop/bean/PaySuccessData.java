package soexample.bigfly.com.e_shop.bean;

/**
 * <p>文件描述：<p>
 * <p>作者：${吕飞}<p>
 * <p>创建时间：2019/1/16   9:25<p>
 * <p>更改时间：2019/1/16   9:25<p>
 * <p>版本号：1<p>
 */

public class PaySuccessData {

    /**
     * message : 支付成功
     * status : 0000
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
