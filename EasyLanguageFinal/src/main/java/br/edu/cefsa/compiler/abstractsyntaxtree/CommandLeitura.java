package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;

public class CommandLeitura extends AbstractCommand {

    private String id;
    private EasyVariable var;

    public CommandLeitura(String id, EasyVariable var) {
        this.id = id;
        this.var = var;
    }

    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return id + "= _key." + (var.getType() == EasyVariable.NUMBER ? "nextDouble();" : "nextLine();");
    }

    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

}
