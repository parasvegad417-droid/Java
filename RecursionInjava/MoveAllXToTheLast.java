package RecursionInjava;
// O(n);
public class MoveAllXToTheLast {
    public static void MoveAllX(String str, int ind, int count, String newString) {
        if (ind == str.length()) {

            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currCharacter = str.charAt(ind);
        if (currCharacter == 'x') {
            count++;
            MoveAllX(str, ind + 1, count, newString);
        } else {
            newString += currCharacter; // newStinrg = newstring+currCharacter
            MoveAllX(str, ind + 1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aboascalxxxsjdgxx";
        String newStr = "";
        MoveAllX(str, 0, 0, newStr);
    }
}
