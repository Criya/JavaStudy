public class RandomCharacter {

    /* 生成一个介于ch1 和 ch2 的随机字母 */

    public static char getRandomCharacter(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /* 生成一个随机的小写字母 */

    public static char getRandomLowerCaseLetter() {

        return getRandomCharacter('a', 'z');

    }

}