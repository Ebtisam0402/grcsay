/**
 * The Duck class represents a duck and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Duck art sourced from https://www.asciiart.eu/animals/birds-water
 */
class Deer implements Animal {

    /**
     * Returns the ASCII art representation of the duck.
     *
     * @return A string containing the ASCII art of the duck.
     */
    @Override
    public String getAnimalArt() {
        return  "     \\   (             )\n" +
"      \\    `--(_   _)--\'\n" +
"       \\       Y-Y\n" +
"        \\     /@@ \\\n" +
"         \\   /     \\\n" +
"             `--\'.  \\             ,\n" +
"                 |   `.__________/)";
    }
  
    /**
     * Returns the name of the animal ("duck").
     * This method overrides the toString method to return the name of the duck.
     *
     * @return The string "duck" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "deer";
    }
  }
