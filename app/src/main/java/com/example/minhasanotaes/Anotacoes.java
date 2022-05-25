package com.example.minhasanotaes;

import android.content.Context;
import android.content.SharedPreferences;

public class Anotacoes {

    private Context context;
    private SharedPreferences preferences;

    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";
    private SharedPreferences.Editor editor;

    public Anotacoes(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }
    public String recuperarAnotacao(){
        return preferences.getString(CHAVE_NOME, "");
    }
}
