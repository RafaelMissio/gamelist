package br.com.missio.gamelist.repository;

import br.com.missio.gamelist.entites.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
