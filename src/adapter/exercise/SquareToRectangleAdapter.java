package adapter.exercise;

class SquareToRectangleAdapter implements Rectangle
{

  private int width;
  private int height;
  public SquareToRectangleAdapter(Square square)
  {
    width = square.side;
    height = square.side;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }
}
