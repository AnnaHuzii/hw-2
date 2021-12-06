public class NameEncoderDecoder {
    public String encode(String name){
        String namesNumbers =  name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + namesNumbers + "YESNOTFORYOU";
 
    }
    public String decode(String name){
        String namesNoPrefix = name.replace("NOTFORYOU", "")
                .replace("YES", "");
        String namesNotNumbers =  namesNoPrefix
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        return namesNotNumbers;
    }
   public static void main(String[] args) {
       NameEncoderDecoder names = new NameEncoderDecoder();
       //Should be true
       String  namesEncoder = names.encode("Crab");
       System.out.println("names.encode(\"Crab\") = " + namesEncoder);
 
       String  namesDecoder = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
       System.out.println("names.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + namesDecoder);
        }
}
