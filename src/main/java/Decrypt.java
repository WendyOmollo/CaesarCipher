class Decrypt {
    private String response;
    private int key;
    private String decrypted = "";

    public Decrypt(String response , int key){
        this.key = key;
        this.response = response;
        
        for (int i = 0; i < response.length(); i++) {
            int ascii = (int) response.charAt(i);
            ascii -= key;
            Character ch = (char) ascii;
            decrypted += ch;
        }

    }
}
