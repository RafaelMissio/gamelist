package br.com.missio.gamelist.repository;

import br.com.missio.gamelist.entites.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    // Additional query methods can be defined here if needed
}
