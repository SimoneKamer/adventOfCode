package demo.day4;

public class Occurrence implements Comparable<Occurrence> {
private String letter;
private Integer timesFound;

    Occurrence(String letter, Integer timesFound) {
        this.letter = letter;
        this.timesFound = timesFound;
    }

    @Override
    public int compareTo(Occurrence other) {
        int byTimesFound = other.getTimesFound().compareTo(this.getTimesFound());
        if (byTimesFound !=0) {
            return byTimesFound;
        }
        return this.getLetter().compareTo(other.getLetter());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Occurrence) {
            Occurrence other = (Occurrence) obj;
            if (this.letter.equals(other.getLetter())){
                return true;
            }
        }
        return false;
    }


    String getLetter() {
        return letter;
    }

    private Integer getTimesFound() {
        return timesFound;
    }
}
