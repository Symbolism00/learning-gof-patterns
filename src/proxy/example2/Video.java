package proxy.example2;

// classe que representa um vídeo. Assume-se que todos os videos são ficheiros
// muito grandes pelo que é necessário ter um tratamento especial quando se
// realiza os seus respetivos downloads
public class Video {

    // cada video é caracterizado por um nome e tamanho
    private String name;
    private double size;

    public Video(String name, double size){
        this.name = name;
        this.size = size;
    }

    // método que retorna informação sobre o vídeo
    @Override
    public String toString(){
        return "Video: " + name + " with " + size + " MB";
    }

    // método que retorna o nome do vídeo
    public String getName() {
        return name;
    }
}
