package com.rafaelferreirac.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelferreirac.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
