//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javalib.impworld.WorldScene;
import javalib.worldimages.FontStyle;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;
import tester.Tester;

public class ConnectionsTest {
  private ConnectionsWorld world;
  private ConnectionsWorld world2;
  private ConnectionsWorld world3;
  private ConnectionsWorld world4;
  private ConnectionsWorld world5;
  private ConnectionsWorld world6;
  private ConnectionsWorld world7;
  private ConnectionsWorld world8;
  private  ConnectionsWorld world9;
  private  ConnectionsWorld world14;
  private  Word apple;
  private  Word banana;
  private  Word cherry;
  private Word durian;
  private Word car;
  private Word pencil;
  private Word pen;
  private  WorldScene ws = new WorldScene(800, 500);
  private  Category fruits;
  private Category transportation;
  private Category animals;
  private Category writingU;
  private  ArrayList<Word> wordL1;
  private  ArrayList<Word> wordL2;
  private  ArrayList<Word> wordL3;
  private  ArrayList<Word> original;
  private  ArrayList<Word> shuffle1;
  private  ArrayList<Word> shuffle2;
  private  ArrayList<Word> shuffle3;
  private  ArrayList<Word> shuffle4;
  private ArrayList<Word> shuffle5;
  private  ArrayList<Category> set1;
  private ArrayList<Category> set3;
  private ArrayList<Category> set5;

  public ConnectionsTest() {
    this.fruits = new Category(Color.YELLOW, "Fruits", new ArrayList(Arrays.asList("Apple", "Banana", "Cherry", "Durian")));
    this.transportation = new Category(Color.GREEN, "Transportation", new ArrayList(Arrays.asList("Car", "Bike", "Bus", "Train")));
    this.animals = new Category(Color.BLUE, "Animals", new ArrayList(Arrays.asList("Dog", "Cat", "Cow", "Pig")));
    this.writingU = new Category(new Color(128, 0, 128), "Writing Utensils", new ArrayList(Arrays.asList("Pen", "Pencil", "Eraser", "Ruler")));
    this.wordL1 = new ArrayList(Arrays.asList(new Word("Apple", this.fruits)));
    this.wordL2 = new ArrayList(Arrays.asList(new Word("Apple", this.fruits), new Word("Banana", 1, 0, this.fruits)));
    this.wordL3 = new ArrayList(Arrays.asList());
    this.original = new ArrayList(Arrays.asList(new Word("Apple", this.fruits), new Word("Banana", 1, 0, this.fruits), new Word("Cherry", 2, 0, this.fruits), new Word("Durian", 3, 0, this.fruits), new Word("Car", 0, 1, this.transportation), new Word("Bike", 1, 1, this.transportation), new Word("Bus", 2, 1, this.transportation), new Word("Train", 3, 1, this.transportation), new Word("Dog", 0, 2, this.animals), new Word("Cat", 1, 2, this.animals), new Word("Cow", 2, 2, this.animals), new Word("Pig", 3, 2, this.animals), new Word("Pen", 0, 3, this.writingU), new Word("Pencil", 1, 3, this.writingU), new Word("Eraser", 2, 3, this.writingU), new Word("Ruler", 3, 3, this.writingU)));
    this.shuffle1 = new ArrayList(Arrays.asList(new Word("Banana", this.fruits), new Word("Pencil", 1, 0, this.writingU), new Word("Dog", 2, 0, this.animals), new Word("Durian", 3, 0, this.fruits), new Word("Cow", 0, 1, this.animals), new Word("Cat", 1, 1, this.animals), new Word("Apple", 2, 1, this.fruits), new Word("Pig", 3, 1, this.animals), new Word("Cherry", 0, 2, this.fruits), new Word("Bike", 1, 2, this.transportation), new Word("Car", 2, 2, this.transportation), new Word("Train", 3, 2, this.transportation), new Word("Bus", 0, 3, this.transportation), new Word("Eraser", 1, 3, this.writingU), new Word("Ruler", 2, 3, this.writingU), new Word("Pen", 3, 3, this.writingU)));
    this.shuffle2 = new ArrayList(Arrays.asList(new Word("Pig", this.animals), new Word("Bus", 1, 0, this.transportation), new Word("Car", 2, 0, this.transportation), new Word("Banana", 3, 0, this.fruits), new Word("Cat", 0, 1, this.animals), new Word("Pen", 1, 1, this.writingU), new Word("Ruler", 2, 1, this.writingU), new Word("Train", 3, 1, this.transportation), new Word("Eraser", 0, 2, this.writingU), new Word("Dog", 1, 2, this.animals), new Word("Pencil", 2, 2, this.writingU), new Word("Apple", 3, 2, this.fruits), new Word("Cherry", 0, 3, this.fruits), new Word("Bike", 1, 3, this.transportation), new Word("Cow", 2, 3, this.animals), new Word("Durian", 3, 3, this.fruits)));
    this.shuffle3 = new ArrayList(Arrays.asList(new Word("Eraser", this.writingU), new Word("Pencil", 1, 0, this.writingU), new Word("Pig", 2, 0, this.animals), new Word("Bike", 3, 0, this.transportation), new Word("Bus", 0, 1, this.transportation), new Word("Dog", 1, 1, this.animals), new Word("Cherry", 2, 1, this.fruits), new Word("Durian", 3, 1, this.fruits), new Word("Cow", 0, 2, this.animals), new Word("Train", 1, 2, this.transportation), new Word("Pen", 2, 2, this.writingU), new Word("Cat", 3, 2, this.animals), new Word("Car", 0, 3, this.transportation), new Word("Banana", 1, 3, this.fruits), new Word("Ruler", 2, 3, this.writingU), new Word("Apple", 3, 3, this.fruits)));
    this.shuffle4 = new ArrayList(Arrays.asList(new Word("Car", this.transportation), new Word("Bus", 1, 0, this.transportation), new Word("Pen", 2, 0, this.writingU), new Word("Train", 3, 0, this.transportation), new Word("Eraser", 0, 1, this.writingU), new Word("Pencil", 1, 1, this.writingU), new Word("Pig", 2, 1, this.animals), new Word("Apple", 3, 1, this.fruits), new Word("Cow", 0, 2, this.animals), new Word("Durian", 1, 2, this.fruits), new Word("Banana", 2, 2, this.fruits), new Word("Ruler", 3, 2, this.writingU), new Word("Cat", 0, 3, this.animals), new Word("Bike", 1, 3, this.transportation), new Word("Cherry", 2, 3, this.fruits), new Word("Dog", 3, 3, this.animals)));
    this.shuffle5 = new ArrayList(Arrays.asList(new Word("Bus", 1, 0, this.transportation), new Word("Durian", 1, 2, this.fruits), new Word("Bike", 1, 3, this.transportation), new Word("Pencil", 1, 1, this.writingU), new Word("Pen", 2, 0, this.writingU), new Word("Car", 0, 0, this.transportation), new Word("Pig", 2, 1, this.animals), new Word("Ruler", 3, 2, this.writingU), new Word("Cherry", 2, 3, this.fruits), new Word("Banana", 2, 2, this.fruits), new Word("Train", 3, 0, this.transportation), new Word("Dog", 3, 3, this.animals), new Word("Apple", 3, 1, this.fruits), new Word("Cat", 0, 3, this.animals), new Word("Eraser", 0, 1, this.writingU), new Word("Cow", 0, 2, this.animals)));
    this.set1 = new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Fruits", new ArrayList(Arrays.asList("Apple", "Banana", "Cherry", "Durian"))), new Category(Color.GREEN, "Transportation", new ArrayList(Arrays.asList("Car", "Bike", "Bus", "Train"))), new Category(Color.BLUE, "Animals", new ArrayList(Arrays.asList("Dog", "Cat", "Cow", "Pig"))), new Category(new Color(128, 0, 128), "Writing Utensils", new ArrayList(Arrays.asList("Pen", "Pencil", "Eraser", "Ruler")))));
    this.set3 = new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Chips", new ArrayList(Arrays.asList("Lays", "Ruffles", "Doritos", "Utz"))), new Category(Color.GREEN, "Flowers", new ArrayList(Arrays.asList("Rose", "Tulip", "Daisy", "Dandellion"))), new Category(Color.BLUE, "States", new ArrayList(Arrays.asList("Utah", "Wisconsin", "New York", "Massachusetts"))), new Category(new Color(128, 0, 128), "Shapes", new ArrayList(Arrays.asList("Circle", "Square", "Triangle", "Oval")))));
    this.set5 = new ArrayList(Arrays.asList(new Category(Color.YELLOW, "Time", new ArrayList(Arrays.asList("Month", "Year", "Day", "Week"))), new Category(Color.GREEN, "Countries", new ArrayList(Arrays.asList("Italy", "Haiti", "Indonesia", "Ghana"))), new Category(Color.BLUE, "Colors", new ArrayList(Arrays.asList("Blue", "Green", "Orange", "Pink"))), new Category(new Color(128, 0, 128), "Math Operations", new ArrayList(Arrays.asList("Add", "Subtract", "Multiply", "Divide")))));
  }

  public void initData() {
    this.world = new ConnectionsWorld(new Random(1L));
    this.world2 = new ConnectionsWorld(new Random(2L));
    this.world3 = new ConnectionsWorld(new Random(3L));
    this.world4 = new ConnectionsWorld(new Random(4L));
    this.world5 = new ConnectionsWorld(new Random(5L));
    this.world6 = new ConnectionsWorld(new Random(6L));
    this.world7 = new ConnectionsWorld(new Random(7L));
    this.world8 = new ConnectionsWorld(new Random(8L));
    this.world9 = new ConnectionsWorld(new Random(9L));
    this.world14 = new ConnectionsWorld(new Random(14L));
    this.apple = new Word("Apple", this.fruits);
    this.banana = new Word("Banana", this.fruits);
    this.cherry = new Word("Cherry", this.fruits);
    this.durian = new Word("Durian", this.fruits);
    this.car = new Word("Car", this.transportation);
    this.pencil = new Word("Pencil", 1, 1, this.writingU);
    this.pen = new Word("Pen", 2, 0, this.writingU);
  }

  public void testGetRandomPuzzle(Tester t) {
    this.initData();
    t.checkExpect(this.world.getRandomPuzzle(), this.set3);
    t.checkExpect(this.world2.getRandomPuzzle(), this.set3);
    t.checkExpect(this.world4.getRandomPuzzle(), this.set5);
  }

  public void testCreateShuffleWord(Tester t) {
    this.initData();
    t.checkExpect(this.world3.createShuffleWord(this.set1), this.shuffle1);
    t.checkExpect(this.world5.createShuffleWord(this.set1), this.shuffle2);
    t.checkExpect(this.world6.createShuffleWord(this.set1), this.shuffle3);
  }

  public void testShuffleMethod(Tester t) {
    this.initData();
    t.checkExpect(this.world14.words, this.shuffle4);
    this.world14.shuffleMethod(this.world14.words);
    t.checkExpect(this.world14.words.equals(this.shuffle4), false);
    t.checkExpect(this.world14.words, this.shuffle5);
  }

  public void testSetGridPosition(Tester t) {
    this.initData();
    t.checkExpect(this.apple, new Word("Apple", 0, 0, this.fruits));
    this.apple.setGridPosition(1, 1);
    t.checkExpect(this.apple, new Word("Apple", 1, 1, this.fruits));
    this.apple.setGridPosition(0, 0);
    t.checkExpect(this.apple.gridX, 0);
    t.checkExpect(this.apple.gridY, 0);
    t.checkExpect(this.apple, new Word("Apple", 0, 0, this.fruits));
  }

  public void testRenderColorAndOverlayGiven(Tester t) {
    this.initData();
    t.checkExpect(this.apple.renderColorAndOverlayGiven(Color.red, Color.black), new OverlayImage(new TextImage("APPLE", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, Color.red), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.black))));
    t.checkExpect(this.banana.renderColorAndOverlayGiven(Color.orange, Color.yellow), new OverlayImage(new TextImage("BANANA", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, Color.orange), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.yellow))));
    t.checkExpect(this.cherry.renderColorAndOverlayGiven(Color.blue, Color.red), new OverlayImage(new TextImage("CHERRY", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, Color.blue), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.red))));
  }

  public void testDrawSubmittedGroups(Tester t) {
    this.initData();
    t.checkExpect(this.world.drawSubmittedGroups(this.ws), 10);
    t.checkExpect(this.world2.drawSubmittedGroups(this.ws), 10);
    t.checkExpect(this.world3.drawSubmittedGroups(this.ws), 10);
  }

  public void testMakeWordsTest(Tester t) {
    this.initData();
    t.checkExpect(this.world9.makeWordsText(this.wordL1), new TextImage("APPLE", 16, Color.black));
    t.checkExpect(this.world9.makeWordsText(this.wordL2), new TextImage("APPLE   BANANA", 16, Color.black));
    t.checkExpect(this.world9.makeWordsText(this.wordL3), new TextImage("", 16, Color.black));
  }

  public void testDrawRemainingWords(Tester t) {
    this.initData();
    this.world8.words = new ArrayList();
    WorldScene expectedScene = new WorldScene(800, 500);
    WorldScene actualScene = new WorldScene(800, 500);
    this.world8.drawRemainingWords(actualScene, 0);
    t.checkExpect(actualScene, expectedScene);
    this.world8.words = new ArrayList(Arrays.asList(this.car));
    WorldScene expectedScene1 = new WorldScene(800, 500);
    expectedScene1.placeImageXY(this.car.renderColorAndOverlayGiven(new Color(255, 255, 224), Color.black), 130, 105);
    WorldScene actualScene1 = new WorldScene(800, 500);
    this.world8.drawRemainingWords(actualScene1, 0);
    t.checkExpect(actualScene1, expectedScene1);
    this.world8.words = new ArrayList(Arrays.asList(this.car, this.pen));
    WorldScene expectedScene2 = new WorldScene(800, 500);
    expectedScene2.placeImageXY(this.car.renderColorAndOverlayGiven(new Color(255, 255, 224), Color.black), 130, 105);
    expectedScene2.placeImageXY(this.pen.renderColorAndOverlayGiven(new Color(255, 255, 224), Color.black), 490, 105);
    WorldScene actualScene2 = new WorldScene(800, 500);
    this.world8.drawRemainingWords(actualScene2, 0);
    t.checkExpect(actualScene2, expectedScene2);
    t.checkExpect(actualScene.equals(actualScene1), false);
    t.checkExpect(actualScene1.equals(actualScene2), false);
  }

  public void testDrawControlButtons(Tester t) {
    this.initData();
    int w = 800;
    int h = 500;
    int buttonY = 400;
    WorldScene buttonsScene = new WorldScene(800, h);
    WorldImage shuffleButton = new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene.placeImageXY(shuffleButton, w / 2 - 200, buttonY);
    WorldImage deselectButton = new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene.placeImageXY(deselectButton, w / 2, buttonY);
    WorldImage submitButton = new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene.placeImageXY(submitButton, w / 2 + 200, buttonY);
    this.world7.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana));
    WorldScene testScene = new WorldScene(800, 500);
    this.world7.drawControlButtons(testScene);
    t.checkExpect(testScene, buttonsScene);
    WorldScene buttonsScene2 = new WorldScene(800, h);
    WorldImage shuffleButton2 = new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene2.placeImageXY(shuffleButton2, w / 2 - 200, buttonY);
    WorldImage deselectButton2 = new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene2.placeImageXY(deselectButton2, w / 2, buttonY);
    WorldImage submitButton2 = new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(144, 238, 144)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene2.placeImageXY(submitButton2, w / 2 + 200, buttonY);
    WorldScene testScene2 = new WorldScene(800, 500);
    this.world7.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.car));
    this.world7.drawControlButtons(testScene2);
    t.checkExpect(testScene2, buttonsScene2);
    WorldScene buttonsScene3 = new WorldScene(800, h);
    WorldImage shuffleButton3 = new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene3.placeImageXY(shuffleButton3, w / 2 - 200, buttonY);
    WorldImage deselectButton3 = new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene3.placeImageXY(deselectButton3, w / 2, buttonY);
    WorldImage submitButton3 = new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    buttonsScene3.placeImageXY(submitButton3, w / 2 + 200, buttonY);
    this.world7.selectedWords = new ArrayList(Arrays.asList());
    WorldScene testScene3 = new WorldScene(800, 500);
    this.world7.drawControlButtons(testScene3);
    t.checkExpect(testScene3, buttonsScene3);
  }

  public void testDrawButton(Tester t) {
    this.initData();
    WorldScene emptyScene = new WorldScene(800, 500);
    WorldScene emptyScene2 = new WorldScene(500, 500);
    WorldScene testScene = new WorldScene(800, 500);
    WorldScene testScene2 = new WorldScene(500, 500);
    WorldImage expectedButton = new OverlayImage(new TextImage("hi", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.black), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    WorldImage expectedButton2 = new OverlayImage(new TextImage("bye", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.black), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY)));
    emptyScene.placeImageXY(expectedButton, 1, 2);
    emptyScene2.placeImageXY(expectedButton2, 1, 2);
    this.world6.drawButton(testScene, "hi", 1, 2, Color.black);
    t.checkExpect(testScene, emptyScene);
    this.world6.drawButton(testScene2, "bye", 1, 2, Color.black);
    t.checkExpect(testScene2, emptyScene2);
    t.checkExpect(testScene2.equals(emptyScene), false);
  }

  public void testDrawTriesLeft(Tester t) {
    this.initData();
    WorldScene emptyScene = new WorldScene(800, 500);
    WorldScene testScene = new WorldScene(800, 500);
    WorldImage expectedImage = new TextImage("TRIES LEFT: 4 ☺", 25.0, FontStyle.BOLD, Color.BLUE);
    emptyScene.placeImageXY(expectedImage, 400, 460);
    this.world5.triesLeft = 4;
    WorldScene testScene2 = new WorldScene(800, 500);
    WorldScene emptyScene2 = new WorldScene(800, 500);
    WorldImage expectedImage2 = new TextImage("TRIES LEFT: 2 ☹", 25.0, FontStyle.BOLD, Color.BLUE);
    emptyScene2.placeImageXY(expectedImage2, 400, 460);
    this.world6.triesLeft = 2;
    this.world5.drawTriesLeft(testScene);
    t.checkExpect(testScene, emptyScene);
    this.world6.drawTriesLeft(testScene2);
    t.checkExpect(testScene2, emptyScene2);
    t.checkExpect(testScene2.equals(emptyScene), false);
  }

  public void testDrawMessages(Tester t) {
    this.initData();
    WorldScene winScene = new WorldScene(800, 500);
    WorldImage overlay = new RectangleImage(800, 500, OutlineMode.SOLID, new Color(0, 0, 0, 150));
    WorldImage winText = new TextImage("YOU WON!", 40, Color.GREEN);
    winScene.placeImageXY(overlay, 400, 250);
    winScene.placeImageXY(winText, 400, 250);
    WorldScene actualWinScene = new WorldScene(800, 500);
    this.world4.isWin = true;
    this.world4.winMessage = "YOU WON!";
    this.world4.windowWidth = 800;
    this.world4.windowHeight = 500;
    this.world4.drawMessages(actualWinScene);
    t.checkExpect(actualWinScene, winScene);
    WorldScene losingScene = new WorldScene(800, 500);
    WorldImage overlay2 = new RectangleImage(800, 500, OutlineMode.SOLID, new Color(0, 0, 0, 150));
    WorldImage losingText = new TextImage("GAME OVER", 40, Color.RED);
    losingScene.placeImageXY(overlay2, 400, 250);
    losingScene.placeImageXY(losingText, 400, 250);
    WorldScene actualLosingScene = new WorldScene(800, 500);
    this.world3.isGameOver = true;
    this.world3.gameOverMessage = "GAME OVER";
    this.world3.windowWidth = 800;
    this.world3.windowHeight = 500;
    this.world3.drawMessages(actualLosingScene);
    t.checkExpect(actualLosingScene, losingScene);
    WorldScene hintScene = new WorldScene(800, 500);
    WorldImage hintText = new TextImage("You got 3 out of the 4!", 20, Color.RED);
    hintScene.placeImageXY(hintText, 400, 62);
    WorldScene actualHintScene = new WorldScene(800, 500);
    this.world2.hintBool = true;
    this.world2.hintMessage = "You got 3 out of the 4!";
    this.world2.windowWidth = 800;
    this.world2.windowHeight = 500;
    this.world2.drawMessages(actualHintScene);
    t.checkExpect(actualHintScene, hintScene);
    t.checkExpect(actualWinScene.equals(hintScene), false);
    t.checkExpect(actualLosingScene.equals(hintScene), false);
  }

  public void testIsSubmitted(Tester t) {
    this.initData();
    t.checkExpect(this.world.isSubmitted(this.apple), false);
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(this.apple, this.banana)), new ArrayList(Arrays.asList(this.cherry, this.car))));
    t.checkExpect(this.world.isSubmitted(this.apple), true);
    t.checkExpect(this.world.isSubmitted(this.pen), false);
  }

  public void testCalculateYStart(Tester t) {
    this.initData();
    t.checkExpect(this.world2.calculateGridYStart(100), 100);
    t.checkExpect(this.world2.calculateGridYStart(10), 60);
    t.checkExpect(this.world2.calculateGridYStart(0), 60);
  }

  public void testMakeScene(Tester t) {
    this.initData();
    this.world.words = new ArrayList(Arrays.asList(this.apple));
    WorldScene scene1 = new WorldScene(800, 500);
    scene1.placeImageXY(new RectangleImage(800, 500, OutlineMode.OUTLINE, Color.black), 400, 250);
    scene1.placeImageXY(new OverlayImage(new TextImage("APPLE", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, new Color(255, 255, 224)), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.black))), 130, 115);
    scene1.placeImageXY(new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 200, 400);
    scene1.placeImageXY(new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 400, 400);
    scene1.placeImageXY(new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 600, 400);
    scene1.placeImageXY(new TextImage("TRIES LEFT: 4 ☺", 25.0, FontStyle.BOLD, Color.BLUE), 400, 460);
    t.checkExpect(this.world.makeScene(), scene1);
    this.banana.setGridPosition(1, 0);
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.banana));
    WorldScene scene2 = new WorldScene(800, 500);
    scene2.placeImageXY(new RectangleImage(800, 500, OutlineMode.OUTLINE, Color.black), 400, 250);
    scene2.placeImageXY(new OverlayImage(new TextImage("APPLE", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, new Color(255, 255, 224)), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.black))), 130, 115);
    scene2.placeImageXY(new OverlayImage(new TextImage("BANANA", 18.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(170, 50, OutlineMode.SOLID, new Color(255, 255, 224)), new RectangleImage(170, 50, OutlineMode.OUTLINE, Color.black))), 310, 115);
    scene2.placeImageXY(new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 200, 400);
    scene2.placeImageXY(new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 400, 400);
    scene2.placeImageXY(new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 600, 400);
    scene2.placeImageXY(new TextImage("TRIES LEFT: 4 ☺", 25.0, FontStyle.BOLD, Color.BLUE), 400, 460);
    t.checkExpect(this.world.makeScene(), scene2);
    this.world.words = new ArrayList();
    this.world.triesLeft = 2;
    WorldScene scene3 = new WorldScene(800, 500);
    scene3.placeImageXY(new RectangleImage(800, 500, OutlineMode.OUTLINE, Color.black), 400, 250);
    scene3.placeImageXY(new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 200, 400);
    scene3.placeImageXY(new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 400, 400);
    scene3.placeImageXY(new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 600, 400);
    scene3.placeImageXY(new TextImage("TRIES LEFT: 2 ☹", 25.0, FontStyle.BOLD, Color.BLUE), 400, 460);
    t.checkExpect(this.world.makeScene(), scene3);
    this.world.isGameOver = true;
    this.world.gameOverMessage = "You Lost the Game!";
    this.world.triesLeft = 0;
    WorldScene scene4 = new WorldScene(800, 500);
    scene4.placeImageXY(new RectangleImage(800, 500, OutlineMode.OUTLINE, Color.black), 400, 250);
    scene4.placeImageXY(new OverlayImage(new TextImage("SHUFFLE", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 200, 400);
    scene4.placeImageXY(new OverlayImage(new TextImage("DESELECT ALL", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, new Color(173, 216, 230)), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 400, 400);
    scene4.placeImageXY(new OverlayImage(new TextImage("SUBMIT", 20.0, FontStyle.BOLD, Color.black), new OverlayImage(new RectangleImage(180, 40, OutlineMode.SOLID, Color.white), new RectangleImage(180, 40, OutlineMode.OUTLINE, Color.LIGHT_GRAY))), 600, 400);
    scene4.placeImageXY(new TextImage("TRIES LEFT: 0 ☹", 25.0, FontStyle.BOLD, Color.BLUE), 400, 460);
    scene4.placeImageXY(new RectangleImage(800, 500, OutlineMode.SOLID, new Color(0, 0, 0, 150)), 400, 250);
    scene4.placeImageXY(new TextImage("You Lost the Game!", 40, Color.RED), 400, 250);
    t.checkExpect(this.world.makeScene(), scene4);
  }

  public void testMakeGroupLabel(Tester t) {
    this.initData();
    t.checkExpect(this.apple.makeGroupLabel(), new TextImage("FRUITS", 16.0, FontStyle.BOLD, Color.black));
    t.checkExpect(this.pen.makeGroupLabel(), new TextImage("WRITING UTENSILS", 16.0, FontStyle.BOLD, Color.black));
    t.checkExpect(this.car.makeGroupLabel(), new TextImage("TRANSPORTATION", 16.0, FontStyle.BOLD, Color.black));
  }

  public void testMakeGroupBackground(Tester t) {
    this.initData();
    t.checkExpect(this.apple.makeGroupBackground(100, 100), new RectangleImage(100, 100, OutlineMode.SOLID, Color.yellow));
    t.checkExpect(this.banana.makeGroupBackground(10, 100), new RectangleImage(10, 100, OutlineMode.SOLID, Color.yellow));
    t.checkExpect(this.pen.makeGroupBackground(100, 100), new RectangleImage(100, 100, OutlineMode.SOLID, new Color(128, 0, 128)));
  }

  public void testMakeTextUppercase(Tester t) {
    this.initData();
    t.checkExpect(this.car.makeTextUpperCase(""), "CAR");
    t.checkExpect(this.banana.makeTextUpperCase(""), "BANANA");
    t.checkExpect(this.pen.makeTextUpperCase(""), "PEN");
  }

  public void testCalculateXY(Tester t) {
    this.initData();
    t.checkExpect(this.apple.calculateXY(0, 0, 0, 0), new Posn(0, 0));
    t.checkExpect(this.apple.calculateXY(10, 100, 50, 100), new Posn(35, 150));
    t.checkExpect(this.apple.calculateXY(10, 10, 10, 10), new Posn(15, 15));
  }

  public void testWordsFromCategory(Tester t) {
    this.initData();
    t.checkExpect(this.fruits.wordsFromCategory(), new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian)));
    t.checkExpect(this.transportation.wordsFromCategory(), new ArrayList(Arrays.asList(this.car, new Word("Bike", this.transportation), new Word("Bus", this.transportation), new Word("Train", this.transportation))));
    t.checkExpect(this.writingU.wordsFromCategory(), new ArrayList(Arrays.asList(new Word("Pen", this.writingU), new Word("Pencil", this.writingU), new Word("Eraser", this.writingU), new Word("Ruler", this.writingU))));
  }

  public void testMakeLabelImage(Tester t) {
    this.initData();
    t.checkExpect(this.fruits.makeLabelImage(), new TextImage("FRUITS", 16.0, FontStyle.BOLD, Color.black));
    t.checkExpect(this.writingU.makeLabelImage(), new TextImage("WRITING UTENSILS", 16.0, FontStyle.BOLD, Color.black));
    t.checkExpect(this.transportation.makeLabelImage(), new TextImage("TRANSPORTATION", 16.0, FontStyle.BOLD, Color.black));
  }

  public void testMakeBackgroundImage(Tester t) {
    this.initData();
    t.checkExpect(this.fruits.makeBackgroundImage(100, 100), new RectangleImage(100, 100, OutlineMode.SOLID, Color.yellow));
    t.checkExpect(this.writingU.makeBackgroundImage(10, 100), new RectangleImage(10, 100, OutlineMode.SOLID, new Color(128, 0, 128)));
    t.checkExpect(this.transportation.makeBackgroundImage(100, 100), new RectangleImage(100, 100, OutlineMode.SOLID, Color.green));
  }

  public void testOnKeyEvent(Tester t) {
    this.initData();
    this.world.isGameOver = true;
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana));
    this.world.triesLeft = 0;
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(this.cherry, this.car))));
    this.world.onKeyEvent("r");
    t.checkExpect(this.world.selectedWords, new ArrayList());
    t.checkExpect(this.world.triesLeft, 4);
    t.checkExpect(this.world.submittedGroups, new ArrayList());
    t.checkExpect(this.world.isGameOver, false);
  }

  public void testOnMousePressed(Tester t) {
    this.initData();
    this.world.words = new ArrayList(Arrays.asList(this.pen));
    this.world.onMousePressed(new Posn(490, 95));
    t.checkExpect(this.world.selectedWords.contains(this.pen), true);
    this.world.onMousePressed(new Posn(400, 400));
    t.checkExpect(this.world.selectedWords.isEmpty(), true);
    this.world.onMousePressed(new Posn(500, 500));
    t.checkExpect(this.world.selectedWords.isEmpty(), true);
  }

  public void testHandleWordSelection(Tester t) {
    this.initData();
    this.world.words = new ArrayList(Arrays.asList(this.pen));
    this.world.handleWordSelection(new Posn(490, 95));
    t.checkExpect(this.world.selectedWords.contains(this.pen), true);
    this.world.handleWordSelection(new Posn(490, 95));
    t.checkExpect(this.world.selectedWords.contains(this.pen), false);
    this.world.handleWordSelection(new Posn(700, 400));
    t.checkExpect(this.world.selectedWords, new ArrayList());
  }

  public void testCheckPartialCategoryMatch(Tester t) {
    this.initData();
    this.world.hintBool = true;
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.car));
    this.world.checkPartialCategoryMatch();
    t.checkExpect(this.world.hintBool, false);
    t.checkExpect(this.world.hintMessage, "");
    this.world.solution = new ArrayList(Arrays.asList(this.fruits));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry));
    this.world.checkPartialCategoryMatch();
    t.checkExpect(this.world.hintBool, true);
    t.checkExpect(this.world.hintMessage, "You're close! 3/4 words from FRUITS");
  }

  public void testToggleSelection(Tester t) {
    this.initData();
    this.world.selectedWords = new ArrayList();
    this.world.toggleSelection(this.apple);
    t.checkExpect(this.world.selectedWords.contains(this.apple), true);
    this.world.toggleSelection(this.apple);
    t.checkExpect(this.world.selectedWords.contains(this.apple), false);
    this.world.toggleSelection(this.apple);
    t.checkExpect(this.world.selectedWords.contains(this.apple), true);
  }

  public void testHandleControlButtons(Tester t) {
    this.initData();
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.banana, this.car, this.pencil));
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(this.car))));
    this.world.handleControlButtons(new Posn(200, 400));
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.car, this.apple, this.banana, this.pencil)));
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.handleControlButtons(new Posn(600, 400));
    t.checkExpect(this.world.winMessage, "FLAWLESS VICTORY! Press R to Restart!");
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple));
    this.world.handleControlButtons(new Posn(400, 400));
    t.checkExpect(this.world.selectedWords, new ArrayList());
  }

  public void testCheckButtonClick(Tester t) {
    this.initData();
    t.checkExpect(this.world.checkButtonClick(new Posn(400, 400), 400, 400), true);
    t.checkExpect(this.world.checkButtonClick(new Posn(511, 400), 400, 400), false);
    t.checkExpect(this.world.checkButtonClick(new Posn(399, 399), 400, 400), true);
  }

  public void testShuffleUnsubmittedWords(Tester t) {
    this.initData();
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.banana));
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(this.apple))));
    this.world.shuffleUnsubmittedWords();
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.apple, this.banana)));
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.banana, this.car, this.pencil));
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(this.car))));
    this.world.shuffleUnsubmittedWords();
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.car, this.apple, this.banana, this.pencil)));
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(Arrays.asList())));
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.car, this.apple, this.banana, this.pencil)));
  }

  public void testProcessSubmission(Tester t) {
    this.initData();
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.processSubmission();
    t.checkExpect(this.world.winMessage, "FLAWLESS VICTORY! Press R to Restart!");
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.triesLeft = 3;
    this.world.processSubmission();
    t.checkExpect(this.world.winMessage, "Expert! 1 try used! Press R to Restart!");
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.triesLeft = 2;
    this.world.processSubmission();
    t.checkExpect(this.world.winMessage, "Great job! 2 tries used! Press R to Restart!");
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.triesLeft = 1;
    this.world.processSubmission();
    t.checkExpect(this.world.winMessage, "Solid win! 3 tries used! Press R to Restart!");
    this.world.submittedGroups = new ArrayList(Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList()));
    this.world.selectedWords = new ArrayList(Arrays.asList(this.apple, this.banana, this.cherry, this.durian));
    this.world.triesLeft = 0;
    this.world.processSubmission();
    t.checkExpect(this.world.winMessage, "Completed with 4 tries! Press R to Restart!");
    this.world.triesLeft = 0;
    this.world.selectedWords = new ArrayList(Arrays.asList(this.car, this.banana, this.cherry, this.apple));
    this.world.processSubmission();
    t.checkExpect(this.world.gameOverMessage, "GAME OVER! Press R to restart!");
    t.checkExpect(this.world.isGameOver, true);
  }

  public void testReorganizeUnsubmitWords(Tester t) {
    this.initData();
    this.world.submittedGroups = new ArrayList();
    this.world.words = this.wordL1;
    this.world.reorganizeUnsubmitWords();
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.apple)));
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.car, this.cherry));
    this.world.reorganizeUnsubmitWords();
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.apple, this.car, new Word("Cherry", 2, 0, this.fruits))));
    this.world.words = new ArrayList(Arrays.asList(this.apple, this.pen, this.car, this.cherry));
    this.world.reorganizeUnsubmitWords();
    t.checkExpect(this.world.words, new ArrayList(Arrays.asList(this.apple, this.pen, this.car, new Word("Cherry", 3, 0, this.fruits))));
  }

  public void testAllSameCategory(Tester t) {
    this.initData();
    t.checkExpect(this.apple.allSameCategory(this.wordL1), true);
    t.checkExpect(this.apple.allSameCategory(new ArrayList(Arrays.asList(this.car))), false);
    t.checkExpect(this.apple.allSameCategory(new ArrayList()), false);
  }

  public void testBelongsToCategory(Tester t) {
    this.initData();
    t.checkExpect(this.apple.belongsToCategory(this.fruits), true);
    t.checkExpect(this.apple.belongsToCategory(this.transportation), false);
    t.checkExpect(this.car.belongsToCategory(this.transportation), true);
  }

  public void testMakeLabelUppercase(Tester t) {
    this.initData();
    t.checkExpect(this.fruits.makeLabelUppercase(""), "FRUITS");
    t.checkExpect(this.writingU.makeLabelUppercase("Category is: "), "Category is: WRITING UTENSILS");
    t.checkExpect(this.writingU.makeLabelUppercase("1. "), "1. WRITING UTENSILS");
  }

  public void testBigBang(Tester t) {
    int WorldWidth = 800;
    int WorldHeight = 500;
    (new ConnectionsWorld()).bigBang(WorldWidth, WorldHeight);
  }
}
