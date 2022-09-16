package PACKAGE_NAME.DesafioPoo;

public class NavegadorInternet {

    private int id;
    private int aba;
    private String enderecoPagina;
    private String favoritos;

    public NavegadorInternet(int id, int aba, String enderecoPagina, String favoritos) {
        this.id = id;
        this.aba = aba;
        this.enderecoPagina = enderecoPagina;
        this.favoritos = favoritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAba() {
        return aba;
    }

    public void setAba(int aba) {
        this.aba = aba;
    }

    public String getEnderecoPagina() {
        return enderecoPagina;
    }

    public void setEnderecoPagina(String enderecoPagina) {
        this.enderecoPagina = enderecoPagina;
    }

    public String getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(String favoritos) {
        this.favoritos = favoritos;
    }

    public void exibirPagina(){

    }

    public void adicionarNovaAba(){

    }

    public void atualizarPagina(){

    }
}
