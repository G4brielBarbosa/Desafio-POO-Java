package PACKAGE_NAME.DesafioPoo;

public class ReprodutorMusical {

    private int id;
    private String musica;
    private int volume;
    private String video;

    public ReprodutorMusical(int id, String musica, int volume, String video) {
        this.id = id;
        this.musica = musica;
        this.volume = volume;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void tocar(){

    }

    public void pausar(){

    }

    public String selecionarMusica(){
        return musica;
    }

    public void alterarVolume(){

    }


}
