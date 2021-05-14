public class CastlePlayer {

    protected final Board board;

    public CastlePlayer(Board board) {
        this.board = board;
    }


    public Boolean checkBlackKingSideCastle(){

        //Black King Side Castle
        if(!this.board.getTile(5).isTileOccupied() && !this.board.getTile(6).isTileOccupied()) {
            final Tile rookTile = this.board.getTile(7);
            if(rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()){
                return true;

                }
            }
        return false;
        }

    public Boolean checkBlackQueenSideCastle(){

        //Black Queen Side Castle
        if(!this.board.getTile(1).isTileOccupied() && !this.board.getTile(2).isTileOccupied()
                && !this.board.getTile(3).isTileOccupied()) {
            final Tile rookTile = this.board.getTile(0);
            if(rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()){

                return true;
            }
        }
        return false;
    }

    public Boolean checkWhiteKingSideCastle(){

        //White King Side Castle
        if(!this.board.getTile(61).isTileOccupied() && !this.board.getTile(62).isTileOccupied()) {
            final Tile rookTile = this.board.getTile(63);
            if(rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()){
                return true;

            }
        }
        return false;
    }

    public Boolean checkWhiteQueenSideCastle(){

        //White Queen Side Castle
        if(!this.board.getTile(59).isTileOccupied() && !this.board.getTile(58).isTileOccupied()
                && !this.board.getTile(57).isTileOccupied()) {
            final Tile rookTile = this.board.getTile(56);
            if(rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()){

                return true;
            }
        }
        return false;
    }





}
