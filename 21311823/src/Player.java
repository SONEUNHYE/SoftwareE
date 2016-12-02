
public class Player {
	public String name;
	public String word;
	public String postWord;
	
	public Player() {}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getWord(){
		return word;
	}
	
	public void sayWord(String word){
		this.word = word;
	}
	
	public boolean succeed(String postWord){
		this.postWord = postWord;
		//System.out.println(word);
		
		char[] temp1 = postWord.toCharArray();
		char[] temp2 = word.toCharArray();
		
		//char[] charArray = postWord.toCharArray();
		//Character[] charObjectArray = ArrayUtils.toObject(charArray);
		//System.out.print(postWord.length());
		/*int len1 = postWord.length();
		int len2 = word.length();
		
		Character[] array1 = new Character[len1];
		for (int i = 0; i < len1 ; i++) {
		   array1[i] = new Character(postWord.charAt(i));
		}
		
		Character[] array2 = new Character[len2];
		for (int i = 0; i < len2 ; i++) {
		   array2[i] = new Character(word.charAt(i));
		}
		*/
		if(temp1[temp1.length-1] == temp2[0]){
			return true;
		}else if(temp1[temp1.length-1] == temp2[0]){
			return false;
		}
		return false;
	}
}
