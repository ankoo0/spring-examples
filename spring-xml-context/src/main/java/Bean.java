public class Bean {
    private NestedBean nestedBean;
    private String name;

    public Bean(NestedBean nestedBean, String name) {
        this.nestedBean = nestedBean;
        this.name=name;
    }

    public void setNestedBean(NestedBean nestedBean) {
        this.nestedBean = nestedBean;
    }

    public void helloBean(){
        System.out.println("Some Bean Is Ready to Use");
    }


    @Override
    public String toString() {
        return "Bean{" +
                "nestedBean=" + nestedBean +
                ", name='" + name + '\'' +
                '}';
    }
}
