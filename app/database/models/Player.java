package database.models;


public class Player {
    private String playerId;
    private String playerName;
    private Integer playerHp;
    private Integer playerMp;
    private Integer playerExp;
    private Integer playerAtk;
    private Integer playerDef;
    private Integer playerInt;
    private Integer playerAgi;
    private String playerItems;
    private String playerMap;

    public Player() {

    }

    public Player(String playerId, String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerHp() {
        return playerHp;
    }

    public void setPlayerHp(Integer playerHp) {
        this.playerHp = playerHp;
    }

    public Integer getPlayerMp() {
        return playerMp;
    }

    public void setPlayerMp(Integer playerMp) {
        this.playerMp = playerMp;
    }

    public Integer getPlayerExp() {
        return playerExp;
    }

    public void setPlayerExp(Integer playerExp) {
        this.playerExp = playerExp;
    }

    public Integer getPlayerAtk() {
        return playerAtk;
    }

    public void setPlayerAtk(Integer playerAtk) {
        this.playerAtk = playerAtk;
    }

    public Integer getPlayerDef() {
        return playerDef;
    }

    public void setPlayerDef(Integer playerDef) {
        this.playerDef = playerDef;
    }

    public Integer getPlayerInt() {
        return playerInt;
    }

    public void setPlayerInt(Integer playerInt) {
        this.playerInt = playerInt;
    }

    public Integer getPlayerAgi() {
        return playerAgi;
    }

    public void setPlayerAgi(Integer playerAgi) {
        this.playerAgi = playerAgi;
    }

    public String getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(String playerItems) {
        this.playerItems = playerItems;
    }

    public String getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(String playerMap) {
        this.playerMap = playerMap;
    }

}