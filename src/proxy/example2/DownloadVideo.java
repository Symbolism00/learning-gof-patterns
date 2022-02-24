package proxy.example2;

// classe que representa um video downloader
public class DownloadVideo implements ProxyDownloadVideo {

    // quando o nome de um video e o seu respetivo tamanho é passado
    // por parâmetro, este método realiza o download do vídeo.
    // Importa salientar que todos os vídeos são muito grandes, logo
    // o download demora muito tempo
    @Override
    public Video downloadVideo(String name, double size) {
        System.out.println("Downloading the video " + name);
        // 5 segundos para fazer download do vídeo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of download of the video " + name);
        // download realizado e por isso cria um novo video e retorna-o
        return new Video(name, size);
    }
}
