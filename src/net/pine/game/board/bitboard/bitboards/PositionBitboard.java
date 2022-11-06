package net.pine.game.board.bitboard.bitboards;

import net.pine.game.board.bitboard.Bitboard;

public class PositionBitboard {
	
	public static final long A1 = 0x0000000000000001;
	public static final long A2 = 0x0000000000000002;
	public static final long A3 = 0x0000000000000004;
	public static final long A4 = 0x0000000000000008;
	public static final long A5 = 0x0000000000000010;
	public static final long A6 = 0x0000000000000020;
	public static final long A7 = 0x0000000000000040;
	public static final long A8 = 0x0000000000000080;
	
	public static final long B1 = 0x0000000000000100;
	public static final long B2 = 0x0000000000000200;
	public static final long B3 = 0x0000000000000400;
	public static final long B4 = 0x0000000000000800;
	public static final long B5 = 0x0000000000001000;
	public static final long B6 = 0x0000000000002000;
	public static final long B7 = 0x0000000000004000;
	public static final long B8 = 0x0000000000008000;
	
	public static final long C1 = 0x0000000000010000;
	public static final long C2 = 0x0000000000020000;
	public static final long C3 = 0x0000000000040000;
	public static final long C4 = 0x0000000000080000;
	public static final long C5 = 0x0000000000100000;
	public static final long C6 = 0x0000000000200000;
	public static final long C7 = 0x0000000000400000;
	public static final long C8 = 0x0000000000800000;
	
	public static final long D1 = 0x0000000001000000;
	public static final long D2 = 0x0000000002000000;
	public static final long D3 = 0x0000000004000000;
	public static final long D4 = 0x0000000008000000;
	public static final long D5 = 0x0000000010000000;
	public static final long D6 = 0x0000000020000000;
	public static final long D7 = 0x0000000040000000;
	public static final long D8 = 0x0000000080000000;
	
	public static final long E1 = 0x0000000100000000l;
	public static final long E2 = 0x0000000200000000l;
	public static final long E3 = 0x0000000400000000l;
	public static final long E4 = 0x0000000800000000l;
	public static final long E5 = 0x0000001000000000l;
	public static final long E6 = 0x0000002000000000l;
	public static final long E7 = 0x0000004000000000l;
	public static final long E8 = 0x0000008000000000l;
	
	public static final long F1 = 0x0000010000000000l;
	public static final long F2 = 0x0000020000000000l;
	public static final long F3 = 0x0000040000000000l;
	public static final long F4 = 0x0000080000000000l;
	public static final long F5 = 0x0000100000000000l;
	public static final long F6 = 0x0000200000000000l;
	public static final long F7 = 0x0000400000000000l;
	public static final long F8 = 0x0000800000000000l;
	
	public static final long G1 = 0x0001000000000000l;
	public static final long G2 = 0x0002000000000000l;
	public static final long G3 = 0x0004000000000000l;
	public static final long G4 = 0x0008000000000000l;
	public static final long G5 = 0x0010000000000000l;
	public static final long G6 = 0x0020000000000000l;
	public static final long G7 = 0x0040000000000000l;
	public static final long G8 = 0x0080000000000000l;
	
	public static final long H1 = 0x0100000000000000l;
	public static final long H2 = 0x0200000000000000l;
	public static final long H3 = 0x0400000000000000l;
	public static final long H4 = 0x0800000000000000l;
	public static final long H5 = 0x1000000000000000l;
	public static final long H6 = 0x2000000000000000l;
	public static final long H7 = 0x4000000000000000l;
	public static final long H8 = 0x8000000000000000l;
	
	public static final long A_FILE = 0x0101010101010101l;
	public static final long B_FILE = 0x0202020202020202l;
	public static final long C_FILE = 0x0404040404040404l;
	public static final long D_FILE = 0x0808080808080808l;
	public static final long E_FILE = 0x1010101010101010l;
	public static final long F_FILE = 0x2020202020202020l;
	public static final long G_FILE = 0x4040404040404040l;
	public static final long H_FILE = 0x8080808080808080l;
	
	public static final long RANK_1 = 0x00000000000000FF;
	public static final long RANK_2 = 0x000000000000FF00;
	public static final long RANK_3 = 0x0000000000FF0000;
	public static final long RANK_4 = 0x00000000FF000000;
	public static final long RANK_5 = 0x000000FF00000000l;
	public static final long RANK_6 = 0x0000FF0000000000l;
	public static final long RANK_7 = 0x00FF000000000000l;
	public static final long RANK_8 = 0xFF00000000000000l;
	
	public static final long DARK_SQUARES = 0xAA55AA55AA55AA55l;
	public static final long LIGHT_SQUARES = 0x55AA55AA55AA55AAl;
	
	private static final long[] FILES = new long[] {
			A_FILE, B_FILE, C_FILE, D_FILE,
			E_FILE, F_FILE, G_FILE, H_FILE
	};
	
	private static final long[] RANKS = new long[] {
			RANK_1, RANK_2, RANK_3, RANK_4,
			RANK_5, RANK_6, RANK_7, RANK_8
	};
	
	private static final long[] SQUARES = new long[] {
			A1, A2, A3, A4, A5, A6, A7, A8,
			B1, B2, B3, B4, B5, B6, B7, B8,
			C1, C2, C3, C4, C5, C6, C7, C8,
			D1, D2, D3, D4, D5, D6, D7, D8,
			E1, E2, E3, E4, E5, E6, E7, E8,
			F1, F2, F3, F4, F5, F6, F7, F8,
			G1, G2, G3, G4, G5, G6, G7, G8,
			H1, H2, H3, H4, H5, H6, H7, H8
	};
	
	public static boolean containsDarkSquares(long bb) {
		return Bitboard.intersects(bb, DARK_SQUARES);
	}
	
	public static boolean containsLightSquares(long bb) {
		return Bitboard.intersects(bb, LIGHT_SQUARES);
	}
	
	public static long ofFile(int file) {
		return FILES[file];
	}
	
	public static long ofRank(int rank) {
		return RANKS[rank];
	}
	
	public static long ofSquare(int square) {
		return SQUARES[square];
	}
	
}
