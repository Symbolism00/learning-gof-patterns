package proxy.example2;

import java.util.ArrayList;
import java.util.List;

// proxy concreto que representa uma cache de videos que já têm o
// seu download realizado
public class CacheDownloadVideoProxy implements ProxyDownloadVideo {

    // lista de videos que em o que o seu download já foi realizado
    public List<Video> cachedVideo;
    // classe responsável pelo download dos vídeos
    private DownloadVideo downloadVideo;

    public CacheDownloadVideoProxy(){
        this.cachedVideo = new ArrayList<>();
        this.downloadVideo = new DownloadVideo();
    }

    // método proxy que primeiramente verifica se o download do vídeo já não
    // foi feito, se o seu download já estiver feito, então apenas retorna o vídeo
    // já criado, se o seu download não tiver sido feito, então faz o download
    // do vídeo e retorna o novo vídeo criado
    public Video downloadVideo(String name, double size){
        // por cada vídeo que se encontra em cache (numa lista de vídeos)
        for(Video video :  cachedVideo){
            // verifica se o download do vídeo já não foi feito
            if(video.getName().equals(name)){
                return video; // se tiver feito o download então retorna o vídeo
            }
        }
        // se o seu download não tiver sido feito então faz o download
        Video newVideo = downloadVideo.downloadVideo(name, size);
        // adiciona-o à lista de vídeos (cache de vídeos)
        cachedVideo.add(newVideo);
        return newVideo; // retorna o novo vídeo
    }
}
