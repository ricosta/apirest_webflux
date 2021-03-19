package com.apirest.webflux;
/*
import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class DummyData implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    DummyData(PlaylistRepository playlistRepository){
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String ...args) throws Exception{

        //Deleta tudo que tiver na coleção de playlist
        playlistRepository.deleteAll()
                //Insere alguns nomes de playlist atraves de um fluxo de stream
                .thenMany(
                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação", "Java8 ",
                                "Github", "Spring Secutiry", "WebService Restful", "Bean no Spring Framework")
                        .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
                        .flatMap(playlistRepository::save))
                .subscribe(System.out::println);
    }

}
*/