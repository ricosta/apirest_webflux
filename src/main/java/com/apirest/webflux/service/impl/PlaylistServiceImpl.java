package com.apirest.webflux.service.impl;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;
import com.apirest.webflux.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    PlaylistRepository repository;


    //Obtem todas as playlists
    @Override
    public Flux<Playlist> findAll() {
        return repository.findAll();
    }


    //Obtem apenas uma playlist
    @Override
    public Mono<Playlist> findById(String id) {
        return repository.findById(id);
    }


    //Salva os dados na base
    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return repository.save(playlist);
    }
}
