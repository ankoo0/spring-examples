public class FirstBean {

    private String msg;

    public FirstBean(String msg) {
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "FirstBean{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
