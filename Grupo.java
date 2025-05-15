package br.ufba.poo;

import java.util.HashSet;
import java.util.Set;

public class Grupo {
    private String nome;
    private Usuario dono;
    private Set<Usuario> membros;

    public Grupo(String nome, Usuario dono) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do grupo não pode ser vazio.");
        }
        if (dono == null) {
            throw new IllegalArgumentException("O grupo deve ter um dono.");
        }
        this.nome = nome;
        this.dono = dono;
        this.membros = new HashSet<>();
        this.membros.add(dono);
    }

    public void adiciona(Usuario usuario) {
        if (usuario != null) {
            membros.add(usuario);
        }
    }

    public boolean remove(Usuario usuario) {
        if (usuario == null || !membros.contains(usuario)) {
            return false;
        }
        if (usuario.equals(dono) || membros.size() == 1) {
            return false;
        }
        return membros.remove(usuario);
    }

    public boolean alteraDono(Usuario novoDono) {
        if (novoDono != null && membros.contains(novoDono)) {
            dono = novoDono;
            return true;
        }
        return false;
    }

    public boolean contemMembro(Usuario usuario) {
        return membros.contains(usuario);
    }

    public Set<Usuario> membros() {
        return new HashSet<>(membros);
    }

    public int tamanho() {
        return membros.size();
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }
}


