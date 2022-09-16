package PACKAGE_NAME.DesafioPoo;

public class AparelhoTelefonico {

    private int id;
    private String contatos;
    private String registroChamada;
    private String favoritos;

    public AparelhoTelefonico(int id, String contatos, String registroChamada, String favoritos) {
        this.id = id;
        this.contatos = contatos;
        this.registroChamada = registroChamada;
        this.favoritos = favoritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContatos() {
        return contatos;
    }

    public void setContatos(String contatos) {
        this.contatos = contatos;
    }

    public String getRegistroChamada() {
        return registroChamada;
    }

    public void setRegistroChamada(String registroChamada) {
        this.registroChamada = registroChamada;
    }

    public String getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(String favoritos) {
        this.favoritos = favoritos;
    }

    public void ligar(){

    }

    public void atender(){

    }

    public void iniciarCorreioVoz(){

    }

    public void salvarRegistroChamada(){

    }

    public void salvarFavoritos(){

    }
}
