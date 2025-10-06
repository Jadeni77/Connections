# Connections

This Connection game project is implemented using Java, with inspiration from [New York Times Connection Puzzle](https://www.nytimes.com/games/connections).

It is built for the Fundamentals of Computer Science II (Fundies II) course, with the given documentation of ImpWorld and the unique tester library. It uses the special big-bang 
syntax to run the program on the local desktop with dependency on mutable states, built-in world classes, and event handlers (mouse events, keyboard events).

## 🎮 GamePlay
* Upon running, the game will generate a 4x4 grid with words on each grid
* The goal is to select 4 words that belong to the same category
* There will be a hint informing the player that three of the four words are chosen correctly
* The game ends if the player either correctly organizes all 4 categories or uses all 4 tries
* After the game ends, the player can press 'R' to restart another round with different words

<img width="400" alt="Connections" src="https://github.com/user-attachments/assets/dde35e5a-b298-4345-a8a4-ef7e0df28323" />
<img width="400" alt="Connections" src="https://github.com/user-attachments/assets/fbd61b07-876f-42b9-aa26-5eeda829eec3" />
<img width="400" alt="Connections" src="https://github.com/user-attachments/assets/dc86ffd8-010b-450f-ac61-2882b4de21b2" />
<img width="400" alt="Connections" src="https://github.com/user-attachments/assets/87245bf6-1c0d-4987-a073-d019e9080bd8" />

## 🛠️ How it works
* **java.awt.color** - Provides the color value and RGB
* **java.util.*** - Uses the ArrayList, Iterator, and Random to manage collections of words as well as to randomize each set of 16 words
* **javalib.impworld** - Provides the global world states, such as **World**, **bigBang**, and **Event Handlers** to exeucte the program as well as handle user interactions
* **javalib.worldimages** - Provides world images for component rendering such as RectangleImage, TextImage,...

## ⚙️ To run the game locally
* In terminal:
   * javac -cp lib/javalib.jar src/*.java
   * java -cp lib/javalib.jar:src App

## 👥 Contributors
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/jadeni77" target="_blank">
        <img src="https://github.com/jadeni77.png" width="60px" style="border-radius:50%;" /><br />
        Jaden Mei
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/lxyan636" target="_blank">
        <img src="https://github.com/lxyan636.png" width="60px" style="border-radius:50%;" /><br />
        Dori Lin
      </a>
    </td>
    
  </tr>
</table>

