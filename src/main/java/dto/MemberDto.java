package dto;

import java.io.Serializable;
									// 직렬화
public class MemberDto implements Serializable {

		private String id;
		private String pwd;
		private String name;
		private String email;
		private int auth; 		// 사용자: 3 관리자: 1
		
		
		
		public MemberDto() {
		
		}



		public MemberDto(String id, String pwd, String name, String email, int auth) {
			super();
			this.id = id;
			this.pwd = pwd;
			this.name = name;
			this.email = email;
			this.auth = auth;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getPwd() {
			return pwd;
		}



		public void setPwd(String pwd) {
			this.pwd = pwd;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public int getAuth() {
			return auth;
		}



		public void setAuth(int auth) {
			this.auth = auth;
		}
		
		
}
