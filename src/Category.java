import java.awt.*;
import java.util.ArrayList;

import javalib.worldimages.FontStyle;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;

// represents a category
public class Category {
  private Color color;
  private String label;
  private ArrayList<String> word;

  public Category(Color color, String label, ArrayList<String> word) {
    this.color = color;
    this.label = label;
    this.word = word;
  }

  // creates a list of words from this category
  public ArrayList<Word> wordsFromCategory() {
    ArrayList<Word> result = new ArrayList<Word>();
    for (String wordText : this.word) {
      result.add(new Word(wordText, this));
    }
    return result;
  }

  // creates a text image for the label
  public WorldImage makeLabelImage() {
    return new TextImage(this.label.toUpperCase(), 16, FontStyle.BOLD, Color.black);
  }

  // creates a text image for the background
  public WorldImage makeBackgroundImage(int width, int height) {
    return new RectangleImage(width, height, OutlineMode.SOLID, this.color);
  }

  //make this label uppercase and concatenate to the given String
  public String makeLabelUppercase(String str) {
    return str.concat(this.label.toUpperCase());
  }
}