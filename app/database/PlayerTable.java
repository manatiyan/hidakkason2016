package database;

import play.db.Database;
import utils.Logger;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import database.models.Player;

import java.sql.*;

@Singleton
public class PlayerTable {
    
    @Inject
    Database db;
    
    private static final String selectUser = "SELECT user.id AS id, " +
            "user.username AS username, " +
            "user.password AS password, " +
            "user.last_active AS last_active " +
            "FROM user " +
            "WHERE user.username = ?;";

    private static final String updateLastActive = "UPDATE user " +
            "SET user.last_active = ? " +
            "WHERE user.id = ?;";

    private static final String insertUser = "INSERT INTO user (username, password, last_active) " +
            "VALUES (?, ?, ?);";

    public Player getPlayer(String playerId) {
        Connection connection = db.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        Player player = null;

        try {
            statement = connection.prepareStatement(selectUser);
            statement.setString(1, playerId);
            result = statement.executeQuery();
            if (result.next()) {
                player = new Player();
                player.setPlayerId(result.getString("playerId"));
                //player.setUsername(result.getString("username"));
                //player.setPasswordHash(result.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.error("Error in UserTable.getUser", ex);
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
                connection.close();
            } catch (SQLException ex) {
                Logger.error("Error while closing connection in UserTable.getUser", ex);
            }
        }

        return player;
    }

}
