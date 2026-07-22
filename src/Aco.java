
class Aco{
	private String password;
	
	public void setPassword(String pw) {
		if(pw != null && pw.length() <= 4) {
			
			password = pw;
		}
	}
}


