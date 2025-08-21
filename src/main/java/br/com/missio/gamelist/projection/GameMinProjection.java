package br.com.missio.gamelist.projection;

public interface GameMinProjection {
    //SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
    //		tb_game.short_description AS shortDescription, tb_belonging.position
    //		FROM tb_game
    //		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
    //		WHERE tb_belonging.list_id = :listId
    //		ORDER BY tb_belonging.position

    Long getId();

    String getTitle();

    Integer getYear();

    String getImgUrl();

    String getShortDescription();

    Integer getPosition();


}
