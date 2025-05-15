package br.ufba.poo;

import java.util.Objects;

public class Usuario {
    private String telefone;
    private String nome;
    public Usuario(String telefone, String nome) {
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone não pode ser vazio.");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.telefone = telefone;
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getNome() {
        return nome;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return Objects.equals(telefone, usuario.telefone);
    }
    public int hashCode() {
        return Objects.hash(telefone);
    }
}
