package tdd.unittesting;

public class DeleteDuplicates {
	
	public String delete_dup(String str){
		String res = "";
		int len = str.length();
		if( len == 0){
			res = res;
		}else if( len == 1){
			if(str.charAt(0) != 'A'){
				res = res + str.charAt(0);
			}
		}else if(len == 2){
			if(str.charAt(0) != 'A'){
				res = res + str.charAt(0);
			}
			if(str.charAt(1) != 'A'){
				res = res + str.charAt(1);
			}	
		}else{
			if(str.charAt(0) != 'A'){
				res = res + str.charAt(0);
			}
			if(str.charAt(1) != 'A'){
				res = res + str.charAt(1);
			}
			for(int i = 2; i < len; i++){
				res = res + str.charAt(i);
			}
			
		}
		return (res);
		
	}

}
