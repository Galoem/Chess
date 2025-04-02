package com.github.Galoem.Chess.model;

public record Piece(Category category, Color color) {

    public enum Category {
        KING,
        QUEEN,
        ROOK,
        BISHOP,
        KNIGHT,
        PAWN
    }

    public enum Color {
        WHITE,
        BLACK
    }
}
