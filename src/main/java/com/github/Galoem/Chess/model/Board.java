package com.github.Galoem.Chess.model;

import lombok.Data;

import static com.github.Galoem.Chess.model.Piece.Category.*;
import static com.github.Galoem.Chess.model.Piece.Category.BISHOP;
import static com.github.Galoem.Chess.model.Piece.Color.BLACK;
import static com.github.Galoem.Chess.model.Piece.Color.WHITE;

@Data
public class Board {

    public static final int BOARD_HEIGHT = 8;
    public static final int BOARD_WIDTH = 8;

    private Piece[][] board;

    public Board() {
        board = new Piece[BOARD_HEIGHT][BOARD_WIDTH];
        // set Pawns
        for (int i = 0; i < BOARD_WIDTH; i++) {
            setBoardPosition(new Position(1, i), new Piece(PAWN, WHITE));
            setBoardPosition(new Position(6, i), new Piece(PAWN, BLACK));
        }
        // set Rooks
        setBoardPosition(new Position(0, 0), new Piece(ROOK, WHITE));
        setBoardPosition(new Position(0, 7), new Piece(ROOK, WHITE));
        setBoardPosition(new Position(7, 0), new Piece(ROOK, BLACK));
        setBoardPosition(new Position(7, 7), new Piece(ROOK, BLACK));
        // set Bishops
        setBoardPosition(new Position(0, 2), new Piece(BISHOP, WHITE));
        setBoardPosition(new Position(0, 5), new Piece(BISHOP, WHITE));
        setBoardPosition(new Position(7, 2), new Piece(BISHOP, BLACK));
        setBoardPosition(new Position(7, 5), new Piece(BISHOP, BLACK));
        // set Knights
        setBoardPosition(new Position(0, 1), new Piece(KNIGHT, WHITE));
        setBoardPosition(new Position(0, 6), new Piece(KNIGHT, WHITE));
        setBoardPosition(new Position(7, 1), new Piece(KNIGHT, BLACK));
        setBoardPosition(new Position(7, 6), new Piece(KNIGHT, BLACK));
        // set queens
        setBoardPosition(new Position(0, 3), new Piece(QUEEN, WHITE));
        setBoardPosition(new Position(7, 3), new Piece(QUEEN, BLACK));
        // set Kings
        setBoardPosition(new Position(0, 4), new Piece(KING, WHITE));
        setBoardPosition(new Position(7, 4), new Piece(KING, BLACK));
    }

    public void setBoardPosition(Position position, Piece piece) {
        board[position.yPos()][position.xPos()] = piece;
    }

    public Piece getBoardPosition(Position position) {
        return board[position.yPos()][position.xPos()];
    }

}