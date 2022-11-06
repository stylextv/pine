package net.pine.game.board.position;

public class BoardSquare {
	
	public static final int A1 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_1);
	public static final int A2 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_2);
	public static final int A3 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_3);
	public static final int A4 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_4);
	public static final int A5 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_5);
	public static final int A6 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_6);
	public static final int A7 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_7);
	public static final int A8 = fromPosition(BoardFile.A_FILE, BoardRank.RANK_8);
	
	public static final int B1 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_1);
	public static final int B2 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_2);
	public static final int B3 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_3);
	public static final int B4 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_4);
	public static final int B5 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_5);
	public static final int B6 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_6);
	public static final int B7 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_7);
	public static final int B8 = fromPosition(BoardFile.B_FILE, BoardRank.RANK_8);
	
	public static final int C1 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_1);
	public static final int C2 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_2);
	public static final int C3 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_3);
	public static final int C4 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_4);
	public static final int C5 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_5);
	public static final int C6 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_6);
	public static final int C7 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_7);
	public static final int C8 = fromPosition(BoardFile.C_FILE, BoardRank.RANK_8);
	
	public static final int D1 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_1);
	public static final int D2 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_2);
	public static final int D3 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_3);
	public static final int D4 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_4);
	public static final int D5 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_5);
	public static final int D6 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_6);
	public static final int D7 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_7);
	public static final int D8 = fromPosition(BoardFile.D_FILE, BoardRank.RANK_8);
	
	public static final int E1 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_1);
	public static final int E2 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_2);
	public static final int E3 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_3);
	public static final int E4 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_4);
	public static final int E5 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_5);
	public static final int E6 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_6);
	public static final int E7 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_7);
	public static final int E8 = fromPosition(BoardFile.E_FILE, BoardRank.RANK_8);
	
	public static final int F1 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_1);
	public static final int F2 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_2);
	public static final int F3 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_3);
	public static final int F4 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_4);
	public static final int F5 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_5);
	public static final int F6 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_6);
	public static final int F7 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_7);
	public static final int F8 = fromPosition(BoardFile.F_FILE, BoardRank.RANK_8);
	
	public static final int G1 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_1);
	public static final int G2 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_2);
	public static final int G3 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_3);
	public static final int G4 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_4);
	public static final int G5 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_5);
	public static final int G6 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_6);
	public static final int G7 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_7);
	public static final int G8 = fromPosition(BoardFile.G_FILE, BoardRank.RANK_8);
	
	public static final int H1 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_1);
	public static final int H2 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_2);
	public static final int H3 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_3);
	public static final int H4 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_4);
	public static final int H5 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_5);
	public static final int H6 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_6);
	public static final int H7 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_7);
	public static final int H8 = fromPosition(BoardFile.H_FILE, BoardRank.RANK_8);
	
	// TODO rename?
	public static int fromPosition(int file, int rank) {
		return rank * 8 + file;
	}
	
}
