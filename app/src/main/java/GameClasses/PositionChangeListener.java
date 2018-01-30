package GameClasses;


public interface PositionChangeListener {
    void moveRight();

    void moveLeft();

    void jump();

    void sitDown();

    void stopMoveHor();

    void stopMoveVer();
}
