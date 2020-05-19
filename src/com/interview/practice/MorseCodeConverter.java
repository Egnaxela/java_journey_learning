/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2020年5月12日 下午12:39:43  
 *  
 */  

package com.interview.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2020年5月12日 下午12:39:43  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2020年5月12日      Pluto       1.0         1.0 Version  
 */





public class MorseCodeConverter {

    private static final Map<Integer, String> alphabets = new HashMap<>();    // code point -> morse
    private static final Map<String, Integer> dictionaries = new HashMap<>(); // morse -> code point

    private static void registerMorse(Character abc, String dict) {
        alphabets.put(Integer.valueOf(abc), dict);
        dictionaries.put(dict, Integer.valueOf(abc));
    }

    static {
        // 注册摩斯密码的 以 0代替.  1代替- 
        registerMorse('A', "01");
        registerMorse('B', "1000");
        registerMorse('C', "1010");
        registerMorse('D', "100");
        registerMorse('E', "0");
        registerMorse('F', "0010");
        registerMorse('G', "110");
        registerMorse('H', "0000");
        registerMorse('I', "00");
        registerMorse('J', "0111");
        registerMorse('K', "101");
        registerMorse('L', "0100");
        registerMorse('M', "11");
        registerMorse('N', "10");
        registerMorse('O', "111");
        registerMorse('P', "0110");
        registerMorse('Q', "1101");
        registerMorse('R', "010");
        registerMorse('S', "000");
        registerMorse('T', "1");
        registerMorse('U', "001");
        registerMorse('V', "0001");
        registerMorse('W', "011");
        registerMorse('X', "1001");
        registerMorse('Y', "1011");
        registerMorse('Z', "1100");
        // Numbers
        registerMorse('0', "11111");
        registerMorse('1', "01111");
        registerMorse('2', "00111");
        registerMorse('3', "00011");
        registerMorse('4', "00001");
        registerMorse('5', "00000");
        registerMorse('6', "10000");
        registerMorse('7', "11000");
        registerMorse('8', "11100");
        registerMorse('9', "11110");
        // Punctuation
        registerMorse('.', "010101");
        registerMorse(',', "110011");
        registerMorse('?', "001100");
        registerMorse('\'', "011110");
        registerMorse('!', "101011");
        registerMorse('/', "10010");
        registerMorse('(', "10110");
        registerMorse(')', "101101");
        registerMorse('&', "01000");
        registerMorse(':', "111000");
        registerMorse(';', "101010");
        registerMorse('=', "10001");
        registerMorse('+', "01010");
        registerMorse('-', "100001");
        registerMorse('_', "001101");
        registerMorse('"', "010010");
        registerMorse('$', "0001001");
        registerMorse('@', "011010");
    }

    private final char dit; // short mark or dot
    private final char dah; // longer mark or dash
    private final char split;

    public MorseCodeConverter() {
        this('.', '-', '/');
    }

    public MorseCodeConverter(char dit, char dah, char split) {
        this.dit = dit;
        this.dah = dah;
        this.split = split;
    }

    public String encode(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text should not be null.");
        }
        StringBuilder morseBuilder = new StringBuilder();
        text = text.replaceAll(" ", "").toUpperCase();
        for (int i = 0; i < text.codePointCount(0, text.length()); i++) {
            int codePoint = text.codePointAt(text.offsetByCodePoints(0, i));
            String word = alphabets.get(codePoint);
            if (word == null) {
                word = Integer.toBinaryString(codePoint);
            }
            morseBuilder.append(word.replace('0', dit).replace('1', dah)).append(split);
        }
        return morseBuilder.toString();
    }

    public String decode(String morse) {
        if (morse == null) {
            throw new IllegalArgumentException("Morse should not be null.");
        }
        StringBuilder textBuilder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(morse, String.valueOf(split));
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().replace(dit, '0').replace(dah, '1');
            Integer codePoint = dictionaries.get(word);
            if (codePoint == null) {
                codePoint = Integer.valueOf(word, 2);
            }
            textBuilder.appendCodePoint(codePoint);
        }
        return textBuilder.toString();
    }
    

}
