package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;

import java.util.ArrayList;

public class CommandRepeticao extends AbstractCommand {
    private String condicao;
    private ArrayList<AbstractCommand> list = new ArrayList<AbstractCommand>();

    public CommandRepeticao(String condition, ArrayList<AbstractCommand> lista) {
        this.condicao = condition;
        this.list.addAll(lista);
    }

    @Override
    public String generateJavaCode() {
        String loop = "\twhile (" + condicao + ") {\n";
        for (AbstractCommand comando: list)
        {
            loop += "\t" + comando.generateJavaCode();
        }
        loop+= "\t}\n";

        return loop;
    }

    @Override
    public String toString() {
        return "loop [condicao=" + condicao + ", list=" + list + "]";
    }
}
