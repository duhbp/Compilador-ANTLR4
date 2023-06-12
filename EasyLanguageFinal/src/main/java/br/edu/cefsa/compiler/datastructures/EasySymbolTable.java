package br.edu.cefsa.compiler.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class EasySymbolTable {

    private HashMap<String, EasySymbol> map;

    public EasySymbolTable() {
        map = new HashMap<String, EasySymbol>();

    }

    public void add(EasySymbol symbol) {
        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }

    public EasySymbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<EasySymbol> getAll() {
        ArrayList<EasySymbol> lista = new ArrayList<EasySymbol>();
        for (EasySymbol symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }

}
