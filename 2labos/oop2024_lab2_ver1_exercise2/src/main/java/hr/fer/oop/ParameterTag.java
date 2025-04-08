package hr.fer.oop;

public class ParameterTag extends TaskTag {
    private String parameter;

    public ParameterTag(String name, String parameter) {
        super(name);
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return super.toString()+"("+parameter+")";
    }
}