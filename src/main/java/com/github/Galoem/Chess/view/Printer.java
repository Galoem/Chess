package com.github.Galoem.Chess.view;

import com.github.Galoem.Chess.model.Board;
import com.github.Galoem.Chess.model.Piece;
import com.github.Galoem.Chess.model.Piece.Category;
import com.github.Galoem.Chess.model.Piece.Color;
import com.github.Galoem.Chess.model.Position;

public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public void printBoard(Board board) {
        Piece[][] pieces = board.getPieces();
        StringBuilder stringBuilder = new StringBuilder("     A   B   C   D   E   F   G   H ");
        for (int posY = 0; posY < pieces.length; posY++) {
            stringBuilder.append("\n ").append(posY).append(" ");
            for (int posX = 0; posX < pieces[posY].length; posX++) {
                stringBuilder.append(" [");
                Piece unknownPiece = board.getBoardPosition(new Position(posY, posX));
                Color color = unknownPiece != null ? unknownPiece.color() : null;
                switch (color) {
                    case BLACK -> stringBuilder.append(ANSI_RED);
                    case WHITE -> stringBuilder.append(ANSI_GREEN);
                    case null, default -> stringBuilder.append(ANSI_RESET);
                }
                Category category = unknownPiece != null ? unknownPiece.category() : null;
                switch (category) {
                    case KING -> stringBuilder.append("K");
                    case PAWN -> stringBuilder.append("P");
                    case ROOK -> stringBuilder.append("R");
                    case QUEEN -> stringBuilder.append("Q");
                    case BISHOP -> stringBuilder.append("B");
                    case KNIGHT -> stringBuilder.append("H");
                    case null, default -> stringBuilder.append(" ");
                }
                stringBuilder.append(ANSI_RESET).append("]");
            }
        }
        System.out.println(stringBuilder);
    }

}
