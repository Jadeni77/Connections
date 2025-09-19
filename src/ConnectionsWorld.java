//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import javalib.impworld.World;
import javalib.impworld.WorldScene;
import javalib.worldimages.FontStyle;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;

public class ConnectionsWorld extends World {
  public int windowWidth;
  public int windowHeight;
  public final int cellSize;
  public final int gridWidth;
  protected final int gridHeight;
  public final int grid_Offset_X;
  protected final int grid_Offset_Y;
  public final int buttonWidth;
  public final int buttonHeight;
  protected final int buttonSpacing;
  public final int rowHeight;
  public final int topMargin;
  public boolean isGameOver;
  public String gameOverMessage;
  public boolean hintBool;
  public String hintMessage;
  public boolean isWin;
  public String winMessage;
  public ArrayList<Word> words;
  public ArrayList<Category> solution;
  public int triesLeft;
  public ArrayList<Word> selectedWords;
  public ArrayList<ArrayList<Word>> submittedGroups;
  public Random rand;

  public ConnectionsWorld() {
    this(new Random());
  }

  public ConnectionsWorld(Random rand) {
    this.windowWidth = 800;
    this.windowHeight = 500;
    this.cellSize = 180;
    this.gridWidth = 4 * this.cellSize;
    this.gridHeight = 4 * this.cellSize;
    this.grid_Offset_X = 40;
    this.grid_Offset_Y = 40;
    this.buttonWidth = 180;
    this.buttonHeight = 40;
    this.buttonSpacing = 30;
    this.rowHeight = 70;
    this.topMargin = 10;
    this.isGameOver = false;
    this.gameOverMessage = "";
    this.hintBool = false;
    this.hintMessage = "";
    this.isWin = false;
    this.winMessage = "";
    this.rand = rand;
    ArrayList<Category> puzzle = this.getRandomPuzzle();
    this.words = this.createShuffleWord(puzzle);
    this.solution = puzzle;
    this.triesLeft = 4;
    this.selectedWords = new ArrayList();
    this.submittedGroups = new ArrayList();
  }

  public ArrayList<Category> getRandomPuzzle() {
    ArrayList<ArrayList<Category>> puzzle = new ArrayList();
    puzzle.add(new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Fruits", new ArrayList(Arrays.asList("Apple", "Banana", "Cherry", "Durian"))), new Category(Color.GREEN, "Transportation", new ArrayList(Arrays.asList("Car", "Bike", "Bus", "Train"))), new Category(Color.BLUE, "Animals", new ArrayList(Arrays.asList("Dog", "Cat", "Cow", "Pig"))), new Category(new Color(128, 0, 128), "Writing Utensils", new ArrayList(Arrays.asList("Pen", "Pencil", "Eraser", "Ruler"))))));
    puzzle.add(new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Sports", new ArrayList(Arrays.asList("Golf", "Basketball", "Soccer", "Track"))), new Category(Color.GREEN, "Colleges", new ArrayList(Arrays.asList("NYU", "NEU", "MIT", "Harvard"))), new Category(Color.BLUE, "Instruments", new ArrayList(Arrays.asList("Harp", "Piano", "Violin", "Triangle"))), new Category(new Color(128, 0, 128), "Makeup", new ArrayList(Arrays.asList("Concealer", "Blush", "Lipstick", "Highlighter"))))));
    puzzle.add(new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Chips", new ArrayList(Arrays.asList("Lays", "Ruffles", "Doritos", "Utz"))), new Category(Color.GREEN, "Flowers", new ArrayList(Arrays.asList("Rose", "Tulip", "Daisy", "Dandellion"))), new Category(Color.BLUE, "States", new ArrayList(Arrays.asList("Utah", "Wisconsin", "New York", "Massachusetts"))), new Category(new Color(128, 0, 128), "Shapes", new ArrayList(Arrays.asList("Circle", "Square", "Triangle", "Oval"))))));
    puzzle.add(new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Drinks", new ArrayList(Arrays.asList("Water", "Soda", "Smoothies", "Shakes"))), new Category(Color.GREEN, "Oceans", new ArrayList(Arrays.asList("Atlantic", "Pacific", "Indian", "Southern"))), new Category(Color.BLUE, "Continents", new ArrayList(Arrays.asList("Africa", "Europe", "Australia", "Antartica"))), new Category(new Color(128, 0, 128), "Cars Brands", new ArrayList(Arrays.asList("Kia", "Toyota", "Jaguar", "Lexus"))))));
    puzzle.add(new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Time", new ArrayList(Arrays.asList("Month", "Year", "Day", "Week"))), new Category(Color.GREEN, "Countries", new ArrayList(Arrays.asList("Italy", "Haiti", "Indonesia", "Ghana"))), new Category(Color.BLUE, "Colors", new ArrayList(Arrays.asList("Blue", "Green", "Orange", "Pink"))), new Category(new Color(128, 0, 128), "Math Operations", new ArrayList(Arrays.asList("Add", "Subtract", "Multiply", "Divide"))))));
    return (ArrayList)puzzle.get(this.rand.nextInt(puzzle.size()));
  }

  public ArrayList<Word> createShuffleWord(ArrayList<Category> puzzle) {
    ArrayList<Word> allTheWords = new ArrayList();
    Iterator var4 = puzzle.iterator();

    while(var4.hasNext()) {
      Category cate = (Category)var4.next();
      allTheWords.addAll(cate.wordsFromCategory());
    }

    this.shuffleMethod(allTheWords);

    for(int i = 0; i < allTheWords.size(); ++i) {
      allTheWords.get(i).setGridPosition(i % 4, i / 4);
    }

    return allTheWords;
  }

  public void shuffleMethod(ArrayList<Word> wordList) {
    for(int i = wordList.size() - 1; i > 0; --i) {
      int j = this.rand.nextInt(i + 1);
      Word temp = (Word)wordList.get(i);
      wordList.set(i, (Word)wordList.get(j));
      wordList.set(j, temp);
    }

  }

  public WorldScene makeScene() {
    WorldScene scene = new WorldScene(this.windowWidth, this.windowHeight);
    int yOffset = this.drawSubmittedGroups(scene);
    this.drawRemainingWords(scene, yOffset);
    this.drawControlButtons(scene);
    this.drawTriesLeft(scene);
    this.drawMessages(scene);
    return scene;
  }

  public int drawSubmittedGroups(WorldScene scene) {
    int yPos = this.topMargin;

    for(Iterator var4 = this.submittedGroups.iterator(); var4.hasNext(); yPos += this.rowHeight) {
      ArrayList<Word> group = (ArrayList)var4.next();
      Word first = (Word)group.get(0);
      WorldImage groupBg = first.makeGroupBackground(this.gridWidth, this.rowHeight);
      WorldImage label = first.makeGroupLabel();
      WorldImage wordsText = this.makeWordsText(group);
      scene.placeImageXY(groupBg, this.windowWidth / 2, yPos + 10 + this.cellSize / 2);
      scene.placeImageXY(label, this.windowWidth / 2, yPos + 20 + this.rowHeight);
      scene.placeImageXY(wordsText, this.windowWidth / 2, yPos + 45 + this.rowHeight);
    }

    return yPos;
  }

  public WorldImage makeWordsText(ArrayList<Word> group) {
    String wordsString = "";

    for(int i = 0; i < group.size(); ++i) {
      wordsString = wordsString + ((Word)group.get(i)).makeTextUpperCase("");
      if (i < group.size() - 1) {
        wordsString = wordsString + "   ";
      }
    }

    return new TextImage(wordsString, 16, Color.black);
  }

  public void drawRemainingWords(WorldScene scene, int yOffset) {
    int availableSpaceBottom = this.windowHeight - 150;
    int gridYStart = this.calculateGridYStart(yOffset + this.rowHeight);
    Iterator var6 = this.words.iterator();

    while(var6.hasNext()) {
      Word word = (Word)var6.next();
      if (!this.isSubmitted(word)) {
        Posn pos = word.calculateXY(this.grid_Offset_X, gridYStart, this.cellSize, this.rowHeight);
        if (pos.y < availableSpaceBottom) {
          Color bgColor;
          Color borderColor;
          if (this.selectedWords.contains(word)) {
            bgColor = new Color(255, 213, 128);
            borderColor = Color.orange;
          } else {
            bgColor = new Color(255, 255, 224);
            borderColor = Color.black;
          }

          scene.placeImageXY(word.renderColorAndOverlayGiven(bgColor, borderColor), pos.x, pos.y);
        }
      }
    }

  }

  public void drawControlButtons(WorldScene scene) {
    int buttonY = this.windowHeight - 100;
    this.drawButton(scene, "SHUFFLE", this.windowWidth / 2 - 200, buttonY, new Color(173, 216, 230));
    this.drawButton(scene, "DESELECT ALL", this.windowWidth / 2, buttonY, new Color(173, 216, 230));
    Color submitColor;
    if (this.selectedWords.size() == 4) {
      submitColor = new Color(144, 238, 144);
    } else {
      submitColor = Color.white;
    }

    this.drawButton(scene, "SUBMIT", this.windowWidth / 2 + 200, buttonY, submitColor);
  }

  public void drawButton(WorldScene scene, String text, int x, int y, Color color) {
    WorldImage bg = new RectangleImage(this.buttonWidth, this.buttonHeight, OutlineMode.SOLID, color);
    WorldImage border = new RectangleImage(this.buttonWidth, this.buttonHeight, OutlineMode.OUTLINE, Color.LIGHT_GRAY);
    WorldImage textImage = new TextImage(text, 20.0, FontStyle.BOLD, Color.black);
    WorldImage button = new OverlayImage(textImage, new OverlayImage(bg, border));
    scene.placeImageXY(button, x, y);
  }

  public void drawTriesLeft(WorldScene scene) {
    String face;
    if (this.triesLeft > 2) {
      face = "☺";
    } else {
      face = "☹";
    }

    WorldImage triesImage = new TextImage("TRIES LEFT: " + this.triesLeft + " " + face, 25.0, FontStyle.BOLD, Color.BLUE);
    scene.placeImageXY(triesImage, this.windowWidth / 2, this.windowHeight - 40);
  }

  public void drawMessages(WorldScene scene) {
    if (this.isWin || this.isGameOver) {
      WorldImage overlay = new RectangleImage(this.windowWidth, this.windowHeight, OutlineMode.SOLID, new Color(0, 0, 0, 150));
      scene.placeImageXY(overlay, this.windowWidth / 2, this.windowHeight / 2);
      TextImage gameOverText;
      if (this.isWin) {
        gameOverText = new TextImage(this.winMessage, 40, Color.GREEN);
        scene.placeImageXY(gameOverText, this.windowWidth / 2, this.windowHeight / 2);
      } else if (this.isGameOver) {
        gameOverText = new TextImage(this.gameOverMessage, 40, Color.RED);
        scene.placeImageXY(gameOverText, this.windowWidth / 2, this.windowHeight / 2);
      }
    }

    if (this.hintBool && !this.isWin && !this.isGameOver) {
      WorldImage hintText = new TextImage(this.hintMessage, 20, Color.RED);
      scene.placeImageXY(hintText, this.windowWidth / 2, this.windowHeight / 8);
    }

  }

  public boolean isSubmitted(Word words) {
    Iterator var3 = this.submittedGroups.iterator();

    while(var3.hasNext()) {
      ArrayList<Word> submitGroup = (ArrayList)var3.next();
      if (submitGroup.contains(words)) {
        return true;
      }
    }

    return false;
  }

  public void onKeyEvent(String key) {
    if (key.equals("r")) {
      ArrayList newPuzzle;
      if (this.isGameOver) {
        newPuzzle = this.getRandomPuzzle();
        this.words = this.createShuffleWord(newPuzzle);
        this.solution = newPuzzle;
        this.triesLeft = 4;
        this.selectedWords.clear();
        this.submittedGroups.clear();
        this.isGameOver = false;
        this.gameOverMessage = "";
        this.isWin = false;
        this.winMessage = "";
      } else {
        newPuzzle = this.getRandomPuzzle();
        this.words = this.createShuffleWord(newPuzzle);
        this.solution = newPuzzle;
        this.triesLeft = 4;
        this.selectedWords.clear();
        this.submittedGroups.clear();
        this.isGameOver = false;
        this.gameOverMessage = "";
        this.isWin = false;
        this.winMessage = "";
      }
    }

  }

  public void onMousePressed(Posn pos) {
    if (!this.isGameOver && !this.isWin) {
      this.handleWordSelection(pos);
      this.handleControlButtons(pos);
    }

  }

  public void handleWordSelection(Posn pos) {
    int yOffset = this.topMargin + this.submittedGroups.size() * this.rowHeight;
    int gridYStart = this.calculateGridYStart(yOffset + this.rowHeight);

    for(Iterator var5 = this.words.iterator(); var5.hasNext(); this.checkPartialCategoryMatch()) {
      Word word = (Word)var5.next();
      if (!this.isSubmitted(word)) {
        int xCenter = this.grid_Offset_X + word.gridX * this.cellSize + this.cellSize / 2;
        int yCenter = gridYStart + word.gridY * this.rowHeight + this.rowHeight / 2;
        boolean inWordBox = pos.x >= xCenter - 85 && pos.x <= xCenter + 85 && pos.y >= yCenter - 25 && pos.y <= yCenter + 25;
        if (inWordBox) {
          this.toggleSelection(word);
        }
      }
    }

  }

  public void checkPartialCategoryMatch() {
    this.hintBool = false;
    if (this.selectedWords.size() == 3) {
      Iterator var2 = this.solution.iterator();

      while(var2.hasNext()) {
        Category group = (Category)var2.next();
        int matchCount = 0;
        Iterator var5 = this.selectedWords.iterator();

        while(var5.hasNext()) {
          Word word = (Word)var5.next();
          if (word.belongsToCategory(group)) {
            ++matchCount;
          }
        }

        if (matchCount == 3) {
          this.hintBool = true;
          this.hintMessage = "You're close! 3/4 words from " + group.makeLabelUppercase("");
          return;
        }
      }
    }

  }

  public int calculateGridYStart(int yOffset) {
    int availableSpaceBottom = this.windowHeight - 160;
    int totalGridHeight = this.rowHeight * 4;
    int gridYStart = yOffset + (this.windowHeight - yOffset - totalGridHeight) / 2;
    if (gridYStart + totalGridHeight > availableSpaceBottom) {
      gridYStart = availableSpaceBottom - totalGridHeight;
      if (gridYStart < yOffset) {
        gridYStart = yOffset;
      }
    }

    return gridYStart;
  }

  public void toggleSelection(Word word) {
    if (this.selectedWords.contains(word)) {
      this.selectedWords.remove(word);
    } else if (this.selectedWords.size() < 4) {
      this.selectedWords.add(word);
    }

  }

  public void handleControlButtons(Posn pos) {
    int buttonY = this.windowHeight - 100;
    if (this.checkButtonClick(pos, this.windowWidth / 2 - 200, buttonY)) {
      this.shuffleUnsubmittedWords();
    }

    if (this.checkButtonClick(pos, this.windowWidth / 2, buttonY)) {
      this.selectedWords.clear();
    }

    if (this.checkButtonClick(pos, this.windowWidth / 2 + 200, buttonY)) {
      this.processSubmission();
    }

  }

  public boolean checkButtonClick(Posn pos, int centerX, int centerY) {
    int halfW = this.buttonWidth / 2;
    int halfH = this.buttonHeight / 2;
    return pos.x >= centerX - halfW && pos.x <= centerX + halfW && pos.y >= centerY - halfH && pos.y <= centerY + halfH;
  }

  public void shuffleUnsubmittedWords() {
    ArrayList<Word> submit = new ArrayList();
    ArrayList<Word> unsubmit = new ArrayList();
    Iterator var4 = this.words.iterator();

    while(var4.hasNext()) {
      Word word = (Word)var4.next();
      if (this.isSubmitted(word)) {
        submit.add(word);
      } else {
        unsubmit.add(word);
      }
    }

    this.shuffleMethod(unsubmit);
    int positionIndex = 0;

    for(Iterator var5 = unsubmit.iterator(); var5.hasNext(); ++positionIndex) {
      Word word = (Word)var5.next();
      int newX = positionIndex % 4;
      int newY = positionIndex / 4;
      word.setGridPosition(newX, newY);
    }

    this.words = new ArrayList();
    this.words.addAll(submit);
    this.words.addAll(unsubmit);
  }

  public void processSubmission() {
    if (this.selectedWords.size() == 4) {
      boolean allSameCate = ((Word)this.selectedWords.get(0)).allSameCategory(this.selectedWords);
      if (allSameCate) {
        this.submittedGroups.add(new ArrayList(this.selectedWords));
        this.selectedWords.clear();
        if (this.submittedGroups.size() == 4) {
          this.isWin = true;
          int triesUsed = 4 - this.triesLeft;
          if (triesUsed == 0) {
            this.winMessage = "FLAWLESS VICTORY! Press R to Restart!";
          } else if (triesUsed == 1) {
            this.winMessage = "Expert! 1 try used! Press R to Restart!";
          } else if (triesUsed == 2) {
            this.winMessage = "Great job! 2 tries used! Press R to Restart!";
          } else if (triesUsed == 3) {
            this.winMessage = "Solid win! 3 tries used! Press R to Restart!";
          } else {
            this.winMessage = "Completed with 4 tries! Press R to Restart!";
          }
        } else {
          this.reorganizeUnsubmitWords();
        }
      } else {
        --this.triesLeft;
        this.selectedWords.clear();
        if (this.triesLeft <= 0) {
          this.isGameOver = true;
          this.gameOverMessage = "GAME OVER! Press R to restart!";
        }
      }

    }
  }

  public void reorganizeUnsubmitWords() {
    ArrayList<Word> unsubmit = new ArrayList();
    Iterator var3 = this.words.iterator();

    while(var3.hasNext()) {
      Word word = (Word)var3.next();
      if (!this.isSubmitted(word)) {
        unsubmit.add(word);
      }
    }

    int index = 0;

    for(Iterator var4 = unsubmit.iterator(); var4.hasNext(); ++index) {
      Word word = (Word)var4.next();
      word.setGridPosition(index % 4, index / 4);
    }

  }
}
