public class StringChanger {

    public String saveCharacter;
    public String stringSpited;
    public String[] split;

    public StringChanger(String myString){
        saveCharacter = "";
        stringSpited = "";
        split = myString.split("");
    }


    public String stringUpperCase(int valueJumpCase){

        for (int i = valueJumpCase -1; i < split.length ; i=i+valueJumpCase)
            if (Character.isUpperCase(split[i].charAt(0))) {
                saveCharacter = saveCharacter + split[i];
            }
        return saveCharacter;
    }

}
