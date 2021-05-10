package Entities;

import Abstracts.GameService;

public class Game implements GameService{
	private int id;
	private String gameName;
	private String gameCategory;
	private double currentPrice;
	private double reelPrice;

public Game(int id,String gameName,String gameCategory,double currentPrice,double reelPrice)
{
	super();
	this.id=id;
	this.gameName=gameName;
	this.gameCategory=gameCategory;
	this.currentPrice=currentPrice;
	this.reelPrice=reelPrice;
}
public int getId() {
	return id;
}
public void setId(int id ) {
	this.id=id;
}
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName=gameName;
}
public String getGameCategory() {
	return gameCategory;
}
public void setGameCategory(String gameCategory) {
	this.gameCategory=gameCategory;
}
public double getCurrentPrice() {
	return currentPrice;
}
public void setCurrentPrice(double currentPrice) {
	this.currentPrice=currentPrice;
}
public double getReelPrice() {
	return reelPrice;
}
public void setReelPrice(double reelPrice) {
	this.reelPrice=reelPrice;
}
@Override
public void save(Game game) {
	// TODO Auto-generated method stub
	
}
@Override
public void updatePrice( Game game) {
	// TODO Auto-generated method stub
	
}
@Override
public void delete( Game game) {
	// TODO Auto-generated method stub
	
}
}