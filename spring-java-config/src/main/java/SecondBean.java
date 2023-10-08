public class SecondBean {

    private FirstBean firstBean;

    public SecondBean(FirstBean firstBean) {
        this.firstBean=firstBean;
    }

    public void setFirstBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    public FirstBean getFirstBean() {
        return firstBean;
    }
}
