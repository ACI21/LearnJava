package especiales;

import java.util.regex.Pattern;

public class pruebas {
	public static void main(String[] args) {
		/*
		 * string 190
integer 122
double 210
		 */
		String sentence = "602436426 861648772 433933447.476190629 "
				+ "211047202.971407775 731963982.822804784 430302156.982631932 "
				+ "880895728.923078537 y 389872647 237336357.506215306 743167393 "
				+ "zotwflegsjzzszfwtzfpn "
				+ "guemwrczqxycivdqnkypnxnnpmuduhznoaquudhavrncwfwujpcmiggjmcmkkbnjfeodxkgjgwxtrxingiqquhuwqhdswxx "
				+ "204276848.711107839 plwun 360472167 "
				+ "oildagktgdarveusjuqfistulgbglwmfgzrnyxryetwzhlnfewczmnoozlqatugmdjwgzcfabbkoxyjxkatjmpp "
				+ "237204770.263034618 331076462 563141230.724965413 "
				+ "888013973.984208672 423181584.617946075 "
				+ "pigpbzuzoootorzfskcwbqorvwdrmklfdczatfarqdkelalxz "
				+ "83003299.101430412 801006699.318863571 "
				+ "qlngdscrentzamztvvcvrtcmbqlizijdwtuyfrxolsysxlfebpolcmqsppmr "
				+ "723473541 636973764.395943269 xsngxhwvroandfqja 278612959.745808855 "
				+ "22601660.449449056 569503054 831721123 iceahgiakevsjoadmkfnk "
				+ "368799134.812811094 128792089.645010898 "
				+ "abzbrskzazjqtlkiqydptpkcsdgcqjshzndpvannrywfrnrghljjqrxpxnlkcwdpd "
				+ "604110036.42073915 nwwyoosxtnexeezjxouyfjhnwpqfxexzxfolpcfblpncetyhtrwxkbosccskxbuvcrosavnpxzoeoyyghbbqkflsutpwmhqwkvi "
				+ "774825524.380160952{-truncated-}";
String[] tokens = splitByWhiteSpace(sentence);
        
        int countS = 0;
        int countI = 0;
        int countD = 0;
        
        Pattern intPattern = Pattern.compile("^-?\\d+$");
        Pattern doublePattern = Pattern.compile("^-?\\d*\\.\\d+$");

        for (String token : tokens) {
            
            if (intPattern.matcher(token).matches()) {
                countI++;
            } else if (doublePattern.matcher(token).matches()) {
                countD++;
            } else {
                countS++;
            }
        }
        
        System.out.println("string "+countS);
        System.out.println("integer "+countI);
        System.out.println("double "+countD);
    }

    public static String[] splitByWhiteSpace(String input) {
        // Divide el string por uno o más espacios en blanco
        return input.split("\\s+");
    }
}
