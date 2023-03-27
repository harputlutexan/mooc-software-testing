package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 1; i < str.length(); i++) {

            if(str.charAt(i) == 'g') {

                if (str.charAt(i-1) == 'g') { break; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { break; }
                if (i+1 == str.length() && str.charAt(i-1) == 'g') {
                    break;
                }
                return false;
            }
        }

        return true;

    }
}
