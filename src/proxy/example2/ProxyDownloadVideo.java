package proxy.example2;

// classe abstrata proxy que contém a declaração do método responsável
// por fazer o download do vídeo
public interface ProxyDownloadVideo {

    Video downloadVideo(String name, double size);
}
