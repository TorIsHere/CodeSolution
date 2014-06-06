public class BinaryCode {

	public String[] decode(String message) {
		int mesLength = message.length();
		int _mes[]  = new int[mesLength]; 
		int _ans1[] = new int[mesLength + 1]; // start from 0
		int _ans2[] = new int[mesLength + 1]; // start from 1
		for(int i = 0; i < mesLength; i++){
			_mes[i] = Integer.parseInt(message.substring(i,i+1));
		}
		if(mesLength == 1){
			if(_mes[0] == 1 || _mes[0] == 0){
				return new String[]{_mes[0] + "",_mes[0] + ""};
			}
			else{
				return new String[]{"NONE","NONE"};
			}
		}
		_ans1[0] = 0;
		_ans1[1] = _mes[0] - _ans1[0];
		_ans2[0] = 1;
		_ans2[1] = _mes[0] - _ans2[0];
		for(int i = 2; i < mesLength + 1; i++){
			// case p[0] = 0			
			_ans1[i]  = _mes[i-1] - _ans1[i-1] - _ans1[i-2];
			// case p[1] = 1
			_ans2[i]  = _mes[i-1] - _ans2[i-1] - _ans2[i-2];
		}
		boolean ans1_pos = true;
		boolean ans2_pos = true;
		String ans[] = new String[]{"",""}; 
		for(int j = 0; j < _ans1.length; j++){
			if(_ans1[j] > 1 || _ans1[j] < 0){
				ans[0] = "NONE";
				ans1_pos = false;
			}
			else if(ans1_pos && j < _ans1.length -1){
				ans[0] = ans[0] + "" +_ans1[j];
			}
			if(_ans2[j] > 1 || _ans2[j] < 0){
				ans[1] = "NONE";
				ans2_pos = false;
			}
			else if(ans2_pos && j < _ans1.length -1){
				ans[1] = ans[1] + "" +_ans2[j];
			}
		}
		return ans;
	}

}
