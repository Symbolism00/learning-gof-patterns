package proxy.example2;

public class Main {

    public static void main(String[] args) {

        // CACHE PROXY

        // Para este padrão assume-se que o utilizador pretende fazer o download de
        // diversos vídeos em que alguns deles já poderão ter o seu download
        // realizado. Como a operação de download é muito demorada é necessário
        // ter uma classe intermédia (proxy) entre a comunicação do código cliente
        // com o método de download do vídeo, que permite verificar previamente se o
        // vídeo já não foi descarregado. Assim, caso o tenha sido, esta operação
        // não é realizada porque é desnecessária (os vídeos são descarregados)
        // apenas uma única vez

        // criação do proxy que serve de cache
        ProxyDownloadVideo downloadVideo = new CacheDownloadVideoProxy();
        // pedido de download do vídeo Teste A. Como é a primeira vez que este pedido
        // foi feito, então o vídeo vai ser descarregado
        Video video = downloadVideo.downloadVideo("Test A", 5476.4378);
        System.out.println(video + "\n");

        // pedido de download do vídeo Teste B. Como é a primeira vez que este pedido
        // foi feito, então o vídeo vai ser descarregado
        video = downloadVideo.downloadVideo("Test B", 34345.4837);
        System.out.println(video + "\n");

        // pedido de download do vídeo Teste A. Como este vídeo já foi descarregado, então
        // vai existir no cache proxy (lista de vídeos) e apenas é retornado.
        // O processo de download não ocorre
        video = downloadVideo.downloadVideo("Test A", 5476.4378);
        System.out.println(video + "\n");

        // pedido de download do vídeo Teste C. Como é a primeira vez que este pedido
        // foi feito, então o vídeo vai ser descarregado
        video = downloadVideo.downloadVideo("Test C", 12236.10039);
        System.out.println(video + "\n");

        // pedido de download do vídeo Teste A. Como este vídeo já foi descarregado, então
        // vai existir no cache proxy (lista de vídeos) e apenas é retornado.
        // O processo de download não ocorre
        video = downloadVideo.downloadVideo("Test A", 5476.4378);
        System.out.println(video);
    }
}
