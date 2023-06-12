package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;

import java.util.ArrayList;
public class CommandRepeticaoFor extends AbstractCommand{
    private String formato;
    private ArrayList<AbstractCommand> lista = new ArrayList<AbstractCommand>();

    public CommandRepeticaoFor(String formato, ArrayList<AbstractCommand> lista) {
        this.formato = formato;
        this.lista.addAll(lista);
    }

    @Override
    public String generateJavaCode() {
        String loop = "\tfor (" + formato + ") {\n";
        for (AbstractCommand comando: lista)
        {
            loop += "\t" + comando.generateJavaCode();
        }
        loop+= "\t}\n";

        return loop;
    }

    @Override
    public String toString() {
        return "loop [formato=" + formato + ", lista=" + lista + "]";
    }
}
