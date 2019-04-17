package com.Anna.Memento_10;

public class GameService {

    private Board board = new Board();
    private Memento memento = new Memento(board.getGameFieldMap());

    public void gameMove(int playerNumber, int xPoint, int yPoint) {
        board.move(playerNumber, xPoint, yPoint);
    }

    public void saveMove() {
        memento = board.save();
    }

    public void undoMove() {
        board.undo(memento);
    }

    public boolean gameCheckout(int playerNumber, int xPoint, int yPoint) {
        String cell = null;
        switch (playerNumber){
            case 1:
                cell = "x";
                break;
            case 2:
                cell = "0";
                break;
        }
        if (checkVertical(xPoint, cell) || checkHorizontal(yPoint, cell) || checkDiagonal(xPoint, yPoint, cell)) {
            System.out.println("Game is Finish, win player " + playerNumber);
            return true;
        }
        return false;
    }

    private boolean checkVertical(int xPoint, String cell) {
        for (int i = 1; i <= 3 ; i++) {
            Point checkPoint = new Point(xPoint, i);
            String checkCell = board.getGameFieldMap().get(checkPoint);
            if (checkCell == null || !checkCell.equals(cell)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkHorizontal(int yPoint, String check) {
        for (int i = 1; i <= 3 ; i++) {
            String checkCell = board.getGameFieldMap().get(new Point(i, yPoint));
            if (checkCell == null || !checkCell.equals(check)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(int xPoint, int yPoint, String cell) {
        if (xPoint != yPoint) {
            return false;
        }
        for (int i = 1; i <= 3 ; i++) {
        String checkCell = board.getGameFieldMap().get(new Point(i, i));
            if (checkCell == null || !checkCell.equals(cell)){
                return false;
            }
        }
        return true;
    }
}
