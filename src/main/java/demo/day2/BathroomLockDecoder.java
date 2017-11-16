package demo.day2;

import java.util.Arrays;
import java.util.List;

public class BathroomLockDecoder {
    private int startPosition = 5;

    String findBathroomCode(String bathroomInstructions) {
        int currentPosition = startPosition;
        StringBuilder solution = new StringBuilder();
        List<String> separateInstructionLines = Arrays.asList(bathroomInstructions.split("\n"));
        for (int i = 0; i < separateInstructionLines.size(); i++) {
            List<String> separateInstructions = Arrays.asList(separateInstructionLines.get(i).split(""));
            for (String instruction : separateInstructions) {
                separateInstructionLines.get(i);
                currentPosition = followInstruction(instruction, currentPosition);
            }
            startPosition = currentPosition;
            solution.append(currentPosition);
        }
        return solution.toString();
    }

    private int followInstruction(String instruction, int currentPosition) {
        switch (instruction) {
            case "U":
                currentPosition = moveUp(currentPosition);
                break;
            case "D":
                currentPosition = moveDown(currentPosition);
                break;
            case "L":
                currentPosition = moveLeft(currentPosition);
                break;
            case "R":
                currentPosition = moveRight(currentPosition);
                break;
        }
        return currentPosition;
    }

    private int moveRight(int currentPosition) {
        if ((currentPosition == 3) || (currentPosition == 6) || (currentPosition == 9)) {
        } else {
            currentPosition++;
        }
        return currentPosition;
    }

    private int moveLeft(int currentPosition) {
        if ((currentPosition == 1) || (currentPosition == 4) || (currentPosition == 7)) {
        } else {
            currentPosition--;
        }
        return currentPosition;
    }

    private int moveDown(int currentPosition) {
        if (currentPosition < 7) {
            currentPosition += 3;
        }
        return currentPosition;
    }

    private int moveUp(int currentPosition) {
        if (currentPosition > 3) {
            currentPosition -= 3;
        }
        return currentPosition;
    }

    public static void main(String[] args) {
        BathroomLockDecoder decoder = new BathroomLockDecoder();
        String bathroomInstructions = "RDLULDLDDRLLLRLRULDRLDDRRRRURLRLDLULDLDLDRULDDLLDRDRUDLLDDRDULLLULLDULRRLDURULDRUULLLUUDURURRDDLDLDRRDDLRURLLDRRRDULDRULURURURURLLRRLUDULDRULLDURRRLLDURDRRUUURDRLLDRURULRUDULRRRRRDLRLLDRRRDLDUUDDDUDLDRUURRLLUDUDDRRLRRDRUUDUUULDUUDLRDLDLLDLLLLRRURDLDUURRLLDLDLLRLLRULDDRLDLUDLDDLRDRRDLULRLLLRUDDURLDLLULRDUUDRRLDUDUDLUURDURRDDLLDRRRLUDULDULDDLLULDDDRRLLDURURURUUURRURRUUDUUURULDLRULRURDLDRDDULDDULLURDDUDDRDRRULRUURRDDRLLUURDRDDRUDLUUDURRRLLRR\n" +
                "RDRRLURDDDDLDUDLDRURRLDLLLDDLURLLRULLULUUURLDURURULDLURRLRULDDUULULLLRLLRDRRUUDLUUDDUDDDRDURLUDDRULRULDDDLULRDDURRUURLRRLRULLURRDURRRURLDULULURULRRLRLUURRRUDDLURRDDUUDRDLLDRLRURUDLDLLLLDLRURDLLRDDUDDLDLDRRDLRDRDLRRRRUDUUDDRDLULUDLUURLDUDRRRRRLUUUDRRDLULLRRLRLDDDLLDLLRDDUUUUDDULUDDDUULDDUUDURRDLURLLRUUUUDUDRLDDDURDRLDRLRDRULRRDDDRDRRRLRDULUUULDLDDDUURRURLDLDLLDLUDDLDLRUDRLRLDURUDDURLDRDDLLDDLDRURRULLURULUUUUDLRLUUUDLDRUDURLRULLRLLUUULURLLLDULLUDLLRULRRLURRRRLRDRRLLULLLDURDLLDLUDLDUDURLURDLUURRRLRLLDRLDLDRLRUUUDRLRUDUUUR\n" +
                "LLLLULRDUUDUUDRDUUURDLLRRLUDDDRLDUUDDURLDUDULDRRRDDLLLRDDUDDLLLRRLURDULRUUDDRRDLRLRUUULDDULDUUUDDLLDDDDDURLDRLDDDDRRDURRDRRRUUDUUDRLRRRUURUDURLRLDURDDDUDDUDDDUUDRUDULDDRDLULRURDUUDLRRDDRRDLRDLRDLULRLLRLRLDLRULDDDDRLDUURLUUDLLRRLLLUUULURUUDULRRRULURUURLDLLRURUUDUDLLUDLDRLLRRUUDDRLUDUDRDDRRDDDURDRUDLLDLUUDRURDLLULLLLUDLRRRUULLRRDDUDDDUDDRDRRULURRUUDLUDLDRLLLLDLUULLULLDDUDLULRDRLDRDLUDUDRRRRLRDLLLDURLULUDDRURRDRUDLLDRURRUUDDDRDUUULDURRULDLLDLDLRDUDURRRRDLDRRLUDURLUDRRLUDDLLDUULLDURRLRDRLURURLUUURRLUDRRLLULUULUDRUDRDLUL\n" +
                "LRUULRRUDUDDLRRDURRUURDURURLULRDUUDUDLDRRULURUDURURDRLDDLRUURLLRDLURRULRRRUDULRRULDLUULDULLULLDUDLLUUULDLRDRRLUURURLLUUUDDLLURDUDURULRDLDUULDDRULLUUUURDDRUURDDDRUUUDRUULDLLULDLURLRRLRULRLDLDURLRLDLRRRUURLUUDULLLRRURRRLRULLRLUUDULDULRDDRDRRURDDRRLULRDURDDDDDLLRRDLLUUURUULUDLLDDULDUDUUDDRURDDURDDRLURUDRDRRULLLURLUULRLUDUDDUUULDRRRRDLRLDLLDRRDUDUUURLRURDDDRURRUDRUURUUDLRDDDLUDLRUURULRRLDDULRULDRLRLLDRLURRUUDRRRLRDDRLDDLLURLLUDL\n" +
                "ULURLRDLRUDLLDUDDRUUULULUDDDDDRRDRULUDRRUDLRRRLUDLRUULRDDRRLRUDLUDULRULLUURLLRLLLLDRDUURDUUULLRULUUUDRDRDRUULURDULDLRRULUURURDULULDRRURDLRUDLULULULUDLLUURULDLLLRDUDDRRLULUDDRLLLRURDDLDLRLLLRDLDRRUUULRLRDDDDRUDRUULDDRRULLDRRLDDRRUDRLLDUDRRUDDRDLRUDDRDDDRLLRDUULRDRLDUDRLDDLLDDDUUDDRULLDLLDRDRRUDDUUURLLUURDLULUDRUUUDURURLRRDULLDRDDRLRDULRDRURRUDLDDRRRLUDRLRRRRLLDDLLRLDUDUDDRRRUULDRURDLLDLUULDLDLDUUDDULUDUDRRDRLDRDURDUULDURDRRDRRLLRLDLU";
        System.out.println(decoder.findBathroomCode(bathroomInstructions));
    }
}