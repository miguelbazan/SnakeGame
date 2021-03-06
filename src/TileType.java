
/**
 * The {@code TileType} class represents the different
 * types of tiles that can be displayed on the screen.
 * @author Miguel Bazan
 * @author Ricardo Licea
 *
 */
public enum TileType {

	Fruit(0),
	
	SnakeHead(1),
	
	SnakeBody(2),
        
        FruitGreen(3),         
        
        FruitBlue(4),          
        
        badFruit(5);

    private int iTipo;
    
    private TileType(int iTipo){
        this.iTipo = iTipo;
    }
   
    public int getTipo(){
        return iTipo;
    }
//To change body of generated methods, choose Tools | Templates.
    void setTile(TileType[] tileType) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
