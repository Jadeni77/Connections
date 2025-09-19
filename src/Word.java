import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

import javalib.worldimages.FontStyle;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;

public class Word {
  private final String text;
  protected int gridX;
  protected int gridY;
  private final Category category;

  public Word(String text, Category category) {
    this.text = text;
    this.gridX = 0;
    this.gridY = 0;
    this.category = category;
  }

  public Word(String text, int gridX, int gridY, Category category) {
    this.text = text;
    this.gridX = gridX;
    this.gridY = gridY;
    this.category = category;
  }

  public void setGridPosition(int x, int y) {
    this.gridX = x;
    this.gridY = y;
  }

  public WorldImage renderColorAndOverlayGiven(Color bgColor, Color borderColor) {
    WorldImage textImage = new TextImage(this.text.toUpperCase(), 18.0, FontStyle.BOLD, Color.black);
    WorldImage bg = new RectangleImage(170, 50, OutlineMode.SOLID, bgColor);
    WorldImage border = new RectangleImage(170, 50, OutlineMode.OUTLINE, borderColor);
    return new OverlayImage(textImage, new OverlayImage(bg, border));
  }

  public WorldImage makeGroupLabel() {
    return this.category.makeLabelImage();
  }

  public WorldImage makeGroupBackground(int width, int height) {
    return this.category.makeBackgroundImage(width, height);
  }

  public String makeTextUpperCase(String str) {
    return str.concat(this.text.toUpperCase());
  }

  public Posn calculateXY(int offsetX, int offsetY, int cellSize, int rowHeight) {
    int x = offsetX + this.gridX * cellSize + cellSize / 2;
    int y = offsetY + this.gridY * rowHeight + rowHeight / 2;
    return new Posn(x, y);
  }

  public boolean allSameCategory(ArrayList<Word> wordList) {
    if (wordList.isEmpty()) {
      return false;
    } else {
      Category firstCate = this.category;
      Iterator var4 = wordList.iterator();

      while (var4.hasNext()) {
        Word words = (Word) var4.next();
        if (words.category != firstCate) {
          return false;
        }
      }

      return true;
    }
  }

  public boolean belongsToCategory(Category thatCategory) {
    return this.category == thatCategory;
  }
}
