package com.github.Galoem.Chess;

import com.github.Galoem.Chess.model.Board;
import com.github.Galoem.Chess.view.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);

		Board board = new Board();
		Printer printer = new Printer();
		printer.printBoard(board);
	}

}
