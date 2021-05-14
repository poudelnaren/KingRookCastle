import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Board {

    private final List<Tile> gameBoard;

    private Board(Builder builder){
        this.gameBoard = Arrays.asList(createGameBoard(builder));
    }

    private static Tile[] createGameBoard(Builder builder) {
        final Tile[] tiles = new Tile[64];
        for(int i=0;i<64;i++){
            tiles[i] = Tile.createTile(i, builder.boardConfig.get(i));
        }
        return tiles;
    }

    public Tile getTile(final int tileCoordinate){
        return gameBoard.get(tileCoordinate);
    }


    public static Board createStandardBoard(){
        final Builder builder = new Builder();
        builder.setPiece(new Rook(Alliance.BLACK, 0));
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Rook(Alliance.BLACK, 7));

        builder.setPiece(new Rook(Alliance.WHITE, 56));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setPiece(new Rook(Alliance.WHITE, 63));
        return builder.build();

    }

    public static class Builder{

        Map<Integer, Piece> boardConfig;
        Alliance nextMoveMaker;

        public Builder(){}

        public Builder setPiece(final Piece piece) {
            this.boardConfig .put(piece.getPiecePosition(), piece);
            return this;
        }


        public Board build(){
            return new Board(this);
        }

    }
}
