package br.edu.cefsa.compiler.datastructures;

public abstract class EasySymbol {

    protected String name;

    public abstract String generateJavaCode();

    public EasySymbol(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EasySymbol [name=" + name + "]";
    }

}
