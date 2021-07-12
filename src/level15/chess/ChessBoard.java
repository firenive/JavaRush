package level15.chess;

import java.util.ArrayList;

public class ChessBoard {

    public static void drawAllChessItems() {
        ArrayList<ChessItem> items = new ArrayList<>();
        items.add(new King());
        items.add(new Queen());
        items.add(new Bishop());

        for (ChessItem item : items) {
            item.draw();
        }
    }

    public static void main(String[] args) {
        drawAllChessItems();
    }
}
